<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">  
<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes"/>
 
<xsl:template match="/">  
    <FMPXMLRESULT xmlns="http://www.filemaker.com/fmpxmlresult">  
        <METADATA>    
			<FIELD NAME="description"/>
        </METADATA>  
        <RESULTSET>  
			<xsl:for-each select="//item">  
					<xsl:value-of select="./title"/> <br></br>
					<xsl:value-of select="./description"/> <br></br>
					<xsl:text>    &lt;a href="                </xsl:text>
						<xsl:value-of select="./link"/> 
					<xsl:text>"&gt;comentarios&lt;a&gt;             </xsl:text>					 <br></br>
					 <br></br><br></br><br></br>
			</xsl:for-each>
        </RESULTSET>
    </FMPXMLRESULT> 
</xsl:template> 
 
</xsl:stylesheet>