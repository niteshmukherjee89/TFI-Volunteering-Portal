<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<br/><br/><br/>
<div class="card">
  <div class="card-body">
    <c:choose>
   		<c:when test="${regStatus}">
   			<p align="center"> 
   			Congratulations! You have successfully registered for the Opportunity.<br/>
   			The opportunity creator has been notified. You would hear back shortly from them.
   			</p>
   		
   		</c:when> 
   		<c:otherwise>
   			<p align="center"> 
   				Looks like you have already registered for that Opportunity with that emailID!<br/>
   				Please wait for the creator to respond.
   			</p>
   		</c:otherwise>    
	</c:choose>
  </div>
</div>


<%@ include file="common/footer.jspf"%>