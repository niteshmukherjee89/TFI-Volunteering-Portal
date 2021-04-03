<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>



<br/>
<h5 align="center">Please enter the below details to register for the selected Opportunity</h5> 

<br/>
<div class="container">
<form method="post" action="validateAndRegisterOpportunity">

	<div class="card">
  	<div class="card-body">
		<div class="form-row">
		    <div class="col-4">
		      <input type="text" class="form-control" id="vol_email" name="vol_email" placeholder="Enter your Email Address" required>
		    </div>
		    <div class="col-4">
		      <input type="text" class="form-control" id="vol_mobile" name="vol_mobile" placeholder="Enter your Mobile Number" required>
		    </div>
		    <div class="col-4">
		      <input type="text" class="form-control" id="vol_avail" name="vol_avail" placeholder="Enter your daily availability (hrs)" required>
		    </div>
		    <div class="col-4" >
		      <br/>
		       <textarea align="center" class="form-control rounded-0" id="vol_reason" name="vol_reason" placeholder="Enter details on why you chose this opportunity" rows="5" required></textarea>
		    </div>
		    <div class="col-4">
		      <input type="hidden" class="form-control" id="oppId" name="oppId" value=${oppId}>
		    </div>
		 </div>
	</div>
	</div>
	<br/>
	<div align="center"> <button type="submit" class="btn btn-primary">Register</button> </div>
    
  </form>

</div>


<%@ include file="common/footer.jspf"%>