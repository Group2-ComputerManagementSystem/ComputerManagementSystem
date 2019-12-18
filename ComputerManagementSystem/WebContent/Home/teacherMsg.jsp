<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    
    <title>教师信息</title>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="UTF-8"></script>
	<script type="text/javascript" src="js/popup.js"></script>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

  <body >
  <form  action="${pageContext.request.contextPath }/servlet/updateteacher.action"  method="post" name="f1"  onsubmit="return checkform();">
  修改教师信息:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
     <input name="teacherId" type="hidden" value="${sessionScope.teacher.teacherId }"/>
     <tr><td>教师号：</td><td><input name='teacherNo' type='text' id='teacherNo' value='${sessionScope.teacher.teacherNo }' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>教师姓名：</td><td><input name='teacherName' type='text' id='teacherName' value='${sessionScope.teacher.teacherName }' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>密码：</td><td><input name='teacherPwd' type='text' id='teacherPwd' value='${sessionScope.teacher.teacherPwd }' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>性别：</td><td><select name='teacherSex' id='teacherSex'><option value="男">男</option><option value="女">女</option></select></td></tr>
     <tr><td>出生年月：</td><td><input name='teacherBirthday' type='text' id='teacherBirthday' value='${sessionScope.teacher.teacherBirthday }' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" readonly='readonly'  /></td></tr>
     <tr><td>工龄：</td><td><input name='teacherSeniority' type='text' id='teacherSeniority' value='${sessionScope.teacher.teacherSeniority }' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>职称：</td><td><input name='teacherTitle' type='text' id='teacherTitle' value='${sessionScope.teacher.teacherTitle }' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>手机：</td><td><input name='teacherPhone' type='text' id='teacherPhone' value='${sessionScope.teacher.teacherPhone }' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>邮箱：</td><td><input name='teacherEmail' type='text' id='teacherEmail' value='${sessionScope.teacher.teacherEmail }' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>备注：</td><td><textarea name='teacherRemarks' cols='50' rows='5' id='teacherRemarks' style='border:solid 1px #000000; color:#666666'>${sessionScope.teacher.teacherRemarks }</textarea></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onClick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>

