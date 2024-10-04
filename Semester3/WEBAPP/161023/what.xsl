<?xml version="1.0" encoding ="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html"/>
		<xsl:template match="/">
			<html>
				<body>
					<h2>My CD Collection</h2>
						<table border="1">
							<tr bgcolor="#9acd32">
								<th>ID</th>
								<th>Description</th>
								<th>Price</th>

							</tr>
							<xsl:for-each select="products/vendor/product">
							<tr>
								<td><xsl:value-of select="product_id"/></td>
								<td><xsl:value-of select="short_desc"/></td>
								<td><xsl:value-of select="price"/></td>
							</tr>
						</xsl:for-each>
					</table>
				</body>
			</html>
		</xsl:template>
</xsl:stylesheet>
