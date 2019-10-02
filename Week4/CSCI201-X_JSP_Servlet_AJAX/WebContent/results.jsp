<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, viewport-fit=cover">
    <link rel="shortcut icon" type="image/png" href="favicon.png">
    
	<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css?8096">
	<link rel="stylesheet" type="text/css" href="style.css?5667">
	<link rel="stylesheet" type="text/css" href="./css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="./css/feather.min.css">
	
    <title>Results</title>


    
<!-- Analytics -->
 
<!-- Analytics END -->
    
</head>
<body>
<!-- Main container -->
<div class="page-container">
    
<!-- nav -->
<div class="bloc l-bloc" id="nav">
	<div class="container bloc-sm">
		<div class="row">
			<div class="col">
				<nav class="navbar navbar-light row navbar-expand-md" role="navigation">
					<a class="navbar-brand" href="index.jsp">JSP, Servlet, AJAX Demo</a>
					<button id="nav-toggle" type="button" class="ml-auto ui-navbar-toggler navbar-toggler border-0 p-0" data-toggle="collapse" data-target=".navbar-28448" aria-expanded="false" aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse navbar-28448">
						<ul class="site-navigation nav navbar-nav ml-auto">
							<li class="nav-item">
								<a href="index.jsp" class="nav-link">Home</a>
							</li>
						</ul>
					</div>
					<div class="navbar-content-area d-block col-lg-1 col-1">
						<div class="row">
							<div class="align-self-center col-4 text-right col-lg-4">
								<a href="https://www.youtube.com/channel/UCZ6naqKsd2WwU3LCajGKFTg" target="_blank"><span class="fa fa-youtube-play float-lg-none icon-md"></span></a>
							</div>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>
</div>
<!-- nav END -->

<!-- JSP for loading name, email, and message -->
<%
		String name = request.getParameter("nameInput");
		String email = request.getParameter("emailInput");
		String message = request.getParameter("messageInput");
		String search = (String)request.getAttribute("results");
		if (name == null) {
			name = "None";
		}
		if (email == null) {
			email = "None";
		}
		if (message == null) {
			message = "None";
		}
		if (search == null) {
			search = "None";
		}
%>
<!-- JSP end -->

<!-- resultsBody -->
<div class="bloc l-bloc" id="resultsBody">
	<div class="container bloc-md">
		<div class="row">
			<div class="col-12">
				<ul class="list-unstyled">
					<li>
						<h3 class="mg-md">
							Name
						</h3>
						<p id="nametext">
							<%= name %>
						</p>
					</li>
					<li>
						<h3 class="mg-md">
							Email
						</h3>
						<p id="emailtext">
							<%= email %>
						</p>
					</li>
					<li>
						<h3 class="mg-md">
							Message
						</h3>
						<p id="messagetext">
							<%= message %>
						</p>
					</li>
					<li>
						<h3 class="mg-md">
							Search
						</h3>
						<p id="messagetext">
							<%= search %>
						</p>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- resultsBody END -->

<!-- ScrollToTop Button -->
<a class="bloc-button btn btn-d scrollToTop" onclick="scrollToTarget('1',this)"><span class="fa fa-chevron-up"></span></a>
<!-- ScrollToTop Button END-->


</div>
<!-- Main container END -->
    

<script src="./js/jquery-3.3.1.min.js?2715"></script>
<script src="./js/bootstrap.bundle.min.js?4442"></script>
<script src="./js/blocs.min.js?8017"></script>
<script src="./js/lazysizes.min.js" defer></script>
<!-- Additional JS END -->

</body>
</html>
