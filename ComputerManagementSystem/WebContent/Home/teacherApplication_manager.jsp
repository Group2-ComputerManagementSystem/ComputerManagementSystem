<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>教师申请</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
  </head>


  <body >
  <p>我的申请列表：</p>
<table width="100%" border="1" text-align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td width="10%" bgcolor='#CCFFFF' align="center">机房号</td>
    <td width="15%" bgcolor='#CCFFFF' align="center">机房名称</td>
    <td width="10%" bgcolor='#CCFFFF' align="center">课程号</td>
    <td width="15%" bgcolor='#CCFFFF' align="center">课程名称</td>
    <td bgcolor='#CCFFFF' align='center'>使用日期</td>
    <td bgcolor='#CCFFFF' align="center">状态</td>
    <td bgcolor='#CCFFFF' align='center'>回复</td>
    <td width="60" align="center" bgcolor="CCFFFF">操作</td>
  </tr>
  <c:forEach var="application" items="${requestScope.appList }" varStatus="item">
  <tr>
    <td align="center">${item.count }</td>
    <td align="center">${application.computerhouseNo }</td>
 	<td align="center">${application.computerhouseName }</td>
 	<td align="center">${application.courseNo }</td>
 	<td align="center">${application.courseName }</td>
 	<td align="center">${application.applicationTime }</td>
 	<td align="center">${application.applicationState }</td>
	<td align='center'>${application.applicationReply }</td>
    <td align="center"><a href="${pageContext.request.contextPath }/servlet/delApplication.action?applicationId=${application.applicationId}" onClick="return confirm('真的要删除？')">删除</a></td>
  </tr>
  </c:forEach>
</table><br>
  </body>
</html>