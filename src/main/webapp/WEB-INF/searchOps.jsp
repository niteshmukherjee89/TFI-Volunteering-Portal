<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<br/>
<h5 align="center">Search for Volunteering opportunities that might interest you using below criterias</h5> 
<p align="center">
<i>Tip: If you aren't sure of the criterias, hit the search button to view all available Opportunities </i>
</p>
<br/><br/>
<div class="container">
<form method="post" action="searchOpportunities">

	<div class="card">
  	<div class="card-body">
		<b>Location Details:</b>
  		<div class="form-row">
		    <div class="col-4">
		      <input type="text" class="form-control" id="area" name="area" placeholder="Search using area/street/locality details">
		    </div>
		    <div class="col-4">
		      <input type="text" class="form-control" id="city" name="city" placeholder="Search using city name">
		    </div>
		    <div class="col-4">
		      <input type="text" class="form-control" id="state" name="state" placeholder="Search using State name">
		    </div>
		 </div>
	</div>
	</div>
	<br/>
	
	<div class="card">
  	<div class="card-body">
  		<b>Timeline Details:</b>
  		<div class="form-row">
		  	<div class="col-3">
		      <input type="text" class="form-control" id="startDate" name="startDate" placeholder="Start date in DD/Mon/YY format">
		    </div>
		    <div class="col-3">
		      <input type="text" class="form-control" id="endDate" name="endDate" placeholder="End date in DD/Mon/YY format">
		    </div>
		    <div class="col-3">
		      <input type="text" class="form-control" id="dailyHrs" name="dailyHrs" placeholder="Daily hours expectations">
		    </div>
		 </div>
	</div>
	</div>
	<br/>
	<div align="center"> <button type="submit" class="btn btn-primary">Search</button> </div>
    
    
  </form>

</div>
<%@ include file="common/footer.jspf"%>