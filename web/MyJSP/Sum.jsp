<%-- 
    Document   : Sum
    Created on : Nov 5, 2019, 6:52:08 PM
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
        <% String f = request.getParameter("fno");
        String s = request.getParameter("sno");
        %>
        Sum of the numbers is : <%=Integer.parseInt(s)+Integer.parseInt(f)%>
    </body>
</html>
