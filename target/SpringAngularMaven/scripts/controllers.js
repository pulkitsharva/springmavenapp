var personControllers = angular.module('personControllers', []);

personControllers.controller('Controller1', ['$scope', '$http',
     function($scope, $http) {
	$scope.createPerson = function() {
	      $http.post('/rest/emp/new/create', {
	          "name": $scope.name
	      })
	      .success(function(data, status, headers, config) {
	        $scope.name = '';
	        $scope.newUserId = data;
	      })
	      .error(function(data, status, headers, config) {
	        console.log('error: data = ' , data);
	      });
	    };                                            
	}
  ]);