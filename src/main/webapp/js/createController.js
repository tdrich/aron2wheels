/**
 * Access the previously created module 'rideapp'
 */

(function() {
	var rideapp = angular.module('rideapp');

	rideapp.controller('clearController', function($scope) {			
		
		
		
		
		
		$scope.clear = function() {
			$scope.ride.fname = '';
			$scope.ride.lname = '';
			$scope.ride.email = '';
			$scope.ride.email = ''; 
		}
		
	});
	
})()