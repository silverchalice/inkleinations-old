<%
  def publications = request.getAttribute("publications")
  include '/WEB-INF/includes/header.gtpl'
%>
		<div id="content">
			<div class="post">
				<div class="entry">					
					<div class="info">
					 <h2>Publication</h2><br />
					 </div>

					<table>
					 <% publications.each { publication -> %>
                         <tr> 
                             <td> 
						         <a href="/download_pdf/${publication.key.id}"><img src="/image.groovy?key=${publication.coverKey}" height="269" width="180" border="0" style="margin-right:10px;" /></a>                                       
						     </td> 
						     <td><p><a href="/download_pdf/${publication.key.id}"><strong>${publication.title}</strong></a></p> 
						         Today's world is enamoured with tales that never happened and heroes that never existed. Children are encouraged to use their imagination to create their own reality. Is it right for God's people, claiming to believe in absolute truth, to find pleasure in lies? Does truth matter anymore? <br />
						By ${publication.author}.
						<br /> 
						16 pages.
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