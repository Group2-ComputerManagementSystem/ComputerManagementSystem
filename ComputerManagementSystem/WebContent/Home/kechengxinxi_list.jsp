<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>
    <title>�γ���Ϣ</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
  </head>
  <body >
  <p>���пγ���Ϣ�б�</p>
  <form name="form1" id="form1" method="post" action="">
   ����:  �γ̱�ţ�<input name="kechengbianhao" type="text" id="kechengbianhao" style='border:solid 1px #000000; color:#666666' size="12" />  �γ����ƣ�<input name="kechengmingcheng" type="text" id="kechengmingcheng" style='border:solid 1px #000000; color:#666666' size="12" />  רҵ��<input name="zhuanye" type="text" id="zhuanye" style='border:solid 1px #000000; color:#666666' size="12" />
   <input type="submit" name="Submit" value="����" style='border:solid 1px #000000; color:#666666' /> <input type="button" name="Submit2" value="����EXCEL" style='border:solid 1px #000000; color:#666666' onClick="javascript:location.href='kechengxinxi_listxls.jsp';" />
</form>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td bgcolor='#CCFFFF'>�γ̱��</td>    <td bgcolor='#CCFFFF'>�γ�����</td>    <td bgcolor='#CCFFFF'>רҵ</td>    <td width="138" align="center" bgcolor="CCFFFF">���ʱ��</td>
    <td width="60" align="center" bgcolor="CCFFFF">����</td>
  </tr>
  <tr>
    <td width="30" align="center"></td>
    <td></td>    <td></td>    <td></td>
    <td width="138" align="center"></td>
    <td width="60" align="center">
    	<a href="kechengxinxi_updt.jsp?id=">�޸�</a> 
   		<a href="kechengxinxi_list.jsp?scid=%>" onclick="return confirm('���Ҫɾ����')">ɾ��</a> 
    	<a href="kechengxinxi_detail.jsp?id=">��ϸ</a> 
    </td>
  </tr>
</table>
</body>
</html>

