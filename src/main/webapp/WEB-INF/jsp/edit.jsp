<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Search</title>
</head>
<body>
        <h1>User Login</h1>
        	<form action = "<%=request.getContextPath()%>/edit" method= "post" >
        	<table>
        	    <tr>
        	        <td>Enter New User ID: </td>
        	        <td><input type = "text" name= "ID" /></td>
        	    </tr>
                <td>Enter New User Name: </td>
                <td><input type = "text" name= "name" /></td>
        	    </tr>
        	    <br/>

        	    <input type = "submit" value = "submit" />
        	</table>

</body>
</html>
