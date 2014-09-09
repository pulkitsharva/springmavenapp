var personControllers = angular.module('personControllers', []);

personControllers.controller('Controller1', ['$scope', '$http',
     function($scope, $http) {
	console.log("coming to controller");
	$scope.createPerson = function() {
		console.log("coming to function");
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
	}
  ]);