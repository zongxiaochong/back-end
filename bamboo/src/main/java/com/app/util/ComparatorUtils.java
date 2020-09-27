package com.app.util;

import java.util.Comparator;

import com.app.pojo.sys.SysMenu;

/**
 * 排序工具类
 * @author weizong
 *
 */
public class ComparatorUtils {

	/**
	 * 菜单排序 -sort
	 * @return
	 */
	public static Comparator<SysMenu> menuOrder() {
		Comparator<SysMenu> comparator = new Comparator<SysMenu>() {
			@Override
			public int compare(SysMenu o1, SysMenu o2) {
				if (o1.getSort() != o2.getSort()) {
					return o1.getSort() - o2.getSort();
				}
				return 0;
			}
		};
		return comparator;
	}
	
	
}
