<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<c:choose>

   		<c:when test="${loginStatus}">
   			<br/><h5 align="center"> Please submit the below details to create a new opportunity </h5>
   			<div class="container">
			<form method="post" action="saveNewOpportunity">

				<div class="card">
			  	<div class="card-body">
					<div class="form-row">
					    <div class="col-4">
					      <input type="text" class="form-control" id="oppTitle" name="oppTitle" placeholder="Enter the Opportunity Title" required>
					    </div>
					</div>
					<br/>
					<div class="form-row">
					    <div class="col-4">
					      <input type="text" class="form-control" id="oppStartDate" name="oppStartDate" placeholder="Start Date in DD/Month/YY format" required>
					    </div>
					    <div class="col-4">
					      <input type="text" class="form-control" id="oppEndDate" name="oppEndDate" placeholder="End Date in DD/Month/YY format" required>
					    </div>
					    <div class="col-4">
					      <input type="text" class="form-control" id="oppDailyHrs" name="oppDailyHrs" placeholder="Daily hours expected" required>
					    </div>
					 </div>
					 <br/>
					 <div class="form-row"> 
					    <div class="col-4">
					      <input type="text" class="form-control" id="oppArea" name="oppArea" placeholder="Area/Street/Locality for the opportunity" required>
					    </div>
					    <div class="col-4">
					      <input type="text" class="form-control" id="oppCity" name="oppCity" placeholder="City for opportunity" required>
					    </div>
					    <div class="col-4">
					      <input type="text" class="form-control" id="oppState" name="oppState" placeholder="State for opportunity" required>
					    </div>
					  </div>
					  <br/>
					  <div class="form-row">
					    <div class="col-4">
					      <input type="text" class="form-control" id="oppCreator" name="oppCreator" placeholder="Email ID of this opportunity owner" required>
					    </div>
					    <div class="col-4" >
					       <textarea align="center" class="form-control rounded-0" id="oppDesc" name="oppDesc" placeholder="Enter the Opportunity Description" rows="5" required></textarea>
					    </div>
					   </div> 
					 
				</div>
				</div>
				<br/>
				<div align="center"> <button type="submit" class="btn btn-primary">Create</button> </div>
			    
			  </form>
			
			</div>
   		
   		</c:when> 
   		<c:otherwise>
   		<div class="card">
  		<div class="card-body">
   			<p align="center"> 
   				<b>Incorrect credentials! Please login with your valid staff credentials</b>
   			</p>
   		</div></div>
 		</c:otherwise>
 </c:choose>   



<%@ include file="common/footer.jspf"%>