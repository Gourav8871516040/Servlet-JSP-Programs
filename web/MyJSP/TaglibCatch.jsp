<%-- 
    Document   : TaglibCatch
    Created on : Nov 17, 2019, 1:41:10 PM
    Author     : User
--%>


<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      This page will cause an Exception
      <c:catch>
      <% int x = 10/0; %>
    </c:catch>
      You can see this line because of c:catch tag.
    </body>
</html>
