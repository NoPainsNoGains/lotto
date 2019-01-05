<%@ page language="java" pageEncoding="utf-8" import="java.util.*"%>
<%@ page import="com.synnex.dptool.po.*"%>

<%
	User user = (User) session.getAttribute("user");
	if (user == null) {
		out.println("<script language='JavaScript'>");
		out.println("window.alert('Please login at first !')");
		out.println("window.location.href='login.html'");
		out.println("</script>");
	}
%>