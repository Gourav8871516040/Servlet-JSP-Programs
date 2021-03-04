<%-- 
    Document   : SelectCar
    Created on : Nov 17, 2019, 12:04:46 PM
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
        Please select a category of car, you want to purchase :-<br/><br/>
        <form action="CarChoice.jsp" method="post">
            <input type="radio" name="ctype" value="HatchBack"/>Hatch Back Cars<br/><br/>
            <input type="radio" name="ctype" value="Sedon"/>Sedon<br/><br/>
            <input type="radio" name="ctype" value="SUV"/>SUV<br/><br/>
            <input type="submit" value="show"/>
            
        </form>
            
        
    </body>
</html>
