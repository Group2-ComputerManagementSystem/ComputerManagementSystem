<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Language" content="zh-cn">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
  
<frameset rows="120,*" frameborder=0 border="0" framespacing="0">
  <frame src="top.jsp" name="topFrame" scrolling="NO" noresize>
  <frameset cols="200,*" frameborder="0" border="0" framespacing="0">
		<frame src="left.jsp" name="leftFrame" noresize scrolling="YES">
		<frame src="center.jsp" name="mainFrame">
  </frameset>
</frameset>
</html>