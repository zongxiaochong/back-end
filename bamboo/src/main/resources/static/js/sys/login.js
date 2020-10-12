$(function(){
	initPage();
});

function initPage() {
	var account = $("input[name='account']").val();
	if(account) {
		$("input[name='account']").addClass("input-field-v");
		$("input[name='account']").siblings(".input-label").addClass("input-label-v");
	}
	$("input[name='password']").val("");
	$("input[name='validCode']").val("");
	$(".messge").text("");
	
	var $validCode = localStorage.getItem("validCode");
	if($validCode) {
		clearValidCode();
		$(".valid-img").attr("alt", $validCode);
		$(".valid-img").attr("src", "data:image/png;base64," + localStorage.getItem("validCodeImage"));
		$(".valid-code").show();
	} else {
		$(".valid-code").hide();
	}
}
 
function login() {
	var account = $("input[name='account']").val();
	var password = $("input[name='password']").val();
	if(!account) {
		$(".messge").text("请输入用户名！");
		loadValidCode();
		 $("input[name='account']").focus();
		return false;
	}
	if(!password) {
		$(".messge").text("请输入密码！");
		loadValidCode();
		$("input[name='password']").focus();
		return false;
	}
	var validCode = localStorage.getItem("validCode");
	var inputValidCode = $("input[name='validCode']").val();
	if(validCode) {
		if(inputValidCode.toLowerCase() != validCode.toLowerCase()) {
			$(".messge").text("验证码不正确！");
			$("input[name='validCode']").focus();
			return false;
		}
	} 
	
	$.ajax({
		url: "/doLogin",
		method: 'get',
		datatype: 'json',
		data: {"account": account, "password": password, "validCode": validCode},
		success: function(data) {
			if (data.message) {
				$(".messge").text(data.message);
				loadValidCode();
				return;
			}
			loginSuccess();
			location.href = "/sys/index";
		},
		error: function(data) {
			$(".messge").text("验证码不正确！");
		}
	});
}


function loadValidCode() {
	localStorage.removeItem("validCode");
	localStorage.removeItem("validCodeImage");
	$.ajax({
		url: "/getValidCode",
		method: 'get',
		datatype: 'json',
		data: {},
		success: function(data) {
			$(".valid-img").attr("src", "data:image/png;base64," + data.data.validateCodeImage);
			$(".valid-img").attr("alt", data.data.validateCode);
			
			localStorage.setItem("validCode", data.data.validateCode);
			localStorage.setItem("validCodeImage", data.data.validateCodeImage);
			clearValidCode();
		},
		error: function(data) {
			
		}
	});
	$(".valid-code").show();
}


function clearValidCode() {
	setTimeout(function(){ 
		localStorage.removeItem("validCode");
		localStorage.removeItem("validCodeImage");
	}, 60000);
}

function changeStyle(_this) {
	var v = $.trim($(_this).val());
	if (v) {
		$(_this).addClass("input-field-v");
		$(_this).siblings(".input-label").addClass("input-label-v");
	} else {
		$(_this).removeClass("input-field-v");
		$(_this).siblings(".input-label").removeClass("input-label-v");
	}
}

function loginSuccess() {
	$(".messge").text("");
	$("input[name='validCode']").val("");
	$("input[name='validCode']").removeClass("input-field-v");
	$("input[name='validCode']").siblings(".input-label").removeClass("input-label-v");
	localStorage.removeItem("validCode");
	localStorage.removeItem("validCodeImage");
	$(".valid-code").hide();
}

$(document).keydown(function(event) {
	if(event.keyCode == 13) {
		login();
	}
});



