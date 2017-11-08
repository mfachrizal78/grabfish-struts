<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>  
<link rel="stylesheet" type="text/css" href="css/style.css">
</head> 
<head>
<sx:head />
</head>
<body> 
    <div align="center">
		<h3><s:text name="myprofile.header"/></h3>
        <s:form action="updateMyProfile" method="post" validate="true">
			<s:textfield key="myprofile.username" name="username" readonly="true"/> 
			<s:textfield key="myprofile.email" name="email" size="30" readonly="true"/>
			<s:textfield key="myprofile.name" name="name" size="60" readonly="true"/> 
			<s:textfield key="myprofile.dob" name="dob" readonly="true"/>
			<s:textfield key="myprofile.origin" name="originDesc" readonly="true"/>		 
			<s:textfield key="myprofile.phone" name="phone" size="20" readonly="true"/>
			<s:textfield key="myprofile.address1" name="address1" size="100" readonly="true"/>
			<s:textfield key="myprofile.address2" name="address2" size="100" readonly="true"/>
			<s:textfield key="myprofile.address3" name="address3" size="100" readonly="true"/>
			<s:textfield key="myprofile.postalCode" name="postalCode" size="10" readonly="true"/>
			<s:textfield key="myprofile.country" name="countryDesc" readonly="true"/>	
			<s:textfield key="myprofile.bankCode" name="bankCode" size="10" readonly="true"/>
			<s:textfield key="myprofile.accountNumber" name="accountNumber" size="20" readonly="true"/>
			<s:textfield key="register.accountName" name="accountName" size="60" readonly="true"/>
            <s:submit key="myprofile.update" align="left"/> 
            <tr><td></td><td></td></tr> 
        </s:form>
		<p></p>
    </div> 
</body>
</html>
