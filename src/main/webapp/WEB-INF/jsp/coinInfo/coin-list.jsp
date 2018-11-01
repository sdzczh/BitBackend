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

<title>币种管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 币种中心 <span class="c-gray en">&gt;</span> 币种管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
  <form action="/coin/getCoinInfoList.action" method="get">
  <div class="text-c">
    <input type="text" class="input-text" style="width:250px" placeholder="输入币种代码" value="${symbol}" id="symbol" name="symbol">
    <button type="submit" class="btn btn-success" id="" name=""><i class="icon-search"></i> 搜币</button>
  </div>
  <div class="cl pd-5 bg-1 bk-gray mt-20">
    <span class="r">共有数据：<strong>${count}</strong> 条</span>
  </div>
  <table class="table table-border table-bordered table-hover table-bg table-sort">
    <thead>
      <tr class="text-c">
        <th width="80">ID</th>
        <th width="40">币种代码</th>
        <th width="90">团队信息</th>
        <th width="90">源码信息</th>
        <th width="90">reddit</th>
        <th width="90">twitter</th>
        <th width="90">facebook</th>
        <th width="90">主页</th>
        <th width="90">白皮书</th>
        <th width="90">区块浏览器</th>
        <th width="90">币种介绍</th>
        <th width="130">创建时间</th>
        <th width="90">操作</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="list">
      <tr class="text-c">
        <td>${list.id}</td>
        <td>${list.symbol}</td>
        <td>${list.team_info}</td>
        <td>${list.github}</td>
        <td>${list.reddit}</td>
        <td>${list.twitter}</td>
        <td>${list.facebook}</td>
        <td>${list.website}</td>
        <td>${list.white_paper}</td>
        <td>${list.explorer}</td>
        <td>${list.info}</td>
        <td><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${list.createTime}" /></td>
        <td>
<%--
          <a href="javascript:;" onclick="delUser(${list.id})" class="btn btn-danger radius">删除</a>
--%>
          <a href="javascript:;" onclick="upUser(${list.id},'${list.symbol}')" class="btn btn-primary radius">编辑</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <nav aria-label="Page navigation" class="page-nav-outer" id="PageNavId"></nav>
  </form>
</div>

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    var pageNavObj = null;//用于储存分页对象
    var count = "${count}";
    var page = parseInt("${page}") == 0 ? 1 : (parseInt("${page}") + 1);
    pageNavObj = new PageNavCreate("PageNavId",{ pageCount:count/10+1, currentPage:page, perPageNum:5, });
    pageNavObj.afterClick(pageNavCallBack);

    function pageNavCallBack(clickpage){
        window.location.href = "${pageContext.request.contextPath}/coin/getCoinInfoList.action?page="+(clickpage - 1)+"&rows=10&symbol="+$("#symbol").val();
    }

    function upUser(id, symbol){
        parent.layer.open({
            type: 2,
            title: '添加',
            shadeClose: true,
            shade: 0.8,
            area: ['550px','450px'],
            content: '${pageContext.request.contextPath}/coin/toUpdateCoinInfo.action?id=' + id + '&symbol='+symbol,
            end: function () {
                location.reload();
            }
        });
    }
</script>
</body>
</html>
