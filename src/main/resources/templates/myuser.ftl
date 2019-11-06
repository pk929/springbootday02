<html>
    <head>
        <title>User</title>
    </head>
    <body>
        <table align="center" border="1px" cellpadding="5px" cellspacing="0px">
            <tr>
                <th>ID</th>
                <th>用户名</th>
                <th>密码</th>
            </tr>
            <#list userList as user>
                <tr>
                    <td>${user.uid}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                </tr>
            </#list>


        </table>
    </body>
</html>

