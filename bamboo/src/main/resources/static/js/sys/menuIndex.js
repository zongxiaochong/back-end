$(function() {
	loadMenu();
});
var treeCount = 0;
function loadMenu() {
	//调用后台接口 数据
	$.ajax({
		url: '/sys/menu/getMenuByID',
		type: 'get',
		contentType:"application/json;charset=utf-8",
		datatype: 'json',
		data: {},
		success: function(data) {
			//构建显示元素
			 var mm = buildData(data.data.menu, true);
			 $("#rolemenu").html(mm);
		},
		error: function(data) {
		}
	});
}
//构建显示元素: flag 判断子菜单的子菜单是否有值，有值时添加 <ul>元素
function buildData(menuData, flag) {
	treeCount++; //这个计算器计划是样式class, 菜单缩进
	var html = "";
	//遍历菜单
	for(var i = 0; i < menuData.length; i++) {
		var menu = menuData[i];
		var menuName = menu.menuName; // 菜单名称
		var privileges = menu.privileges; //菜单权限
		var roleIsChk = menu.roleIsChk; //角色是否勾选权限
		
		html += '<li class="li-' + treeCount + '">' + menuName; //添加元素
		// 判断菜单的权限是否有值。有值的时候添加权限显示元素
		if (privileges && privileges.length > 0) {
			html += buildPrivileges(privileges);
		}
		//结束菜单标签
		html += '</li>';
		//下级菜单
		var children = menu.children;
		// 递归子菜单； children.children 是下级菜单的下级菜单，（树）（加if判断做优化）
		html += buildData(children, children.children != null);
	}
	if(flag) {
		html = '<ul>' + html + '</ul>';
	}
	return html;
}

// 添加菜单权限元素
function buildPrivileges(privileges) {
	var html = '<br><dl>'
	for(var i = 0; i < privileges.length; i++) {
		var pv = privileges[i];
		var pCodeName = pv.pCodeName;
		var roleIsChk = pv.roleIsChk;
		html += '<input type="checkbox"/>' + pCodeName + '   ';
	}
	html += '</dl>'
	return html;
}




