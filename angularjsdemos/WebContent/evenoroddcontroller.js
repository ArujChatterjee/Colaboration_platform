/**
 * 
 */
app.controller('EvenOrOddCtrl',function($scope){
	$scope.evenOrOdd=function(){
		alert('entered number is'+$scope.number)
		if($scope.number%2==0)
			$scope.result="Even"
			else
				$scope.result="odd"
		
		
		
	}
})