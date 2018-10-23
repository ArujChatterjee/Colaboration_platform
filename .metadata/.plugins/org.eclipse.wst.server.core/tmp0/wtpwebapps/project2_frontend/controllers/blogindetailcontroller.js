/**
 * 
 */
app.controller('BlogInDetailCtrl',function($scope,BlogService,$location,$rootScope,$routeParams,$sce){
var blogPostId=$routeParams.id

if(blogPostId!=undefined)
	{
	BlogService.getBlog(blogPostId).then(function(response){
	$scope.blogPost=response.data
	$scope.content=$sce.trustAsHtml($scope.blogPost.blogContent)
	},function(response)
	{
		$scope.error=response.data
		if(response.status==401)
			$location.path('/login')
	})
	
	}
$scope.approve=function(blogPost)
{
BlogService.approve(blogPost).then(
function(response)
{
	$location.path('/blogsWaitingForApproval/1')
	},function(response)
	{
		$scope.error=response.data
		if(response.status==401 && response.data.errorCode==5)
			$location.path('/login')
	})	
}
$scope.reject=function(blogPost)
{
BlogService.reject(blogPost).then(
function(response)
{
	$location.path('/blogsWaitingForApproval/1')
	},function(response)
	{
		$scope.error=response.data
		if(response.status==401 && response.data.errorCode==5)
			$location.path('/login')
	})	
}


})
