<%-- 
    Document   : ShowUser
    Created on : Nov 8, 2019, 10:32:33 PM
    Author     : User
--%>

<%@page import="MyClasses.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%User s = (User)request.getAttribute("user");%>
        UserName = <%=s.getUname()%><br/>
        Mobile Number = <%=s.getMob()%>
        
    </body>
</html>
