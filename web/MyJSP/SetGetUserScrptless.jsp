<%-- 
    Document   : SetGetUserScrptless
    Created on : Nov 10, 2019, 1:14:06 PM
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
        <jsp:useBean id="u" class="MyClasses.User" scope="request">
            <jsp:setProperty name="u" property="uname" param="un"/>
            <jsp:setProperty name="u" property="mob" param="pn"/>
            
        </jsp:useBean>
        Username : <jsp:getProperty name="u" property="uname"/><br/>
        Mobile Number : <jsp:getProperty name="u" property="mob"/>
        
    </body>
</html>
