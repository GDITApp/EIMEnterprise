<%-- 
    Document   : index
    Created on : Nov 6, 2015, 1:18:19 PM
    Author     : suyogparajuli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EIM</title>
    </head>
    <body>
        
        <form method="POST" name="UserSubmit" action="/EIM/submitOption.html">
            
            <label>Select a value</label>
            <input type="text" id="OneorTwo" name="OneorTwo" placeholder="Select an option" list="recomm" />
					<datalist id="recomm">
					<option value="1">
					<option value="2">
					</datalist>
            <input type="submit" value="submit"/>
            
        </form>
        
    </body>
</html>
