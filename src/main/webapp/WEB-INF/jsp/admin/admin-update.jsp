<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
    <jsp:include page="../../../common/cssjs.jsp"/>
<!--[if IE 7]>
<link href="http://www.bootcss.com/p/font-awesome/assets/css/font-awesome-ie7.min.css" rel="stylesheet" type="text/css" />
<![endif]-->
<title>修改信息</title>
</head>
<body>
<div class="pd-20">
  <div class="Huiform">
    <form action="/" method="post">
      <table class="table table-bg">
        <tbody>
            <input type="hidden" value="${manager.id}" name="id" id="id">
          <tr>
            <th class="text-r"><span class="c-red">*</span> 账号：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${manager.account}" placeholder="" id="account" name="account"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 新密码</th>
            <td><input type="text" style="width:300px" class="input-text" value="" placeholder="" id="password" name="password"></td>
          </tr>
          <tr>
            <th></th>
            <td><button class="btn btn-success radius" onclick="sub()" type="button"><i class="icon-ok"></i> 确定</button></td>
          </tr>
        </tbody>
      </table>
    </form>
  </div>
</div>
<script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.1.3/jquery.min.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script> 
<script type="text/javascript">
$(".Huiform").Validform(); 
</script>
<script>
    function sub() {
        var id = $("#id").val();
        var account = $("#account").val();
        var password = $("#password").val();
        $.post("${pageContext.request.contextPath}/admin/updateAdmin.action", {id : id,'account' : account, 'password' : password},
        function (result) {
            layer.msg('修改成功');
        })
    }
</script>
</body>
</html>