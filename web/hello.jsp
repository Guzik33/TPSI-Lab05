<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 5</title>
    </head>
    <body>
        <h1>Witamy w JSP!</h1>
        Licznik odwiedzin: ${licznik}
        <br><br>
        
        
        <table border =\"1\" align = \"center\"> 
        <tr> <th> Imie</th> <th> Nazwisko </th> <th> email </th> </tr>
        <c:forEach items="${studenci}" var="student">
            <tr>
                <th> ${student.getFirstName()} </th> <th> ${student.getLastName()} </th> <th> ${student.getEmail()} </th>
            </tr>    
        </c:forEach>
        

        </table>
        <br><br>
        
<!--        Przenosze sie do HelloServlet.java-->
                <form action='/Lab05/hello' method='get'>
                    
            Imie:
            <input type='text' name='firstName'>
            Nazwisko:
            <input type='text' name='lastName'>
            Email:
            <input type='text' name='email'>
            <input type='submit'>
  
        </form>
<br>
<br>        
    </body>
</html>
