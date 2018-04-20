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

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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
                <li class="active"><a href="/gm/redirect/user"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;用户管理</a></li>
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

<%
    String sex[]={"男","女"};
%>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            <div class="list-group">
                <a href="#" class="list-group-item active">员工管理</a>
                <a href="" class="list-group-item" role="button" data-toggle="modal" data-target="#addUserModal">添加员工</a>
            </div>
        </div>

        <div class="col-md-10">
            <div class="page-header">
                <h4 style="size: 16px;margin-top: 0px">员工管理</h4>
            </div>
            <table class="table">
                <thead>
                <tr>
                    <th>姓名</th>
                    <th>手机号</th>
                    <th>性别</th>
                    <th>贡献</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${requestScope.mblist }" var="mb">
                    <tr>
                        <td>${mb.nickname}</td>
                        <td>${mb.uid}</td>
                        <td>${mb.gender}</td>
                        <td>${mb.achievement}</td>
                        <td>
                           <a href="/gm/redirect/delworker?uid=${mb.uid}" onclick="return confirm('确定要删除此员工吗？');"><span class="glyphicon glyphicon-remove"></span></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="addUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">添加员工</h4>
                </div>
                <form action="/gm/redirect/addworker" method="get" onsubmit="return checkAddUserForm()">

                    <div class="modal-body">
                        <div class="form-group">
                            <label for="username_id">姓名</label>
                            <input type="text" id="username_id" name="nickname" class="form-control" placeholder="请输入用户名">
                        </div>
                        <div class="form-group">
                            <label for="uid_id">手机号</label>
                            <input type="tel" id="uid_id" name="uid" class="form-control" placeholder="请输入手机号">
                        </div>
                        <div class="form-group">
                            <label for="sex_id">性别</label>
                            <select id="sex_id" name="gender" class="form-control">
                                <option value="0">男</option>
                                <option value="1">女</option>
                            </select>
                        </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="submit" class="btn btn-primary">提交</button>
                </div>
                </form>
            </div>
        </div>
    </div>

    <script language="JavaScript">
        function checkAddUserForm() {
            var name=$.trim($("#username_id").val());
            var uid=$.trim($("#uid_id").val());
            if(!name){
                alert("请填写姓名！");
                return false;
            }
            if(!uid){
                alert("请填写手机号!");
                return false;
            }
            return true;
        }
    </script>
</div>
</body>
</html>

