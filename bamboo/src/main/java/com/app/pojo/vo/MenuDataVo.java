package com.app.pojo.vo;

import java.util.ArrayList;
import java.util.List;

import com.app.pojo.sys.SysMenu;

public class MenuDataVo {
	
	public List<SysMenu> getMenuData() {
		List<SysMenu> list = new ArrayList<>();
		SysMenu menu = new SysMenu();
		menu.setId(1);
		menu.setMenuCode("sys");
		menu.setMenuName("系统设置");
		menu.setIconFont("layui-icon-set");
		menu.setParentId(0);
		menu.setSort(6);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(2);
		menu.setMenuCode("sys-menu");
		menu.setMenuName("菜单管理");
		menu.setIconFont("layui-icon-component");
		menu.setParentId(1);
		menu.setSort(1);
		menu.setPath("/menu/index");
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(3);
		menu.setMenuCode("sys-role");
		menu.setMenuName("角色管理");
		menu.setIconFont("layui-icon-auz");
		menu.setParentId(1);
		menu.setSort(2);
		menu.setPath("/role/index");
		list.add(menu);
 
		menu = new SysMenu();
		menu.setId(4);
		menu.setMenuCode("sys-account");
		menu.setMenuName("用户管理");
		menu.setIconFont("layui-icon-user");
		menu.setParentId(1);
		menu.setSort(3);
		menu.setPath("/user/index");
		list.add(menu);
		
		
		menu = new SysMenu();
		menu.setId(5);
		menu.setMenuCode("sys-dict");
		menu.setMenuName("数据字典");
		menu.setIconFont("layui-icon-template-1");
		menu.setParentId(1);
		menu.setPath("/dict");
		menu.setSort(4);
		list.add(menu);
		
//		menu = new SysMenu();
//		menu.setId(6);
//		menu.setMenuCode("product");
//		menu.setMenuName("产品管理");
//		menu.setIconFont("layui-icon-picture");
//		menu.setParentId(0);
//		menu.setSort(2);
//		list.add(menu);
//		
//		menu = new SysMenu();
//		menu.setId(7);
//		menu.setMenuCode("product-brand");
//		menu.setMenuName("品牌");
//		//menu.setIconFont("layui-icon-carousel");
//		menu.setParentId(6);
//		menu.setPath("/productbrand");
//		menu.setSort(1);
//		list.add(menu);
		
//		menu = new SysMenu();
//		menu.setId(8);
//		menu.setMenuCode("product-item");
//		menu.setMenuName("产品");
//		menu.setIconFont("layui-icon-layouts");
//		menu.setParentId(6);
//		menu.setSort(2);
//		list.add(menu);
//		
//		menu = new SysMenu();
//		menu.setId(9);
//		menu.setMenuCode("product-item-list");
//		menu.setMenuName("产品列表");
//		menu.setIconFont("layui-icon-tabs");
//		menu.setParentId(8);
//		menu.setSort(3);
//		list.add(menu);
//		
//		menu = new SysMenu();
//		menu.setId(10);
//		menu.setMenuCode("product-item-admin");
//		menu.setMenuName("产品管理");
//		menu.setIconFont("layui-icon-water");
//		menu.setParentId(8);
//		menu.setSort(4);
//		list.add(menu);
//		
//		menu = new SysMenu();
//		menu.setId(11);
//		menu.setMenuCode("talk");
//		menu.setMenuName("评论管理");
//		menu.setIconFont("layui-icon-dialogue");
//		menu.setParentId(0);
//		menu.setSort(4);
//		list.add(menu);
//		
//		menu = new SysMenu();
//		menu.setId(12);
//		menu.setMenuCode("talk-list");
//		menu.setMenuName("评论列表");
//		menu.setIconFont("layui-icon-chart");
//		menu.setParentId(11);
//		menu.setSort(1);
//		list.add(menu);
//		
//		menu = new SysMenu();
//		menu.setId(13);
//		menu.setMenuCode("talk-idea");
//		menu.setMenuName("意见反馈");
//		menu.setIconFont("layui-icon-file");
//		menu.setParentId(11);
//		menu.setSort(2);
//		list.add(menu);
		return list;
	}

}
