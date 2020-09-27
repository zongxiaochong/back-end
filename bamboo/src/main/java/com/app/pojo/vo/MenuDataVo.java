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
		menu.setIcon("layui-icon-set");
		menu.setParentId(0);
		menu.setSort(6);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(2);
		menu.setMenuCode("sys-menu");
		menu.setMenuName("菜单管理");
		menu.setIcon("layui-icon-tabs");
		menu.setParentId(1);
		menu.setSort(1);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(3);
		menu.setMenuCode("sys-role");
		menu.setMenuName("角色管理");
		menu.setIcon("layui-icon-tabs");
		menu.setParentId(1);
		menu.setSort(2);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(4);
		menu.setMenuCode("sys-account");
		menu.setMenuName("用户管理");
		menu.setIcon("layui-icon-tabs");
		menu.setParentId(1);
		menu.setSort(3);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(5);
		menu.setMenuCode("sys-dict");
		menu.setMenuName("数据字典");
		menu.setIcon("layui-icon-list");
		menu.setParentId(1);
		menu.setSort(4);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(6);
		menu.setMenuCode("product");
		menu.setMenuName("产品管理");
		menu.setIcon("layui-icon-gift");
		menu.setParentId(0);
		menu.setSort(2);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(7);
		menu.setMenuCode("product-brand");
		menu.setMenuName("品牌");
		menu.setIcon("layui-icon-list");
		menu.setParentId(6);
		menu.setSort(1);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(8);
		menu.setMenuCode("product-item");
		menu.setMenuName("产品");
		menu.setIcon("layui-icon-addition");
		menu.setParentId(6);
		menu.setSort(2);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(9);
		menu.setMenuCode("product-item-list");
		menu.setMenuName("产品列表");
		menu.setIcon("layui-icon-list");
		menu.setParentId(8);
		menu.setSort(3);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(10);
		menu.setMenuCode("product-item-admin");
		menu.setMenuName("产品管理");
		menu.setIcon("layui-icon-list");
		menu.setParentId(8);
		menu.setSort(4);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(11);
		menu.setMenuCode("talk");
		menu.setMenuName("评论管理");
		menu.setIcon("layui-icon-reply-fill");
		menu.setParentId(0);
		menu.setSort(4);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(12);
		menu.setMenuCode("talk-list");
		menu.setMenuName("评论列表");
		menu.setIcon("layui-icon-list");
		menu.setParentId(11);
		menu.setSort(1);
		list.add(menu);
		
		menu = new SysMenu();
		menu.setId(13);
		menu.setMenuCode("talk-idea");
		menu.setMenuName("意见反馈");
		menu.setIcon("layui-icon-list");
		menu.setParentId(11);
		menu.setSort(2);
		list.add(menu);
		return list;
	}

}
