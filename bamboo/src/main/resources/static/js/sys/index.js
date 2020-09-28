var is_remember = true;

$(function() {
	initPage.loadUser();
	initPage.loadMenu();

	
	
});


/**
 * 页面加载
 */
var initPage = {
		loadUser: function() {
			$("#userHead").attr('src', 'https://static.oschina.net/new-osc/img/logo_osc_simple.svg');
			$("#userName").text("诸葛亮");
		},
		
		loadMenu: function() {
			$.ajax({
				url: '/loadMenu',
				method: 'get',
				datatype: 'json',
				data: {},
				success: function(data) {
					var menuHtml = initPage.buildMenuHtml(data);
					$("#nav").html(menuHtml);
				},
				error: function(data) {
					
				}
			});
		},
		
		buildMenuHtml: function(data) {
			var menuHtml = '';
			for (var i = 0; i < data.length; i++) {
				var menuCode_1 = data[i].menuCode;
				var menuName_1 = data[i].menuName;
				var path_1 = data[i].path;
				var iconFont_1 = data[i].iconFont;
				var childList_1 = data[i].childList;
				menuHtml += '<li>';
				if (path_1) {
					menuHtml += '<a class="menu-first" onclick="xadmin.add_tab(\'' + menuName_1 + '\', \'' + path_1 + '\')">';
				} else {
					menuHtml += '<a class="menu-first" href="javascript:;">';
				}
				if (iconFont_1) {
					menuHtml += '<i class="layui-icon ' + iconFont_1 + ' left-nav-li"></i>'
				} else {
					menuHtml += '<i class="layui-icon menu-cite left-nav-li"></i>'
				}
				menuHtml += '<cite>' + menuName_1 + '</cite>';
				if(childList_1) {
					menuHtml += '<i class="layui-icon layui-icon-addition nav_right"></i>';
				} else {
					menuHtml += '<i class="layui-icon nav_right"></i>';
				}
				menuHtml += '</a>';
				if(childList_1 && $.trim(childList_1.length) > 0) {
					menuHtml += '<ul class="sub-menu">';
					for (var j = 0; j < childList_1.length; j++) {
						var menuCode_2 = childList_1[j].menuCode;
						var menuName_2 = childList_1[j].menuName;
						var path_2 = childList_1[j].path;
						var iconFont_2 = childList_1[j].iconFont;
						var childList_2 = childList_1[j].childList;
						menuHtml += '<li>';
						if (path_2) {
							menuHtml += '<a onclick="xadmin.add_tab(\'' + menuName_2 + '\', \'' + path_2 + '\')">';
						} else {
							menuHtml += '<a href="javascript:;">';
						}
						if (iconFont_2) {
							menuHtml += '<i class="layui-icon ' + iconFont_2 + '"></i>'
						} else {
							menuHtml += '<i class="layui-icon menu-cite"></i>'
						}
						menuHtml += '<cite>' + menuName_2 + '</cite>';
						if(childList_2 && $.trim(childList_2) != '') {
							menuHtml += '<i class="layui-icon layui-icon-addition nav_right"></i>';
						} else {
							menuHtml += '<i class="layui-icon nav_right"></i>';
						}
						menuHtml += '</a>';
						if(childList_2 && $.trim(childList_2.length) > 0) {
							menuHtml += '<ul class="sub-menu">';
							for (var k = 0; k < childList_2.length; k++) {
								var menuCode_3 = childList_2[k].menuCode;
								var menuName_3 = childList_2[k].menuName;
								var path_3 = childList_2[k].path;
								var icon_3 = childList_2[k].icon;
								var childList_3 = childList_2[k].childList;
								menuHtml += '<li>';
								if (path_3) {
									menuHtml += '<a onclick="xadmin.add_tab(\'' + menuName_3 + '\', \'' + path_3 + '\')">';
								} else {
									menuHtml += '<a href="javascript:;">';
								}
								if (iconFont_3) {
									menuHtml += '<i class="layui-icon ' + iconFont_3 + '"></i>'
								} else {
									menuHtml += '<i class="layui-icon menu-cite"></i>'
								}
								menuHtml += '<cite>' + menuName_3 + '</cite>';
								menuHtml += '</a>';
								menuHtml += '</li>';
							}
							menuHtml += '</ul>';
						}
						menuHtml += '</li>';
					}
					menuHtml += '</ul>';
				}
				menuHtml += '</li>';
			}
			return menuHtml;
		}
		 



		
}

 