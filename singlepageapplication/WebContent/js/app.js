/**
 * 
 */
var app=angular.module("app",['ngRoute'])
app.config(function($routeProvider)
		{
	$routeProvider
	.when('/students',{controller:'StudentCtrl',templateUrl:'views/studentdetails.html'})
	.when('/employees',{controller:'EmployeeCtrl',templateUrl:'views/employeedetails.html'})
	.when('/departments',{controller:'DeptCtrl',templateUrl:'views/departmentdetails.html'})
	.when('/home',{templateUrl:'views/home.html'})
    .otherwise({templateUrl:'views/home.html'})
	})
