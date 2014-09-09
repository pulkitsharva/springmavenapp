var personControllers = angular.module('personControllers', []);

personControllers.controller('Controller1',function($scope, $http) {
	
	console.log("coming to controller");
	
	$scope.createPerson = function() {
		  $http.post('/rest/emp/new/create', {
	          "name": $scope.name
	      })
	      .success(function(data) {
	        $scope.name = '';
	        $scope.newUserId = data;
	      })
	      .error(function(data) {
	        console.log('error: data = ' , data);
	      });
	    };
	   
	 console.log("----done----");
  });