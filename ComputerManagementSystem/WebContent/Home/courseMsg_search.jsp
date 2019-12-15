<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>课程信息</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="UTF-8"></script>
  </head>
  <body >
  <p>已有课程信息列表：</p>
  <form name="form1" id="form1" method="post" action="">
   搜索:  课程编号：<input name="kechenghao" type="text" id="kechenghao" style='border:solid 1px #000000; color:#666666' size="12" />  
   课程名称：<input name="kechengmingcheng" type="text" id="kechengmingcheng" style='border:solid 1px #000000; color:#666666' size="12" />  
   专业：<input name="zhuanye" type="text" id="zhuanye" style='border:solid 1px #000000; color:#666666' size="12" />
   <input type="submit" name="Submit" value="查找" style='border:solid 1px #000000; color:#666666' />
</form>
<br>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30px" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF' align="center">课程编号</td>
    <td bgcolor='#CCFFFF' align="center">课程名称</td>
    <td bgcolor='#CCFFFF' align="center">专业</td>
    <td width="80px" align="center" bgcolor="#CCFFFF">操作</td>
  </tr>
  <tr>
<td width="30" align="center"></td>
    <td></td>
    <td></td>
    <td></td>
    <td width="60" align="center"><a href="kechengxinxi_updt.jsp?id=">修改</a>  <a href="kechengxinxi_list.jsp?scid=" onclick="return confirm('真的要删除？')">删除</a> </td>
  </tr>
</table>
<br>
  </body>
</html>