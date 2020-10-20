package com.app.common;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;

/**
 * 分页参数
 * @author weizong
 *
 */
public class PageParams {

	private int pageSize;
	
	private int pageNumber;
	
	private int pageCount;
	
	private Object rows;
	
	private String sortField;

	private String sortKey;
	
	private Integer total;
	
	
	public PageParams() {
		if (this.pageNumber == 0) {
			this.pageNumber = 1;
		}
		if (this.pageSize == 0) {
			this.pageSize = 10;
		}
	}
	
	public PageParams(HttpServletRequest request) {
		String $pageNumber = request.getParameter("pageNumber");
		String $pageSize = request.getParameter("pageSize");
		if (StringUtils.isNotBlank($pageNumber) 
				&& StringUtils.isNotBlank($pageSize)) {
			this.pageNumber = Integer.parseInt($pageNumber);
			this.pageSize = Integer.parseInt($pageSize);
		}
	}
	
	public PageParams(int pageNumber, int pageSize) {
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		if (pageNumber == 0) {
			this.pageNumber = 1;
		}
		if (pageSize == 0) {
			this.pageSize = 10;
		}
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int total) {
		this.pageCount = total % pageSize;
		if (total % this.pageSize != 0) {
			this.pageCount = total % pageSize + 1;
		}
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortKey() {
		return sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	
	/**
	 * 获取Oracle 数据库分页最大Rownum
	 * @return
	 */
	public int getOraclePageMaxRownum() {
		int rownum = this.pageNumber * this.pageSize;
		return rownum;
	}
	
	/**
	 * 获取Oracle 数据库分页最小Rownum
	 * @return
	 */
	public int getOraclePageMinRownum() {
		int rownum = (this.pageNumber - 1) * this.pageSize;
		return rownum;
	}
	
	/**
	 * MySQL 分页开始行数
	 * @return
	 */
	public int getMySqlPageStart() {
		return (pageNumber - 1) * pageSize;
	}
	
}
