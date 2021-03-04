<%-- 
    Document   : MobPerShowPerson
    Created on : Nov 17, 2019, 10:03:37 AM
    Author     : User
--%>

<%@page import="MyClasses.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Information of Person:-<br/><br/>
        <jsp:useBean id="mobprsn" class="MyClasses.Person" scope="request"/>
        Person Name = <jsp:getProperty name="mobprsn" property="pname"/><br/><br/>
        Person's Mobile information :-<br/><br/>
        Mobile name: ${mobprsn.m.mname}<br/><br/>
        Mobile Price: ${mobprsn.m.price}
    </body>
</html>
