<%
  def publications = request.getAttribute("publications")
  include '/WEB-INF/includes/header.gtpl'
%>
		<div id="content">
			<div class="post">
				<div class="entry">					
					<div class="info">
					 <h2>Stuff We've Published</h2>
					 <p>&nbsp;</p>
					 </div>

					<table>
					 <% publications.each { publication -> %>
                         <tr> 
                             <td> 
						         <a href="/pdf/${publication.key.id}"><img src="/image.groovy?key=${publication.coverKey}" height="269" width="180" border="0" style="margin-right:10px;" /></a>                                       
						     </td> 
						     <td><p><a href="/pdf/${publication.key.id}"><strong>${publication.title}</strong></a></p> 
						         ${publication.description} <br />
						By ${publication.author}.
						<br /> 
						${publication.pageCount} pages.<br />
						<br /><a href="/edit_publication/${publication.key.id}">[edit]</a>
						      </p>
							  <p>&nbsp;</p>
							  <p>&nbsp;</p>
						      </td>
						  </tr>
					 <% } %>
					 </table>
				</div>
			</div>
		<div style="clear: both;">&nbsp;</div>
		</div>
<% include '/WEB-INF/includes/footer.gtpl' %>