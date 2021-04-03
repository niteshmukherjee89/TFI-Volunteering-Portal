<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<br/><br/><br/>
<div class="card">
  <div class="card-body">
    <c:choose>
   		<c:when test="${saveStatus}">
   			<p align="center"> 
   			Congratulations! You have successfully created the new Opportunity<br/>
   			</p>
   		</c:when> 
   		<c:otherwise>
   			<p align="center"> 
   				Looks like there was some issue in creating the opportunity. Please try again.
   			</p>
   		</c:otherwise>    
	</c:choose>
  </div>
</div>


<%@ include file="common/footer.jspf"%>