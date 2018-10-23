/**
 * 
 */
app.controller('PersonCtrl',function($scope){
	$scope.person={'firstname':'aruj','lastname':'chatterjee','email':'arujchatterjee@gmail.com'}
	$scope.addPerson=function(){
		
		alert($scope.p)
		console.log($scope.p)
		
	}
})