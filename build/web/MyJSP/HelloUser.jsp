<%-- 
    Document   : HelloUser
    Created on : Nov 4, 2019, 10:06:03 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center>
    <body>
        
        <% java.util.Date d = new java.util.Date();
        %> 
        hello user today date is = <%=d%>
    </body>
    </center>
</html>
