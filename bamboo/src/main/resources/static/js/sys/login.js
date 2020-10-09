$(function(){
	initPage();
});


function initPage() {
	var $validCode = localStorage.getItem("validCode");
	if($validCode) {
		clearValidCode();
		$(".valid-img").attr("alt", $validCode);
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
		return false;
	}
	if(!password) {
		$(".messge").text("请输入密码！");
		loadValidCode();
		return false;
	}
	
	var validCode = $("input[name='validCode']").val();
	var $validCode = localStorage.getItem("validCode");
	if ($validCode || validCode) {
		if (validCode != $validCode) {
			$(".messge").text("验证码不正确！");
			loadValidCode();
			return false;
		}
	} 
	
	alert("success!");
//	location.href="/home";
}


function loadValidCode() {
	localStorage.removeItem("validCode");
	$.ajax({
		url: "getValidCode",
		method: 'get',
		datatype: 'json',
		data: {},
		success: function(data) {
			console.log(data);
			$(".valid-img").attr("alt", data.data);
			localStorage.setItem("validCode", data.data);
			clearValidCode();
		},
		error: function(data) {
			
		}
	});
	$(".valid-code").show();
}


function clearValidCode() {
	setTimeout(function(){ localStorage.removeItem("validCode") }, 60000);
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

