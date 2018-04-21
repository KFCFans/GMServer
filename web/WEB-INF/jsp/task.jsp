<%--
  Created by IntelliJ IDEA.
  User: tengj
  Date: 2018/4/20
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理系统</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
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
                <li class="active"><a href="/gm/redirect/task" class="active"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;任务管理</a></li>
                <li><a href="/gm/redirect/response"><span class="glyphicon glyphicon-tags"></span>&nbsp;&nbsp;反馈管理</a></li>
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
    <div class="row">
        <div class="col-md-2">
            <div class="list-group">
                <a href="/gm/redirect/task" class="list-group-item active">任务管理</a>
                <a href="/gm/redirect/addtask" class="list-group-item">发布任务</a>
            </div>
        </div>
        <div class="col-md-10">

            <ul class="nav nav-tabs">
                <li class="active">
                    <a href="/gm/redirect/task">任务管理</a>
                </li>
                <li>
                    <a href="/gm/redirect/addtask">发布任务</a>
                </li>
            </ul>
            <table class="table">
                <thead>
                <tr>
                    <th>任务类型</th>
                    <th>任务名称</th>
                    <th>负责人</th>
                    <th>发布时间</th>
                    <th>完成状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${requestScope.tklist }" var="tk">
                    <tr>
                        <td>${tk.type}</td>
                        <td>${tk.tname}</td>
                        <td>${tk.uid}</td>
                        <td>${tk.stime}</td>
                        <td>${tk.status}</td>
                        <td>
                            <a href="/gm/redirect/deltask?tid=${tk.tid}" onclick="return confirm('确定要删除此任务吗？');"><span class="glyphicon glyphicon-remove"></span></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
