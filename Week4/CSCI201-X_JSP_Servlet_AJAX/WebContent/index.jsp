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
    
	<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css?7276">
	<link rel="stylesheet" type="text/css" href="style.css?7433">
	<link rel="stylesheet" type="text/css" href="./css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="./css/feather.min.css">
	
    <title>Home</title>

	<script>
		function doSearch() {
			$.ajax({
				url: "DemoServlet",
				data: {
					ajax: "1",
					search: $("#searchinput").val()
				},
				success: function(result) {
					$("html").empty();
				    $("html").append(result);
				}
			})
		}
	</script>
    
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
					<a class="navbar-brand" href="./">JSP, Servlet, AJAX Demo</a>
					<button id="nav-toggle" type="button" class="ml-auto ui-navbar-toggler navbar-toggler border-0 p-0" data-toggle="collapse" data-target=".navbar-28448" aria-expanded="false" aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse navbar-28448">
						<ul class="site-navigation nav navbar-nav ml-auto">
							<li class="nav-item">
								<a href="./" class="nav-link">Home</a>
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

<!-- JSP checking for existing error message -->
<%
		String errorMessage = (String)request.getAttribute("errorMessage");
		String email = "";
		String message = "";
		if (errorMessage != null) {
			email = request.getParameter("emailInput");
			message = request.getParameter("messageInput");
		} else {
			errorMessage = "";
		}
%>
<!-- JSP end -->

<!-- demobody -->
<div class="bloc l-bloc none " id="demobody">
	<div class="container bloc-md">
		<div class="row">
			<div class="col-md-6">
				<form id="form_1" data-form-type="blocs-form" action="DemoServlet">
					<div class="form-group" id="formname">
						<label>
							Name
						</label>
						<input id="name" name="nameInput" class="form-control"/>
						<%= errorMessage %>
					</div>
					<div class="form-group" id="formemail">
						<label>
							Email
						</label>
						<input id="email" name="emailInput" value="<%= email %>" class="form-control" type="email" data-error-validation-msg="Not a valid email address" required />
					</div>
					<div class="form-group" id="formmsg">
						<label>
							Message
						</label><textarea id="message" name="messageInput" class="form-control" rows="4" cols="50" required><%= message %></textarea>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" id="formcheck" data-validation-minchecked-message="You must agree to this!" data-validation-minchecked-minchecked="1" name="formcheck" />
						<label class="form-check-label">
							I agree to all terms and conditions.
						</label>
					</div> 
					<button class="bloc-button btn btn-lg btn-block btn-clean btn-d" type="submit" id="formsubmit">
						Submit
					</button>
				</form>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label>
						Search
					</label>
					<input class="form-control" placeholder="Joined a Mesmerizing Prom, Happy Dancing!" id="searchinput" />
				</div><a onclick="doSearch();" class="btn btn-d btn-lg btn-clean btn-block" id="searchbutton"><span class="feather-icon icon-search"></span></a>
			</div>
		</div>
	</div>
</div>
<!-- demobody END -->

<!-- ScrollToTop Button -->
<a class="bloc-button btn btn-d scrollToTop" onclick="scrollToTarget('1',this)"><span class="fa fa-chevron-up"></span></a>
<!-- ScrollToTop Button END-->


</div>
<!-- Main container END -->
    

<script src="./js/jquery-3.3.1.min.js?5156"></script>
<script src="./js/bootstrap.bundle.min.js?4376"></script>
<script src="./js/blocs.min.js?6449"></script>
<script src="./js/jqBootstrapValidation.js"></script>
<script src="./js/formHandler.js?8991"></script>
<script src="./js/lazysizes.min.js" defer></script>
<!-- Additional JS END -->

</body>
</html>
