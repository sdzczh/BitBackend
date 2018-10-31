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
  <form action="/coin/getCoinList.action" method="get">
  <div class="text-c">
    <input type="text" class="input-text" style="width:250px" placeholder="输入币种名称" value="${name}" id="name" name="name">
    <input type="text" class="input-text" style="width:250px" placeholder="输入币种d代码" value="${symbol}" id="symbol" name="symbol">
    <button type="submit" class="btn btn-success" id="" name=""><i class="icon-search"></i> 搜币</button>

  </div>
  <div class="cl pd-5 bg-1 bk-gray mt-20">
    <a href="javascript:;" onclick="addUser()" class="btn btn-primary radius"><i class="icon-plus"></i> 添加新币</a></span>
    <span class="r">共有数据：<strong>${count}</strong> 条</span>
  </div>
  <table class="table table-border table-bordered table-hover table-bg table-sort">
    <thead>
      <tr class="text-c">
        <th width="80">ID</th>
        <th width="100">币种名称</th>
        <th width="40">币种代码</th>
        <th width="40">站点名称</th>
        <th width="150">币种logo图片地址</th>
        <th width="90">获取交易信息</th>
        <th width="90">获取地址信息（余额）</th>
        <th width="130">创建时间</th>
        <th width="100">操作</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="list">
      <tr class="text-c">
        <td>${list.id}</td>
        <td>${list.name}</td>
        <td>${list.symbol}</td>
        <td>${list.websiteSlug}</td>
        <td><img src="${list.logoUrl}"></td>
        <td>${list.urlTransaction}</td>
        <td>${list.urlAddressinfo}</td>
        <td><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${list.createtime}" /></td>
        <td>
          <a href="javascript:;" onclick="delUser(${list.id})" class="btn btn-danger radius">删除</a>
          <a href="javascript:;" onclick="upUser(${list.id})" class="btn btn-primary radius">编辑</a>
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
        window.location.href = "${pageContext.request.contextPath}/coin/getCoinList.action?page="+(clickpage - 1)+"&rows=10&name="+$("#name").val()+"&symbol="+$("#symbol").val();
    }

    function delUser(id){
        layer.confirm('确定要删除？', function(){
            $.post("${pageContext.request.contextPath}/coin/delCoin.action",{id : id}, function(result){
                layer.msg('删除成功');
                setTimeout(function(){window.location.reload();},1000)
            })
        });
    }

    function addUser(){
        parent.layer.open({
            type: 2,
            title: '添加',
            shadeClose: true,
            shade: 0.8,
            area: ['550px','450px'],
            content: '${pageContext.request.contextPath}/coin/toAddCoin.action',
            end: function () {
                location.reload();
            }
        });
    }
    function upUser(id){
        parent.layer.open({
            type: 2,
            title: '添加',
            shadeClose: true,
            shade: 0.8,
            area: ['550px','450px'],
            content: '${pageContext.request.contextPath}/coin/toUpdateCoin.action?id=' + id,
            end: function () {
                location.reload();
            }
        });
    }
</script>
</body>
</html>
