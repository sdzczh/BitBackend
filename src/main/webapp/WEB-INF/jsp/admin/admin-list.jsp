<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<jsp:include page="../../../common/cssjs.jsp"/>

<title>管理员管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
  <form action="/admin/getAdminList.action" method="get">
  <table class="table table-border table-bordered table-hover table-bg table-sort">
    <thead>
      <tr class="text-c">
        <th width="100">账号</th>
        <th width="130">创建时间</th>
        <th width="100">操作</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="list">
      <tr class="text-c">
        <td>${list.account}</td>
        <td><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${list.createtime}" /></td>
        <td>
          <a href="javascript:;" onclick="upUser(${list.id})" class="btn btn-primary radius">修改密码</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  </form>
</div>

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">

    function upUser(id){
        parent.layer.open({
            type: 2,
            title: '添加',
            shadeClose: true,
            shade: 0.8,
            area: ['550px','250px'],
            content: '${pageContext.request.contextPath}/admin/toUpdateAdmin.action?id=' + id,
            end: function () {
                location.reload();
            }
        });
    }
</script>
</body>
</html>
