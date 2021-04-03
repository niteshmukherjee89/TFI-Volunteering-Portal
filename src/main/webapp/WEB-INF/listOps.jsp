<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<br><br>
	
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Opportunities</h3>
		</div>
		<div class="panel-body">
			<table id"opsTable" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th width="5%">OppID</th>
						<th width="15%">OppTitle</th>
						<th width="20%">OppDescription</th>
						<th width="10%">OppStartDate</th>
						<th width="10%">OppEndDate</th>
						<th width="10%">OppDailyHours</th>
						<th width="20%">OppLocation</th>
						<th width="10%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${opportunities}" var="opportunity">
						<tr>
							<td>${opportunity.oppId}</td>
							<td>${opportunity.oppTitle}</td>
							<td>${opportunity.oppDescription}</td>
							<td>${opportunity.oppStartDate}</td>
							<td>${opportunity.oppEndDate}</td>
							<td>${opportunity.oppDailyHrs}</td>
							<td>${opportunity.oppLocationArea},${opportunity.oppLocationCity},${opportunity.oppLocationState}</td>
							<td>
								<a type="button" class="btn btn-success" href="/registerOpp?id=${opportunity.oppId}">Register</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>