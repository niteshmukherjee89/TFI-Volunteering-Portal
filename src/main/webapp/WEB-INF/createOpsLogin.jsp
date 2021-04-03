<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>



<br/>
<h5 align="center">Please login with your staff/fellowship credentials</h5> 

<br/>
<div class="container">
<form method="post" action="createOpsForm">

	
	<div class="card">
  	<div class="card-body">
	
			<div class="col-10">
			<label><b>Email address:</b></label>
			</div>
			<div class="col-10">
				<input type="text" width=50px class="form-control" id="vol_email" name="vol_email" placeholder="Enter your Email Address" required>
			</div>
			<br/>
			<div class="col-10">
			<label><b>Password:</b></label>
			</div>
			 <div class="col-10">
				<input type="password" width=50px class="form-control" id="vol_pass" name="vol_pass" placeholder="Enter your password" required>
			</div>
	
	</div>
	</div>
	<br/>
	<div align="center"> <button type="submit" class="btn btn-primary">Login</button> </div>
    
  </form>

</div>


<%@ include file="common/footer.jspf"%>