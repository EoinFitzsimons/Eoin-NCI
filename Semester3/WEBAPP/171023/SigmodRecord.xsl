<?xml version="1.0" encoding ="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html"/>
	<xsl:template match="/">
		<html>
			<head>
				<title>,</title>
			</head>
			<body>
				<h2>1. Titles</h2>
				<xsl:for-each select="//article">
					<p>
						<xsl:value-of select="title"/>
					</p>
				</xsl:for-each>
				<h2>2. Volume 25 Titles</h2>
				<xsl:for-each select="//issue[volume = '25']">
					<p>
						<xsl:value-of select="articles/article/title"/>
					</p>
				</xsl:for-each>
				<h2>3. Articles between 30 and 35</h2>
				<h3>Titles</h3>
				<xsl:for-each select="//article[initpage &gt; 30 and 35 &gt; initpage]">
					<h3>
						<xsl:value-of select="title"/>
					</h3>
				</xsl:for-each>
				<p>Author Names</p>
				<xsl:for-each select="//article[initpage > '30' and '35' > initpage]">
					<p>
						<xsl:value-of select="authors/author"/>
					</p>
				</xsl:for-each>
				<h2>4. First Author Names</h2>
				<xsl:for-each select="//article">
					<p>
						<xsl:value-of select="authors/author[1]"/>
					</p>
				</xsl:for-each>
				<!--author position = 00-->
				<h2>5. Last Author Names</h2>
				<xsl:for-each select="//article">
					<p>
						<xsl:value-of select="authors/author[last()]"/>
					</p>
				</xsl:for-each select="">
				<!--count number of authors, author position '0' + count - 1 -->
				<h2>6. Issue Volume | Issue Number | Authors, Title(Bold). initial page - end page</h2>
				<xsl:for-each>
				
				
				</xsl:for-each>
				<!--The list of articles ordered by Issue Volume and Issue Number.
				The articles' information should be presented in the following sequence:
				author names separated by comma, title in bold, and initial and end pages separated with a dash.-->
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
