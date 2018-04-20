<%@ page import="com.lip.pojo.result.FeedbackListResult" %>
<%@ page import="java.util.List" %>
<%@ page import="com.lip.pojo.Feedback" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: tengj
  Date: 2018/4/18
  Time: 15:03
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
                <li class="active"><a href="/gm/redirect/main"><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;后台首页</a></li>
                <li><a href="/gm/redirect/user"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;用户管理</a></li>
                <li><a href="/gm/redirect/task"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;任务管理</a></li>
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

    <div class="col-lg-6">
        <div class="panel panel-default">
            <div class="panel-heading">已发布任务</div>
            <div class="panel-body">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>地区</th>
                        <th>内容</th>
                        <th>负责人</th>
                        <th>状态</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.tklist }" var="tk">
                        <tr>
                            <td>${tk.area}</td>
                            <td>${tk.tname}</td>
                            <td>${tk.uid}</td>
                            <td>${tk.status}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <div class="col-lg-6">
        <div class="panel panel-default">
            <div class="panel-heading">最新反馈</div>
            <div class="panel-body">
                <table class="table table-hover">
                    <thead>
                       <tr>
                           <th>信息</th>
                           <th>用户</th>
                       </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.fblist }" var="fb">
                        <tr>
                       <td>${fb.feedbackinfo}</td>
                        <td>${fb.uid}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <div class="col-lg-6">
        <div class="panel panel-default">
            <div class="panel-heading">注册员工</div>
            <div class="panel-body">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>姓名</th>
                        <th>手机号</th>
                        <th>贡献度</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.mblist }" var="mb">
                        <tr>
                            <td>${mb.nickname}</td>
                            <td>${mb.uid}</td>
                            <td>${mb.achievement}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <div class="col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">服务器状态</div>
            <div class="panel-body">
                <p>内存使用率：40%</p>
                <div class="progress">
                    <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%"></div>
                </div>
                <p>数据库使用率：20%</p>
                <div class="progress">
                    <div class="progress-bar progress-bar-info progress-bar-striped" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%"></div>
                </div>
                <p>磁盘使用率：60%</p>
                <div class="progress">
                    <div class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%"></div>
                </div>
                <p>CPU使用率：80%</p>
                <div class="progress">
                    <div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%"></div>
                </div>
            </div>
        </div>
    </div>

</div>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
