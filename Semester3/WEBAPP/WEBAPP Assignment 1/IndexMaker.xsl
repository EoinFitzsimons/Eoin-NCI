<?xml version="1.0" encoding ="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html"/>
	<xsl:template match="/">
		<html>
			<head>
				<title>Product Information</title>
				<meta name="description" content="Information of all our products"/>
				<meta name="keywords" content="Information, category, name, description, quantity, price"/>
				<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster"/>
				<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Red+Hat+Display"/>
				<link rel="stylesheet" href="Styles.css"/>
				<script>
				  <![CDATA[
					function myFunction() {
					  var input, filter, table, tr, td, i, txtValue;
					  input = document.getElementById("myInput");
					  filter = input.value.toUpperCase();
					  table = document.getElementById("fsTable");
					  tr = table.getElementsByTagName("tr");
					  var NoMatches = document.getElementById("NoMatches");

					  // Counter for visible rows
					  var visibleRowCount = 0;

					  for (i = 0; i < tr.length; i++) {
						td = tr[i].getElementsByTagName("td")[0];
						if (td) {
						  txtValue = td.textContent || td.innerText;
						  if (txtValue.toUpperCase().indexOf(filter) > -1) {
							tr[i].style.display = "";
							visibleRowCount++;
						  } else {
							tr[i].style.display = "none";
						  }
						}
					  }

					  // Display message if no matches
					  if (visibleRowCount === 0) {
						NoMatches.style.display = "block";
					  } else {
						NoMatches.style.display = "none";
					  }
					}
				  ]]>
				</script>

			</head>
			<body>
				<div class="Nav">
					<a class="active" href="#home">Home</a>
					<a href="fish.html">Fish</a>
					<a href="ship.html">Ship</a>
					<a href="about.html">About</a>
				</div>
				<div class="Title">
					<h1>Fish and Ships</h1>
				</div>
				<div class="Headings">
					<h1>Product Information</h1>
				</div>
				<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Enter the code you are looking for." title="Type in an id">
				</input>
				<table id="fsTable">
					<tr>
						<th>Code</th>
						<th>Category</th>
						<th>Name</th>
						<th>Description</th>
						<th># of units</th>
						<th>Price per unit (€)</th>
					</tr>
					<xsl:for-each select="products/product">
						<tr>
							<td>
								<xsl:value-of select="@code"/>
							</td>
							<td>
								<xsl:value-of select="category"/>
							</td>
							<td>
								<xsl:value-of select="name"/>
							</td>
							<td>
								<xsl:value-of select="description"/>
							</td>
							<td>
								<xsl:value-of select="quantity"/>
							</td>
							<td>
								<xsl:value-of select="unit_price"/>
							</td>
						</tr>
					</xsl:for-each>
				</table>
				<div id="NoMatches" style="display: none; color: red; text-align: center; font-size: 30px; font-family: 'Red Hat Display', sans-serif;"> No matches found. </div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
