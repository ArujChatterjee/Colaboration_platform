/**
 * 
 */
app.factory('BlogService',function($http){
	var blogService={}
	
	blogService.addBlog=function(blog){
		return $http.post("http://localhost:8096/project2_middleware/addblogpost",blog)
	}
	blogService.getBlogsWaitingForApproval=function(){
		return $http.get("http://localhost:8096/project2_middleware/blogswaitingforapproval")
	}
	
	blogService.getBlogsApproved=function(){
		return $http.get("http://localhost:8096/project2_middleware/blogsapproved")
	}
	blogService.getBlog=function(blogPostId){
		return $http.get("http://localhost:8096/project2_middleware/getBlog/"+blogPostId)
	}
	blogService.approve=function(blogPost)
	{
		return $http.put("http://localhost:8096/project2_middleware/approve",blogPost)
	}
	blogService.reject=function(blogPost)
	{
		return $http.put("http://localhost:8096/project2_middleware/reject",blogPost)
	}
	
	
	
	return blogService;
})