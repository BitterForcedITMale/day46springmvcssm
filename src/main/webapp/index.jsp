<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: huawei
  Date: 2020/7/27
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<a href="account/findAll">测试</a>
<h3>账户列表</h3>
  <table border="1px">
    <tr>
      <td>id</td>
      <td>name</td>
      <td>money</td>
    </tr>
    <C:forEach items="${accounts}" var="account">
      <tr>
        <td>${account.id}</td>
        <td>${account.name}</td>
        <td>${account.money}</td>
      </tr>
    </C:forEach>
  </table>
  <form action="account/save" method="post">
    账户名：<input type="text" name="name"><br>
    金钱：<input type="text" name="money"><br>
    <input type="submit">
  </form>
  </body>
</html>
