<%-- 
    Document   : ShowData
    Created on : Nov 17, 2019, 11:45:02 AM
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
        <%if(request.getParameter("na").equals("")&&request.getParameter("age").equals(""))
        {
        %>
        <jsp:forward page="Handel.jsp"></jsp:forward>
        <%}
        
        else {%> 
        
        Welcome ${param.na}<br/>
        
        your Age is ${param.age}
        
       <% } %> 
    </body>
</html>
