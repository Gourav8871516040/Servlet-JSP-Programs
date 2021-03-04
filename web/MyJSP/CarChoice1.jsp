<%-- 
    Document   : CarChoice1
    Created on : Nov 17, 2019, 1:05:06 PM
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
        
         <c:choose>
             <c:when test="${param.ctype eq 'HatchBack'}">
                 We have EON ,Centro and Neor in this category. 
             </c:when>
             <c:when test="${param.ctype eq 'Sedon'}">
                 We have Xcent and i20 in this category. 
             </c:when>
                 <c:when test="${param.ctype eq 'SUV'}">
                 We have creta in this category. 
             </c:when>
         
             <c:otherwise> We have burna and santrafag in elite category</c:otherwise>
    </c:choose>
    </body>
</html>
