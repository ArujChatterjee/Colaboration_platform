/**
 * 
 */
app.factory('PersonService',function($http)
	{
	var personService={}
	personService.getAllPersons=function()
	{
		alert('entering getAllPersons in personService')
		return $http.get("http://localhost:8096/middlewarecruddemo/persons")
		
		
	}
	personService.savePerson=function(person)
	{
		return $http.post("http://localhost:8096/middlewarecruddemo/addperson",person)
	}
	personService.deletePerson=function(id){
		return $http["delete"]("http://localhost:8096/middlewarecruddemo/deleteperson?id="+id)
	}
	personService.getPerson=function(id)
	{
		return $http.get("http://localhost:8096/middlewarecruddemo/getperson/"+id)
	}
	
	personService.updatePerson=function(person)
	{
		return $http.put("http://localhost:8096/middlewarecruddemo/updateperson",person)
	}
	
	
	
	
	return personService;

	
	
	
	}	)


