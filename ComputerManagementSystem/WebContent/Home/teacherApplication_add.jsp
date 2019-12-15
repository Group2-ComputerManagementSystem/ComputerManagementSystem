<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    
    <title>教师申请</title>
	
	<LINK href="css.css" type=text/css rel=stylesheet>
    <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	   
  </head>
  <body >
 <form  action="jiaoshishenqing_add.jsp?f=f&id="  method="post" name="form1"  onsubmit="return checkform();">
  添加教师申请:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">
		<tr><td  width="200">机房编号：</td><td><input name='computerhouseNo' type='text' id='computerhouseNo' value='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>
		<tr><td  width="200">机房名称：</td><td><input name='computerhouseName' type='text' id='computerhouseName' value='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>
		<tr><td  width="200">教师号：</td><td><input name='teacherNo' type='text' id='teacherNo' style='border:solid 1px #000000; color:#666666' value='${sessionScope.teacher.teacherNo }' readonly="readonly" /></td></tr>
		<tr><td  width="200">教师姓名：</td><td><input name='teacherName' type='text' id='teacherName' value='${sessionScope.teacher.teacherName }' style='border:solid 1px #000000; color:#666666' readonly="readonly" /></td></tr>
    	<tr><td  width="200">课程号：</td><td><input name='courseNo' type='text' id='courseNo' value='' style='border:solid 1px #000000; color:#666666' /></td></tr>
		<tr><td  width="200">课程名称：</td><td><input name='courseName' type='text' id='courseName' value='' style='border:solid 1px #000000; color:#666666' /></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交"  style='border:solid 1px #000000; color:#666666' />
      <input type="reset" name="Submit2" value="重置" style='border:solid 1px #000000; color:#666666' /></td>
    </tr>
  </table>
</form>
  </body>
</html>