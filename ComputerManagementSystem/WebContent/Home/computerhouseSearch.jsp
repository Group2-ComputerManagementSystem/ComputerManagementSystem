<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <title>机房信息</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
  </head>
  <body >
  <p>已有机房信息查询列表：</p>
  <form name="form1" id="form1" method="post" action="">
   搜索:  第<input name="start_week" type="text" id="start_week" style='border:solid 1px #000000; color:#666666' size="12" />
   周到<input name="end_week" type="text" id="end_week" style='border:solid 1px #000000; color:#666666' size="12" />周
   星期<select name="day" id="day">
    <option value="1">1</option>
  	<option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
   </select>
   第<select name="jieshu" id="jieshu">
    <option value="1">1</option>
  	<option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
   </select>节
   <input type="submit" name="Submit" value="查找" style='border:solid 1px #000000; color:#666666' /> 
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align="center" bgcolor='#CCFFFF'>机房号</td>
    <td align="center" bgcolor='#CCFFFF'>机房名称</td>
    <td align="center" bgcolor='#CCFFFF'>容量</td>
  
    <td width="60" align="center" bgcolor="CCFFFF">操作</td>
  </tr>
  <tr>
    <td width="30" align="center"></td>
    <td></td>
    <td></td>
    <td></td>
    <td width="60" align="center"><a href="jiaoshishenqing_add.jsp?id=">申请机房</a></td>
  </tr>
</table>
<br>
  </body>
</html>