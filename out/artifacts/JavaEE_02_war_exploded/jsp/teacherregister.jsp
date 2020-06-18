
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>老师注册</title>
</head>
<body>
<div align="center">

    <form action="${pageContext.request.contextPath}/addTeacher" method="post">
        <table style="line-height: 40px">
            <tr>
                <th>教师号</th>
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