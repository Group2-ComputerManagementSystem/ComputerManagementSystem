<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>排课</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="UTF-8"></script>
  </head>
  <body >
  <p>已有排课列表：</p>
  <form name="form1" id="form1" method="post" action="${pageContext.request.contextPath }/servlet/searchPassApplication.action">
   搜索:  课程编号：<input name="courseNo" type="text" id="courseNo" style='border:solid 1px #000000; color:#666666' size="12" />  
   课程名称：<input name="courseName" type="text" id="courseName" style='border:solid 1px #000000; color:#666666' size="12" />  
   机房编号：<input name="computerhouseNo" type="text" id="computerhouseNo" style='border:solid 1px #000000; color:#666666' size="12" /> 
   <input type="submit" name="Submit" value="查找" style='border:solid 1px #000000; color:#666666' />
</form>
<br>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF' align="center">课程编号</td>
    <td bgcolor='#CCFFFF' align="center">课程名称</td>
    <td bgcolor='#CCFFFF' align="center">机房编号</td>
    <td bgcolor='#CCFFFF' align="center">机房名称</td>
    <td bgcolor='#CCFFFF' align="center">上课时间</td>
    <td width="60" align="center" bgcolor="CCFFFF">操作</td>
  </tr>
  <c:forEach var="app" varStatus="item" items="${requestScope.appFlag }">
  <tr>
    <td width="30" align="center">${item.count }</td>
    <td align="center">${app.courseNo }</td>
    <td align="center">${app.courseName }</td>
    <td align="center">${app.computerhouseNo }</td>
    <td align="center">${app.computerhouseName }</td>
    <td align="center">${app.applicationTime }</td>
    <td width="60" align="center"><a href="${pageContext.request.contextPath }/servlet/delPassApplication.action?applicationId=${app.applicationId }" onclick="return confirm('真的要删除？')">删除</a></td>
  </tr>
  </c:forEach>
</table>
<br> 
  </body>
</html>
