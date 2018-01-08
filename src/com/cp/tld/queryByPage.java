package com.cp.tld;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class queryByPage extends SimpleTagSupport{
	private int index;
	private int max;
	private String uri;
	public void doTag() throws JspException, IOException {
		/*<div>
  			<c:if test="${index!=1}">
  				<a href="ShowPage?index=1">首页</a>
  				<a href="ShowPage?index=${index-1}">上一页</a>
  			</c:if>
  			<c:if test="${index!=max}">
  				<a href="ShowPage?index=${max}">末页</a>
  				<a href="ShowPage?index=${index+1}">下一页</a>
  			</c:if>
  		</div>*/
		StringBuffer str = new StringBuffer();
		str.append("<div>");
		if(index!=1){
			str.append("<a href='"+uri+"?index=1'>首页</a>");
			str.append("<a href='"+uri+"?index="+(index-1)+"'>上一页</a>");
		}
		if(index!=max){
			str.append("<a href='"+uri+"?index="+max+"'>末页</a>");
			str.append("<a href='"+uri+"?index="+(index+1)+"'>下一页</a>");
		}
		str.append(index+"/"+max);
		str.append("</div>");
		JspWriter out = getJspContext().getOut();
		out.print(str.toString());
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
