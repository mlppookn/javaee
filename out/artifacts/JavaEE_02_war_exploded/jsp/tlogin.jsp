
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>老师登录</title>
</head>
<body>
<div align="center">

    <form action="${pageContext.request.contextPath}/tlogin" method="get">
        <table style="line-height: 40px">
            <tr>
                <th>老师id</th>
                <td><input type="number" name="id" maxlength="20" style="font-family: arial" required></td>
            </tr>
            <tr>
                <th>密码</th>
                <td><input type="text" name="mima" maxlength="20" style="font-family: arial" required></td>
            </tr>

            <tr align="center">
                <td><input type="submit" value="提交"> </td>
            </tr>
        </table>
    </form>
</div>


</body>
</html>