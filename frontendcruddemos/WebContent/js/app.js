/**
 * 
 */
var app=angular.module("app",['ngRoute'])
app.config(function($routeProvider)
		{
	$routeProvider
	.when('/getallpersons',{controller:'PersonCtrl',templateUrl:'views/persondetails.html'})
	.when('/addperson',{controller:'PersonCtrl',templateUrl:'views/personform.html'})
	.when('/updateform/:id',{controller:'PersonCtrl',templateUrl:'views/updateform.html'})
    .otherwise({templateUrl:'views/main.html'})
	})