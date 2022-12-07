/**
* Create a new module named 'rideapp''
 */
 
 (function() {
 	var rideapp = angular.module('rideapp', ['ngRoute']);
 	
 	rideapp.config(function($routeProvider) {
		  $routeProvider
		  .when("/viewall", {
		    templateUrl : "viewAll.html",
		    controller: "searchController1"
		  })
		  .when("/create", {
		    templateUrl : "create.html",
		    controller: "clearController"
		  })
		  .when("/stack", {
		    templateUrl : "stack.html"
		  })
		  .when("/resume", {
		    templateUrl : "resume.html"
		  })
		  .when("/front", {
		  	templateUrl: "front.html",
		  	controller: "reportController"
		  })
		  	.when("/update/:movieId", {
		  	templateUrl: "update.html",
		  	controller : "updateController"
		  })
		  .otherwise({
			  templateUrl: "front.html",
			  controller: "reportController"
		  });
		});
 
 })()