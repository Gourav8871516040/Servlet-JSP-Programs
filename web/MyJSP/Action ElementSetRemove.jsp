<%-- 
    Document   : Action ElementSetRemove
    Created on : Nov 17, 2019, 1:28:01 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:set var="status" scope="request" value="Ok"/>
            The Status of user is ${status}
       
        <c:remove var="status" scope="request"/>
        the user status is ${status}
        
    </body>
</html>
