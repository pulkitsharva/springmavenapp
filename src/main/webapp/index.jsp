<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html data-ng-app="demoApp">

<head>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-route.js"></script>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-resource.js"></script>
<script src="app.js"></script>
<meta charset="ISO-8859-1">
<title>RouteEx</title>
</head>
<body>
	<form data-ng-submit="createPerson()">
  <p>Create a new user:</p>
  <p>
    Name: <input data-ng-model="name" />
  </p>
  <input type="submit" />
 
  <p data-ng-show="newUserId">
    User created with id: {{newUserId}}
  </p>
</form>
</body>
</html>