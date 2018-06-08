<%--
  Created by IntelliJ IDEA.
  User: tengj
  Date: 2018/4/20
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    String msg=request.getParameter("msg");
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>后台管理系统</title>
    <link href="<%=basePath%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="<%=basePath%>/bootstrap/css/fileinput.min.css">
    <link type="text/css" rel="stylesheet" href="<%=basePath%>/bootstrap/css/bootstrap-datetimepicker.min.css">
</head>
<body>

<!--导航-->
<nav class="navbar navbar-default">
    <div class="container">
        <!--小屏幕导航按钮和logo-->
        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="/gm/redirect/main" class="navbar-brand">校园绿化管理系统</a>
        </div>
        <!--小屏幕导航按钮和logo-->
        <!--导航-->
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="/gm/redirect/main"><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;后台首页</a></li>
                <li><a href="/gm/redirect/user"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;用户管理</a></li>
                <li><a href="/gm/redirect/task" class="active"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;任务管理</a></li>
                <li><a href="/gm/redirect/response"><span class="glyphicon glyphicon-tags"></span>&nbsp;&nbsp;反馈管理</a></li>
                <li><a href="/gm/redirect/manageactivity"><span class="glyphicon glyphicon-th"></span>&nbsp;&nbsp;活动管理</a></li>
                <li class="active"><a href="/gm/redirect/manageplant"><span class="glyphicon glyphicon-tree-conifer"></span>&nbsp;&nbsp;植物管理</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a id="dLabel" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        admin
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="dLabel">
                        <li><a href="index.html"><span class="glyphicon glyphicon-screenshot"></span>&nbsp;&nbsp;前台首页</a></li>
                        <li><a href="index.html"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;个人主页</a></li>
                        <li><a href="index.html"><span class="glyphicon glyphicon-cog"></span>&nbsp;&nbsp;个人设置</a></li>
                        <li><a href="index.html"><span class="glyphicon glyphicon-credit-card"></span>&nbsp;&nbsp;账户中心</a></li>
                        <li><a href="index.html"><span class="glyphicon glyphicon-heart"></span>&nbsp;&nbsp;我的收藏</a></li>
                    </ul>
                </li>
                <li><a href="/gm/redirect/offline"><span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;退出</a></li>
            </ul>
        </div>
        <!--导航-->
    </div>
</nav>
<!--导航-->

<div class="container">

    <div id="successAlert" class="alert alert-success hidden">
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>成功！</strong>发布成功。
    </div>

    <div class="row">
        <div class="col-md-2">
            <div class="list-group">
                <a href="/gm/redirect/manageplant" class="list-group-item">植物管理</a>
                <a href="/gm/redirect/addplant" class="list-group-item active">新增类别</a>
            </div>
        </div>
        <div class="col-md-10">

            <ul class="nav nav-tabs">
                <li>
                    <a href="/gm/redirect/manageplant">植物管理</a>
                </li>
                <li class="active">
                    <a href="/gm/redirect/addplant">新增类别</a>
                </li>
            </ul>

            <form action="/gm/redirect/newplant" method="post" onsubmit="return dealForm()">
                <div class="form-group">
                    <label for="pname_id">植物名称</label>
                    <input type="text" name="pname" id="pname_id" class="form-control">
                </div>

                <div class="form-group">
                    <label for="psname_id">植物学名</label>
                    <input type="text" name="psname" id="psname_id" class="form-control">
                </div>

                <div class="form-group">
                    <label for="ptype_id">植物科属</label>
                    <input type="text" name="ptype" id="ptype_id" class="form-control">
                </div>

                <div class="form-group">
                    <label for="pxyfb_id">校园分布</label>
                    <input type="text" name="pxyfb" id="pxyfb_id" class="form-control">
                </div>

                <div class="form-group">
                    <label for="file">植物图片</label>
                    <input type="file" name="file" class="file" data-show-preview="false" id="file">
                </div>

                <div class="form-group">
                    <label for="plhxg_id">绿化效果</label>
                    <textarea class="form-control" rows="5" cols="8" placeholder="请输入活动详情" id="plhxg_id" name="plhxg"></textarea>
                </div>

                <div class="form-group">
                    <label for="pdetail_id">植物详情</label>
                    <textarea class="form-control" rows="5" cols="8" placeholder="请输入活动详情" id="pdetail_id" name="pdetail"></textarea>
                </div>

                <!-- 隐藏控件，用来提交图片名称-->
                <input type="text" name="pimg" id="pimg" value="default" class="hidden">


                <button type="submit" class="btn btn-default pull-right">发布</button>
            </form>

        </div>
    </div>
</div>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="<%=basePath%>/bootstrap/js/jquery-3.3.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/bootstrap/js/fileinput.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/bootstrap/js/fileinput_locale_zh.js"></script>
<script type="text/javascript" src="<%=basePath%>/bootstrap/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="<%=basePath%>/bootstrap/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type="text/javascript">

    $("#file").fileinput({
        language:'en',
        uploadUrl: "http://localhost:8080/gm/upload/plant", //上传的地址
        allowedFileExtensions: ['jpg', 'png'],//接收的文件后缀
        //uploadExtraData:{"id": 1, "fileName":'123.mp3'},
        uploadAsync: true, //默认异步上传
        showUpload: false, //是否显示上传按钮
        showRemove : false, //显示移除按钮
        showPreview : true, //是否显示预览
        showCaption: true,//是否显示标题
        browseClass: "btn btn-primary", //按钮样式
        dropZoneEnabled: false,//是否显示拖拽区域
        //minImageWidth: 50, //图片的最小宽度
        //minImageHeight: 50,//图片的最小高度
        //maxImageWidth: 1000,//图片的最大宽度
        //maxImageHeight: 1000,//图片的最大高度
        //maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
        //minFileCount: 0,
        maxFileCount: 1, //表示允许同时上传的最大文件个数
        enctype: 'multipart/form-data',
        validateInitialCount:true,
    }).on("filebatchselected", function(event, files) {
        $(this).fileinput("upload");
    });
    //异步上传失败结果处理
    $('#file').on('fileerror', function(event, data, msg) {
        alert("上传失败，请重新上传图片！");

    });
    //异步上传成功结果处理
    $("#file").on("fileuploaded", function (event, data, previewId, index) {
        var filename = data.response;
        $('#pimg').val(filename);//拿到后台传回来的id，给图片的value赋值序列化表单用
    });

    // 处理表单
    function dealForm() {
        return true;
    }

    // 上一次执行结果
    var msg="<%= msg%>";

    if(msg=="success"){
        $("#successAlert").attr("class","alert alert-success");
        setTimeout("$('#successAlert').alert('close');",2000);
    }
</script>

</body>
</html>
