/**
*  Access to the previously created module 'rideapp'
 */
(function() {
	let rideapp = angular.module('rideapp');

	rideapp.controller('searchController1', function($scope, $http) {
		
		
		$scope.getAllRides = function() {
			$http.get("/aron2wheels/webapi/rides")
			.then(function(response) {
				$scope.rides = response.data;
				console.log('number of Rides: ' + $scope.rides.length);
			}, function(response) {
				console.log('error http GET rides: ' + response.status);
			});
		};
		
		$scope.getAllRides();
		
		
	});	
})()
		
/** 		$scope.getReport = function() {
			$http.get("/aron2wheels/webapi/rides/report?skill=" + {{sel1.value}} + "&length=" + sel2.value);
			.then(function(response) {
			$scope.rides = response.date;
			}, function(response) {
				console.log('error http GET ride report: ' + response.status);
			})
		}*/
		
	/** $scope.goToUpdateView = function(movieId) {
			console.log('go to update view');
			console.log('movieId:' + movieId);
			$location.path('/update/' + movieId);
		} */

/**	$scope.rides = [
			{
        "length": "Jaunt",
        "link": "nebo.html",
        "name": "Nebo Climb",
        "skill": "Expert",
        "tease": "2 miles of 11 hairpin turns and 1000 feet of elevation"
    },
    {
        "length": "Ride",
        "link": "ozarkLoop.html",
        "name": "Ozark loop",
        "skill": "Intermediate",
        "tease": "with all the fun on this ride, don't forget an important stoping place"
    },
    {
        "length": "Ride",
        "link": "petitJeanL.html",
        "name": "Petit Jean Long",
        "skill": "Intermediate",
        "tease": "a nice ride for guests of the park"
    },
     {
        "length": "Ride",
        "link": "pigTrail.html",
        "name": "Pig Trail",
        "skill": "Expert",
        "tease": "The pig Trail and then some"
    },
    {
        "length": "Jaunt",
        "link": "petitJeanS.html",
        "name": "Petit Jean Short",
        "skill": "Beginner",
        "tease": "A quicker run up and down the mountain"
    },
];*/
			
