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

<title>系统配置管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统参数配置 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
  <form action="/system/getSysparamsList.action" method="get">
  <div class="text-c">
    <input type="text" class="input-text" style="width:250px" placeholder="输入KEY" id="keyname" name="keyname" value="${keyname}">
    <button type="submit" class="btn btn-success" id="" name=""><i class="icon-search"></i> 搜索</button>

  </div>
  <div class="cl pd-5 bg-1 bk-gray mt-20">
    <a href="javascript:;" onclick="addUser()" class="btn btn-primary radius"><i class="icon-plus"></i> 添加配置</a></span>
    <span class="r">共有数据：<strong>${count}</strong> 条</span>
  </div>
  <table class="table table-border table-bordered table-hover table-bg table-sort">
    <thead>
      <tr class="text-c">
        <th width="80">ID</th>
        <th width="100">变量名</th>
        <th width="40">变量值</th>
        <th width="150">备注</th>
        <th width="150">参数类型</th>
        <th width="130">创建时间</th>
        <th width="100">操作</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="list">
      <tr class="text-c">
        <td>${list.id}</td>
        <td>${list.keyname}</td>
        <td>
          <c:if test="${list.type==0}">
              <c:if test="${list.keyval==0}">
                <input class="btn btn-primary-outline radius" type="button" value="开" onclick="changeOnoff(${list.id})">
              </c:if>
              <c:if test="${list.keyval==1}">
                <input class="btn btn-danger-outline radius" type="button" value="关" onclick="changeOnoff(${list.id})">
              </c:if>
        </td>
          </c:if>
        <c:if test="${list.type==1}">${list.keyval}</c:if>
        <td>${list.remark}</td>
        <td>
          <c:if test="${list.type==0}"><span class="label label-secondary radius">功能开关</span></c:if>
          <c:if test="${list.type==1}"><span class="label label-warning radius">参数配置</span></c:if>
        </td>
        <td><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${list.createtime}" /></td>
        <td>
          <c:if test="${list.type==1}">
            <a href="javascript:;" onclick="upUser(${list.id})" class="btn btn-primary radius">编辑</a>
          </c:if>
          <a href="javascript:;" onclick="delUser(${list.id})" class="btn btn-danger radius">删除</a>
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
<script>
    $('#status').on('switch-change', function (e, data) {
        var $el = $(data.el)
            , value = data.value;
        console.log(e, $el, value);
        alert("!")
    });
</script>
<script type="text/javascript">
    var pageNavObj = null;//用于储存分页对象
    var count = "${count}";
    var page = parseInt("${page}") == 0 ? 1 : (parseInt("${page}") + 1);
    pageNavObj = new PageNavCreate("PageNavId",{ pageCount:count/10+1, currentPage:page, perPageNum:5, });
    pageNavObj.afterClick(pageNavCallBack);

    function pageNavCallBack(clickpage){
        window.location.href = "${pageContext.request.contextPath}/system/getSysparamsList.action?page="+(clickpage - 1)+"&rows=10&keyname="+$("#keyname").val()
    }

    function delUser(id){
        layer.confirm('确定要删除？', function(){
            $.post("${pageContext.request.contextPath}/system/delSysparams.action",{id : id}, function(result){
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
            area: ['550px','350px'],
            content: '${pageContext.request.contextPath}/system/toAddSysparams.action',
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
            area: ['550px','350px'],
            content: '${pageContext.request.contextPath}/system/toUpdateSysparams.action?id=' + id,
            end: function () {
                location.reload();
            }
        });
    }

    function changeOnoff(id) {
        $.post("${pageContext.request.contextPath}/system/updateSysparamOnoff.action",{id : id}, function(result){
            layer.msg('修改成功');
            setTimeout(function(){window.location.reload();},1000)
        })
    }
</script>
</body>
</html>
