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
<title>添加配置</title>
</head>
<body>
<div class="pd-20">
  <div class="Huiform">
    <form action="/" method="post">
      <table class="table table-bg">
        <tbody>
          <tr>
            <th width="120" class="text-r"><span class="c-red">*</span> 变量名：</th>
            <td><input type="text" style="width:200px" class="input-text" value="" placeholder="" id="keyname" name="keyname" datatype="*2-16" nullmsg="姓名不能为空"></td>
          </tr>
          <tr>
            <div class="radio-box" style="margin-left: 30px;">
              <input type="radio" id="onoff" name="type" checked onclick="divClick();" value="0">
              <label for="onoff">功能开关（默认为关，如有需要请自行打开）</label>
            </div>
            <div class="radio-box">
              <input type="radio" id="sysparams" name="type"  onclick="divClick();" value="1">
              <label for="sysparams">参数配置</label>
            </div>
          </tr>
          <tr>
            <th class="text-r" id="keyspan" style="display: none"><span class="c-red">*</span> 变量值：</th>
            <td><input type="text" style="width:300px;display: none" class="input-text" value="" placeholder="" id="keyval" name="keyval"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span>备注：</th>
            <td><input type="text" style="width:300px" class="input-text" value="" placeholder="" id="remark" name="remark"></td>
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
<script>
  function divClick() {
      var show="";
      var apm = document.getElementsByName("type");
      for(var i=0;i<apm.length;i++){
          if(apm[i].checked) {
              show = apm[i].value;
          }
      }
      switch (show){
          case '0':
              document.getElementById("keyspan").style.display="none";
              document.getElementById("keyval").style.display="none";
              break;
          case '1':
              document.getElementById("keyval").style.display="block";
              document.getElementById("keyspan").style.display="block";
              break;
          default:
              document.getElementById("keyspan").style.display="none";
              document.getElementById("keyval").style.display="none";
              break;
      }
  }


    function sub() {
        var remark = $("#remark").val();
        var keyname = $("#keyname").val();
        var apm = document.getElementsByName("type");
        for(var i=0;i<apm.length;i++){
            if(apm[i].checked) {
                var type = apm[i].value;
            }
        }
        if(type == 0){
            var keyval = "";
        }else{
            var keyval = $("#keyval").val();
        }

        $.post("${pageContext.request.contextPath}/system/addSysparams.action", {
                'keyname' : keyname,
                'remark' : remark,
                'keyval' : keyval,
                type : type
            },
        function (result) {
            layer.msg('添加成功');
        })
    }
</script>
</body>
</html>