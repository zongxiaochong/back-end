$(function(){
	$(".valid-code").hide();
	
});

 
function login() {
//	location.href="/home";
	var account = $("input[name='account']").val();
	
	if(!account) {
		loadValidCode();
		return false;
	}
}


function loadValidCode() {
	$.ajax({
		url: "getValidCode",
		method: 'get',
		datatype: 'json',
		data: {},
		success: function(data) {
			console.log(data);
			$(".valid-img").attr("alt", data.data);
		},
		error: function(data) {
			
		}
	});
	$(".valid-code").show();
}

