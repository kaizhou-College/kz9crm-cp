package com.cp.entity;

public class SysRolePage extends SysRole{
	/*每页显示多少条数据*/
	private int pageSize =1;
	/*当前页数*/
	private int curPage = 1;
	/*总页数*/
	private int maxPage;
	/*总条数*/
	private int Count;
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
}
