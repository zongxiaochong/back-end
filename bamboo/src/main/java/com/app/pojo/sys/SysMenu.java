package com.app.pojo.sys;

import java.util.Date;
import java.util.List;

public class SysMenu {
	
	private Integer id;
	
	private String menuCode;
	
	private String menuName;
	
	private String iconFont;
	
	private String path;
	
	private String url;
	
	private Integer parentId;
	
	private int level;
	
	private int sort;
	
	private List<SysMenu> child;
	
	private String creator;
	
	private Date createTime;
	
	private String createDate;
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getIconFont() {
		return iconFont;
	}

	public void setIconFont(String iconFont) {
		this.iconFont = iconFont;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public List<SysMenu> getChildList() {
		return child;
	}

	public void setChild(List<SysMenu> child) {
		this.child = child;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
