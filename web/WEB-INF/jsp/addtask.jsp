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
                <a href="/gm/redirect/task" class="list-group-item">任务管理</a>
                <a href="/gm/redirect/addtask" class="list-group-item active">发布任务</a>
            </div>
        </div>
        <div class="col-md-10">
            <div class="page-header">
                <h4 style="margin-top: 0px;size: 16px">发布任务</h4>
            </div>
            <ul class="nav nav-tabs">
                <li>
                    <a href="/gm/redirect/task">任务管理</a>
                </li>
                <li class="active">
                    <a href="/gm/redirect/addtask">发布任务</a>
                </li>
            </ul>

            <form action="#" method="get">

                <div class="form-group">
                    <label for="uid_id">负责人</label>
                    <select class="form-control" name="uid" id="uid_id">
                        <c:forEach items="${requestScope.uidlist }" var="bean" varStatus="varstatus">
                            <option value="${bean.uid}">${bean.nickname}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <label for="rtype_id">任务类型</label>
                    <select class="form-control" name="rtype" id="rtype_id">
                        <option value="0">维护</option>
                        <option value="1">移植</option>
                        <option value="2">新增</option>
                        <option value="3">删除</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="aid_id">任务地点</label>
                    <select class="form-control" name="aid" id="aid_id">
                        <c:forEach items="${requestScope.arealist }" var="bean" varStatus="varstatus">
                            <option value="${varstatus.count}">${bean.aplace}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <label for="pid_id">植物类型</label>
                    <select class="form-control" name="pid" id="pid_id">
                        <c:forEach items="${requestScope.plantlist }" var="bean" varStatus="varstatus">
                            <option value="${varstatus.count}">${bean.pname}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <table for="tname_id">任务名称</table>
                    <input type="text" class="form-control" name="tname" id="tname_id" placeholder="请输入任务名称">
                </div>

                <div class="form-group">
                    <label for="detail_id">任务详情</label>
                    <textarea class="form-control" rows="15" cols="10" placeholder="请输入任务详情" id="detail_id" name="tdetail"></textarea>
                </div>

                <button type="submit" class="btn btn-default pull-right">发布任务</button>
            </form>
        </div>
    </div>
</div>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
