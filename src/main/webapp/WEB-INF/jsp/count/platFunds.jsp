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

<title>平台资金流动</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 数据统计 <span class="c-gray en">&gt;</span> 平台资金流动 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
  <form action="/count/getPlantFundsList.action" method="get">
  <div class="cl pd-5 bg-1 bk-gray mt-20">
    <span class="r">共有数据：<strong>${count}</strong> 条</span>
  </div>
  <table class="table table-border table-bordered table-hover table-bg table-sort">
    <thead>
      <tr class="text-c">
        <th width="80">ID</th>
        <th width="90">交易所</th>
        <th width="90">流入</th>
        <th width="90">流出</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="list">
      <tr class="text-c">
        <td>${list.id}</td>
        <td>
          <c:if test="${list.exchangeid == 1}">Okex</c:if>
          <c:if test="${list.exchangeid == 2}">HuoBi</c:if>
        </td>
        <td>${list.in}</td>
        <td>${list.out}</td>
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
    var pageNavObj;//用于储存分页对象
    var count = "${count}";
    var page = parseInt("${page}") === 0 ? 1 : (parseInt("${page}") + 1);
    pageNavObj = new PageNavCreate("PageNavId",{ pageCount:count/10+1, currentPage:page, perPageNum:5});
    pageNavObj.afterClick(pageNavCallBack);

    function pageNavCallBack(clickpage){
        window.location.href = "${pageContext.request.contextPath}/count/getPlantFundsList.action?page="+(clickpage - 1)+"&rows=10";
    }
</script>
</body>
</html>
