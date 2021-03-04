<%-- 
    Document   : MobPerInput
    Created on : Nov 17, 2019, 9:52:23 AM
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
        <form action="/MyWebsites/setperson" method="post">
            Enter name <input type="text" name="pname"/><br/><br/>
            Enter Mobile <input type="text" name="mname"/><br/><br/>
            Enter Price <input type="text" name="price"/><br/><br/>
            <input type="submit" value="show"/>
            
        </form>
    </body>
</html>
