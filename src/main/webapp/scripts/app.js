var demoApp=angular.module('demoApp',['ngRoute']);

demoApp.controller('Controller1', function ($scope,$http) {
	console.log("In controller");
	var urlBase="http://localhost:8080/SpringAngularMaven/";
	$http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";
	
	$http.get('http://localhost:8080/SpringAngularMaven/rest/emp/dummy').
	success(function(data) {
        $scope.tasks = data;
        console.log(data);
        $scope.newUserId = data;
        
});
//	$http.createPerson = function createPerson() {
//		
//		console.log("coming to function");
//	      $http.post(urlBase+'/rest/emp/new/create', {
//	          "name": $scope.name
//	      })
//	      .success(function(data, status, headers, config) {
//	        $scope.name = '';
//	        $scope.newUserId = data;
//	      })
//	      .error(function(data, status, headers, config) {
//	        console.log('error: data = ' , data);
//	      });
//	    }; 
});
//demoApp.config(function($routeProvider){
//	$routeProvider
//	.when('/submit',{
//		controller:'Controller1',
//		templateUrl:'index.jsp'
//		})
//		.otherwise({redirectTo:'/index'});
//	});

	
//function Controller1($scope,$http)
//{
//	console.log("Coming here");
//	$http.post('/rest/emp/new/create', {
//        "name": $scope.name
//    })
//    .success(function(data, status, headers, config) {
//      $scope.name = '';
//      $scope.newUserId = data;
//    })
//    .error(function(data, status, headers, config) {
//      console.log('error: data = ' , data);
//    });
//  }
//demoApp.controller('Controller1',Controller1);

//function Controller1($scope) {
//    $scope.friends = [
//                      {name:'Joyua', age:15, gender:'girl'},
//                      {name:'John', age:25, gender:'boy'},
//                      {name:'Jessie', age:30, gender:'girl'},
//                      {name:'Johanna', age:28, gender:'girl'},
//                      {name:'Joy', age:15, gender:'girl'},
//                      {name:'Mary', age:28, gender:'girl'},
//                      {name:'Peter', age:95, gender:'boy'},
//                      {name:'Sebastian', age:50, gender:'boy'},
//                      {name:'Erika', age:27, gender:'girl'},
//                      {name:'Patrick', age:40, gender:'boy'},
//                      {name:'Pulkit', age:24, gender:'boy'},
//                      {name:'Samantha', age:60, gender:'girl'}
//                    ];
//}
//
//demoApp.controller('Controller1',Controller1);
//function Controller2($scope) {
//    $scope.friends = [
//                      {name:'Joyua', age:15, gender:'girl'},
//                      {name:'John', age:25, gender:'boy'},
//                      {name:'Jessie', age:30, gender:'girl'},
//                      {name:'Johanna', age:28, gender:'girl'},
//                      {name:'Joy', age:15, gender:'girl'},
//                      {name:'Mary', age:28, gender:'girl'},
//                      {name:'Peter', age:95, gender:'boy'},
//                      {name:'Sebastian', age:50, gender:'boy'},
//                      {name:'Erika', age:27, gender:'girl'},
//                      {name:'Patrick', age:40, gender:'boy'},
//                      {name:'Pulkit', age:24, gender:'boy'},
//                      {name:'Sharva', age:60, gender:'girl'}
//                    ];
//}
//
//demoApp.controller('Controller2',Controller2);


		