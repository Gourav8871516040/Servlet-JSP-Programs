<%-- 
    Document   : UserGet
    Created on : Nov 10, 2019, 12:56:48 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/MyWebsites/userseti" method="post">
            Enter user name <input type="text" name="un"/><br/><br/>
            Enter Mobile Number <input type="text" name="mn"/><br/><br/>
            <input type="submit" value="show"/>
        </form>
    </body>
</html>
