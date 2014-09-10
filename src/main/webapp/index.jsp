<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<html data-ng-app="demoApp">
	<head>
		<script src="scripts/angular.js"></script>
		<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-route.js"></script>
		<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-resource.js"></script>
		<script src="scripts/app.js"></script>
	<meta charset="ISO-8859-1">
	<title>RouteEx</title>
	</head>
		<body>
			<div data-ng-controller="Controller1">
			  <form data-ng-submit="createPerson()">
			  <p>Create a new user:</p>
			  <p>
			    Name: <input data-ng-model="name" />
			  </p>
			  <input type="submit" value="Create" />
			  </form>
			  <p data-ng-show="newUser">
			     New User created with name: {{newUser}}
			  </p>
			  <button data-ng-click="getPerson()" >Get</button>
			  <p data-ng-show="newUserName">
			    User : {{newUserName}}
			  </p>
			   <button data-ng-click="getAllPerson()" >GetAll</button>
			   <p data-ng-show="users">
<!-- 	this will get all user object		    User : {{users}} -->
			  <ul>
			    <li  data-ng-repeat="user in users | filter:q| orderBy:'name'">
			       {{user.name}} :- {{user.createdAt}}.
			    </li>
			    <li data-ng-if="q.length == 0">
			      <strong>No results found...</strong>
			    </li>
	 		 </ul>
	 		 </p>
		</div>
		</body>
</html>