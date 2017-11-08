<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>  
<link rel="stylesheet" type="text/css" href="css/style.css">
</head> 
</head>
<body>

    <div align="center">
		<h3>Buyer</h3>
        <s:form action="doRegister" method="post" validate="true">
			<s:textfield key="addOrder.buyerName" name="name"/>
            <s:submit key="addOrder.search" align="left"/> 
        </s:form>
		<p></p>
    </div> 
</body>
</html>
