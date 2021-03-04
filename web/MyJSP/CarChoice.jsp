<%-- 
    Document   : CarChoice
    Created on : Nov 17, 2019, 12:11:05 PM
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
        
        
        <c:if test="${param.ctype eq 'HatchBack'}" >
            We have EON, Centro and Neor in this category
        </c:if>
            
             <c:if test = "${param.ctype eq 'Sedon'}" >
            We have Xcent and i20 in this category
        </c:if>
        
            <c:if test = "${param.ctype eq 'SUV'}" >
            We have Creta in this category
        </c:if>
            
            
    </body>
</html>
