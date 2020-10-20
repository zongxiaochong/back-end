package com.app.controller.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.ResponseData;
import com.app.pojo.sys.SysMenu;
import com.app.service.sys.MenuService;

@Controller
@RequestMapping("/sys/menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/index")
	public String sysMenu() {
		return "sys/menuIndex";
	}

	
	@GetMapping("/getMenu")
	@ResponseBody
	public Object getMenu() {
		List<SysMenu> sysMenuList = menuService.getSysMenuList();
		return sysMenuList;
	}
	
	@GetMapping("/getMenuByID")
	@ResponseBody
	public Object ss() {
		List<Map<String, Object>> privileges = new ArrayList<>();
		Map<String, Object> map1= new HashMap<>();
		map1.put("menuId", 3);
		map1.put("pId", 8);
		map1.put("pCode", "OP_View");
		map1.put("pCodeName", "浏览");
		map1.put("roleIsChk", 0);
		privileges.add(map1);
		Map<String, Object> map2= new HashMap<>();
		map2.put("menuId", 3);
		map2.put("pId", 8);
		map2.put("pCode", "OP_View");
		map2.put("pCodeName", "新增");
		map2.put("roleIsChk", 0);
		privileges.add(map2);
		Map<String, Object> map3= new HashMap<>();
		map3.put("menuId", 3);
		map3.put("pId", 8);
		map3.put("pCode", "OP_View");
		map3.put("pCodeName", "修改");
		map3.put("roleIsChk", 0);
		privileges.add(map3);
		Map<String, Object> map4= new HashMap<>();
		map4.put("menuId", 3);
		map4.put("pId", 8);
		map4.put("pCode", "OP_View");
		map4.put("pCodeName", "删除");
		map4.put("roleIsChk", 0);
		privileges.add(map4);
		
		List<Map<String, Object>> mlist = new ArrayList<>();
		
		List<Map<String, Object>> children = new ArrayList<>();
		Map<String, Object> mapc1= new HashMap<>();
		mapc1.put("menuId", 3);
		mapc1.put("menuCode", "MN_User_Org");
		mapc1.put("menuName", "组织架构");
		mapc1.put("parentId", 2);
		mapc1.put("roleIsChk", 0);
		mapc1.put("privileges", privileges);
		mapc1.put("children", children);
		
		mlist.add(mapc1);
		
		Map<String, Object> mapc2= new HashMap<>();
		mapc2.put("menuId", 4);
		mapc2.put("menuCode", "MN_Acc_Role");
		mapc2.put("menuName", "角色管理");
		mapc2.put("parentId", 2);
		mapc2.put("roleIsChk", 0);
		mapc2.put("privileges", privileges);
		mapc2.put("children", children);
		mlist.add(mapc2);
		
		Map<String, Object> mapc3= new HashMap<>();
		mapc3.put("menuId", 5);
		mapc3.put("menuCode", "MN_Acc_Account");
		mapc3.put("menuName", "用户管理");
		mapc3.put("parentId", 2);
		mapc3.put("roleIsChk", 0);
		mapc3.put("privileges", privileges);
		mapc3.put("children", children);
		mlist.add(mapc3);
		
		Map<String, Object> mapc4= new HashMap<>();
		mapc4.put("menuId", 6);
		mapc4.put("menuCode", "MN_Acc_Security");
		mapc4.put("menuName", "账号安全");
		mapc4.put("parentId", 2);
		mapc4.put("roleIsChk", 0);
		mapc4.put("privileges", privileges);
		mapc4.put("children", children);
		mlist.add(mapc4);
		
		Map<String, Object> mapc5= new HashMap<>();
		mapc5.put("menuId", 2);
		mapc5.put("menuCode", "MN_Sys");
		mapc5.put("menuName", "系统设置");
		mapc5.put("parentId", 2);
		mapc5.put("roleIsChk", 0);
		mapc5.put("privileges", new ArrayList<>());
		mapc5.put("children", mlist);
		
		List<Map<String, Object>> mlist1 = new ArrayList<>();
		mlist1.add(mapc5);
		
		Map<String, Object> map = new HashMap<>();
		map.put("menu", mlist1);
		
		ResponseData result = new ResponseData();
		result.setData(map);
		result.setStatus(200);
		return result;
	}
	
	
	
}
