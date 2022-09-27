<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create_Leads</title>
</head>
<body>
  <h2>Create_NewLeads</h2>
      <Form action="saveLead" method="post">
        <pre>
	          First Name<input type="test" name="firstName"/>
	          Last Name<input type="text" name="lastName"/>
	          Address<input type="test" name="add"/>
	          Email<input type="email" name="email"/>
	          Mobile <input type="text" name="mobile"/>
	          <input type="submit" value="save"/>
         </pre> 
      </Form>
     ${msg}

</body>
</html>