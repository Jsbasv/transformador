<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Fruit List</title>
            </head>
            <body>
                <h1>Fruit List</h1>
                <table>
                    <tr>
                        <th>Name</th>
                        <th>Color</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="fruits/fruit">
                        <tr><xsl:apply-templates select="."></xsl:apply-templates></tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>

    </xsl:template>

    <xsl:template match="fruits/fruit">
        <td><xsl:value-of select="name"/></td>

        <td><xsl:value-of select="color"/></td>

        <td><xsl:value-of select="price"/></td>
    </xsl:template>



</xsl:stylesheet>