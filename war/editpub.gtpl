<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Green Forest  
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20110306

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>inKLEINations » Publishing</title>
<link rel="stylesheet" href="/css/main.css" type="text/css" />
</head>
<body>
<% def publication = request.getAttribute("publication") %>
<div id="wrapper">
	<div id="menu">
		<ul>
			<li class="current_page_item"><a href="#">Home</a></li>
			<li><a href="#">Family</a></li>
			<li><a href="#">Blog</a></li>
			<li><a href="#">Publishing</a></li>
			<li><a href="#">Audio</a></li>
			<li><a href="#">Links</a></li>
			<li><a href="#">Contact</a></li>
		</ul>
	</div>
	<!-- end #menu -->
	<div id="header">
		<div id="logo">
			<h1><a href="#">inKLEINations   </a></h1>
			<p> design by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a></p>
		</div>
	</div>
	<!-- end #header -->
	<div id="page">
	<div id="page-bgtop">
	<div id="page-bgbtm">
		<div id="content">
			<div class="post">
				<div class="entry">					
					<div class="info">
					 <h2>Publication</h2><br />
					 </div>
					<form action="${blobstore.createUploadUrl('/updatepub.groovy')}" 
			                method="post" enctype="multipart/form-data">
			            <p>
				          <label>Cover:</label>
			              <input type="file" name="cover">
                       <p>
				       <p>
					          <label>File (PDF):</label>
				              <input type="file" name="pdf">
		                       <p>
		                      <label>Title:</label>
	                          <input type="text" name="title" value="${publication.title}" />
	                       </p>
	                       <p>
	                          <label>Author:</label>
	                          <input type="text" name="author" value="${publication.author}" />
	                       </p>
	                       <p>
	                          <label>Page count:</label>
	                          <input type="text" name="pageCount" value="${publication.pageCount}" />
	                       </p>
	                       <p>
	                          <label>Description:</label>
	                          <textarea name="description">${publication.description}</textarea>
	                       </p>
                       <p>
                          <input type="hidden" name="id" value="${publication.key.id}" />
                       </p>

                       <p>
					      <input type="submit" value="Submit" />
					   </p>
					</form>
				</div>
			</div>
		<div style="clear: both;">&nbsp;</div>
		</div>
		<!-- end #content -->
		<div id="sidebar">
			<ul>
				<li>
					<div id="search" >
					<form method="get" action="#">
						<div>
							<input type="text" name="s" id="search-text" value="" />
							<input type="submit" id="search-submit" value="GO" />
						</div>
					</form>
					</div>
					<div style="clear: both;">&nbsp;</div>
				</li>
				<li>
					<h2>Aliquam tempus</h2>
					<p>Mauris vitae nisl nec metus placerat perdiet est. Phasellus dapibus semper consectetuer hendrerit.</p>
				</li>
				<li>
					<h2>Categories</h2>
					<ul>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
					</ul>
				</li>
				<li>
					<h2>Blogroll</h2>
					<ul>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
					</ul>
				</li>
				<li>
					<h2>Archives</h2>
					<ul>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	</div>
	</div>
	<!-- end #page -->
</div>
	<div id="footer">
		<p>Copyright (c) 2008 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a>.</p>
	</div>
	<!-- end #footer -->
</body>
</html>