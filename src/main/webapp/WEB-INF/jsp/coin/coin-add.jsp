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
<title>添加用户</title>
</head>
<body>
<div class="pd-20">
  <div class="Huiform">
    <form action="${pageContext.request.contextPath}/coin/addCoin.action" method="post"  enctype="multipart/form-data" id="fm">
      <table class="table table-bg">
        <tbody>
          <tr>
            <th width="120" class="text-r"><span class="c-red">*</span> 币种名称：</th>
            <td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="name" name="name" datatype="*2-16" nullmsg="姓名不能为空"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 币种代码：</th>
            <td><input type="text" style="width:300px" class="input-text" value="" placeholder="" id="symbol" name="symbol"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span>站点名称：</th>
            <td><input type="text" style="width:300px" class="input-text" value="" placeholder="" id="websiteSlug" name="websiteSlug"></td>
          </tr>
          <tr>
              <th class="text-r">图片logo：</th>
              <td><input type="file" class="" id="file" name="file" multiple></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span>获取交易信息URL：</th>
            <td><input type="text" style="width:300px" class="input-text" value="" placeholder="" id="urlTransaction" name="urlTransaction"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span>获取地址信息URL：</th>
            <td><input type="text" style="width:300px" class="input-text" value="" placeholder="" id="urlAddressinfo" name="urlAddressinfo"></td>
          </tr>
          <tr>
            <th></th>
            <td><button class="btn btn-success radius"  type="submit"><i class="icon-ok"></i> 确定</button></td>
          </tr>
        </tbody>
      </table>
    </form>
  </div>
</div>
<script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.1.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript">
$(".Huiform").Validform(); 
</script>

</body>
</html>