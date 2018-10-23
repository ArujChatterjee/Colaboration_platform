/**
 * 
 */
/**
 * 
 */
app.controller('PersonCtrl',function($scope,PersonService,$routeParams,$location)
{
	var id=$routeParams.id
	if(id!=undefined)
		{
	PersonService.getPerson(id).then(function(response)
	{
		$scope.person=response.data
	},
	function(response)
	{
		$scope.error=resaponse.data
	})
		}
	function getAllPersons(){
	PersonService.getAllPersons().then(function(response){
		alert('success')
		$scope.persons=response.data
		console.log(response.data)
        console.log(response.status)		
		
	},
			
			
			
			
			function(response){
		
		alert('error')
		console.log(response.data)
		console.log(response.status)
		
		
		
	})
	}
	getAllPersons()
	
	$scope.savePerson=function(){
		console.log($scope.person)
		PersonService.savePerson($scope.person).then(function(response){
		
		$scope.person={}
		getAllPersons()

		alert('person details inserted successfully')
		
	},
	function(response){
		$scope.error=response.data
		console.log(response.status)
		$scope.person={}
	})
}
	
	$scope.deletePerson=function(id){
		PersonService.deletePerson(id).then(function(response)
				
		{
			alert('deleted person details successfully..')
			getAllPersons()
		},function(response){
			$scope.error=response.data
		})
		}
	$scope.updatePerson=function(person)
	{
		PersonService.updatePerson(person).then(
		function(response)
		{
			alert('updated person details successfully....')
			$location.path('/getallpersons')
		},
		function(response)
		{
			$scope.error=response.data
		})
	}
})