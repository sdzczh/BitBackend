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

<title>币种数据统计</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 币种中心 <span class="c-gray en">&gt;</span> 币种数据统计 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
  <form action="/coin/getCoinDataList.action" method="get">
  <div class="text-c">
    <input type="text" class="input-text" style="width:250px" placeholder="输入币种名称" value="${coin}" id="coin" name="coin">
    <button type="submit" class="btn btn-success" id="" name=""><i class="icon-search"></i> 搜索</button>

  </div>
  <div class="cl pd-5 bg-1 bk-gray mt-20">
    <span class="r">共有数据：<strong>${count}</strong> 条</span>
  </div>
  <table class="table table-border table-bordered table-hover table-bg table-sort" style="table-layout: fixed;">
    <thead>
      <tr class="text-c">
        <th width="80">ID</th>
        <th width="100">币种名称</th>
        <th width="40">交易所id</th>
        <th width="40">当前价格（rmb）</th>
        <th width="150">当前价格（usdt）</th>
        <th width="90">24小时价格变化</th>
        <th width="90">24小时价格变化百分比</th>
        <th width="90">24小时最高价</th>
        <th width="90">24小时最低价</th>
        <th width="90">24小时交易量（usdt）</th>
        <th width="90">市值</th>
        <th width="90">流通量</th>
        <th width="90">排名</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="list">
      <tr class="text-c">
        <td>${list.id}</td>
        <td>${list.coin}</td>
        <td>${list.exchangeid}</td>
        <td>${list.price}</td>
        <td>${list.priceUsdt}</td>
        <td>${list.priceChange}</td>
        <td>${list.priceChangePercent}</td>
        <td>${list.dayHigh}</td>
        <td>${list.dayLow}</td>
        <td>${list.dayVolume}</td>
        <td>${list.marketCap}</td>
        <td>${list.circulation}</td>
        <td>${list.rank}</td>
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
        window.location.href = "${pageContext.request.contextPath}/coin/getCoinDataList.action?page="+(clickpage - 1)+"&rows=10&name="+$("#name").val()+"&coin="+$("#coin").val();
    }

</script>
</body>
</html>
