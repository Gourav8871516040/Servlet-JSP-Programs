<%-- 
    Document   : ShowMovieList
    Created on : Nov 17, 2019, 1:16:07 PM
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
        <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <table border="1">
            <c:forEach var="i" items="${Movie}">
                <tr><td>${i}</td></tr>
            </c:forEach>
        </table>
    </body>
</html>
