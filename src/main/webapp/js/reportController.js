/**
*  Access to the previously created module 'rideapp'
 */
(function() {
	let rideapp = angular.module('rideapp');

	rideapp.controller('reportController', function($scope, $http) {
		
		
		
		$scope.getReport = function() {
			var config = { params : $scope.front }
			
			$http.get("/aron2wheels/webapi/rides/report", config)
			.then(
				function(response) {
					$scope.searchResults = response.data;
				},
				function error(response) {
					//TODO error message
				});
		};	
		
			
			
			
	});	
})()
		

			
