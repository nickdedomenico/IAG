<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resources/css/main-menu.css">
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

<title>View Mainframe Profile</title>
</head>

  <body>

    <nav class="navbar navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">PNC IAG</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">My Info</a></li>
            <li><a href="#">Logout</a></li>
            <li><a href="#">Profile</a></li>
            <li><a href="#">Help</a></li>
          </ul>
          <p class="navbar-text">
            Logged in as ${theUser.userID}, ${theUser.userFirstName} ${theUser.userLastName}
          </p>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">Main menu <span class="sr-only">(current)</span></a></li>
            <li><a href="#">Inbox</a></li>
            <li><a href="#">My Info</a></li>
            <li><a href="#">Change Password</a></li>
          </ul>
          <h4 class="nav nav-sidebar">Managers</h4>
          <ul class="nav nav-sidebar">
            
            	
            	<li><a href="#">By Name</a></li>
            	<li><a href="#">By Employee</a></li>
            	
          </ul>  
            <h4 class="nav nav-sidebar">Application Owners</h4>
            	<ul class="nav nav-sidebar">
            	<li><a href="#">By Name</a></li>
            	<li><a href="#">By Mnemonic</a></li>
            	</ul>
            
            <h4 class="nav nav-sidebar">Reports</h4>
            	<ul class="nav nav-sidebar">
            	<li><a href="#">Active Reports</a></li>
            	<li><a href="#">Archived Reports</a></li>
            	</ul>
            <h4 class="nav nav-sidebar">Miscellaneous</h4>
            	<ul class="nav nav-sidebar">
            	<li class="active"><a href="/viewProfile">View Profile List</a></li>
            	<li><a href="/viewAuthcode">View Authcode List</a></li>
            	</ul>
            <h4 class="nav nav-sidebar">Administrators</h4>
            	<ul class="nav nav-sidebar">
            		<li><a href="">Function1</a></li>
            		<li><a href="">Function2</a></li>
           		</ul>
            
         
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Mainframe Profile List</h1>
      
        </div>
      </div>
    </div>

    
  </body>
</html>

