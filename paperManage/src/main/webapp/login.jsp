<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/10
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>登录论文管理系统</title>
</head>
<body>
<h4>${error}</h4>
    <form action="/userLogin" method="post">
        <table>
            <tr>
                <td>账号：</td>
                <td><input type="text" name="userCode"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="text" name="userPassword" id=""></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>

</body>
</html>
