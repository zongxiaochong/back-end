package com.app.service.sys.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.app.pojo.sys.SysMenu;
import com.app.pojo.vo.MenuDataVo;
import com.app.service.sys.IndexService;
import com.app.util.ComparatorUtils;


@Service
public class IndexServiceImpl implements IndexService {

	@Override
	public List<SysMenu> getSysMenuList() {
		MenuDataVo menu = new MenuDataVo();
		List<SysMenu> menuData = menu.getMenuData();
		List<SysMenu> rootMenu = menuData.stream()
					.filter(m -> m.getParentId() == 0).collect(Collectors.toList());
		
		Collections.sort(rootMenu, ComparatorUtils.menuOrder());
		rootMenu.stream().forEach(m -> {
			List<SysMenu> childList = getChild(m.getId(), menuData);
			m.setChild(childList);
		});
		return rootMenu;
	}
	
	/**
	 * 获取MenuId菜单下的子菜单
	 * @param MenuId
	 * @param allMenu
	 * @return
	 */
	public List<SysMenu> getChild(int MenuId, List<SysMenu> allMenu) {
		List<SysMenu> childList = new ArrayList<>();
		for (SysMenu nav : allMenu) {
			if (nav.getParentId() == MenuId) {
				childList.add(nav);
			}
		}
		for (SysMenu nav : childList) {
			nav.setChild(getChild(nav.getId(), allMenu));
		}
		Collections.sort(childList, ComparatorUtils.menuOrder());
		if (childList == null || childList.size() == 0) {
			childList = new ArrayList<>();
		}
		return childList;
	}







}




