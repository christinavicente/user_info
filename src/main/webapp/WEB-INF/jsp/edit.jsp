<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Search</title>
</head>
<body>
        <h1>User Login</h1>
        	<form action = "<%=request.getContextPath()%>/usersearch" method= "post" >
        	<table>
        	    <tr>
        	        <td>Enter User ID: </td>
        	        <td><input type = "text" name= "ID" /></td>
        	    </tr>
        	    <br/>

        	    <input type = "submit" value = "submit" />
        	</table>

</body>
</html>