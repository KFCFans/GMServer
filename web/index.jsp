<%--
  Created by IntelliJ IDEA.
  User: lip
  Date: 2018/3/27
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登陆</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  </head>
  <body>


  <div class="container" style="margin-top: 120px;width: 400px">

    <h1 class="text-center">用户登陆</h1>

    <form action="/gm/security/login" method="post">
      <div class="form-group">
        <label>用户名：</label>
        <input type="text" class="form-control" name="username">
      </div>
      <div class="form-group">
        <label>密码：</label>
        <input type="password" class="form-control" name="password">
      </div>
      <input class="btn btn-block btn-success" type="submit">
    </form>

  </div>

  <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
  <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
  <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </body>
</html>
