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
		<h3>Register</h3>
        <s:form action="doRegister" method="post" validate="true">
			<s:textfield key="register.username" name="username"/>
            <s:password key="register.password" name="password"/>
            <s:password key="register.confirmPassword" name="confirmPassword"/> 
			<s:textfield key="register.email" name="email" size="30"/>
			<s:textfield key="register.name" name="name" size="60"/> 
			<s:textfield key="register.dob" name="dob"/>
			<s:select label="Origin"
				headerKey="-1" headerValue="-Select One-"
				list="#{ 'IDN':'INDONESIA','MYS':'MALAYSIA', 'SGP':'SINGAPORE'}"
				name="origin"
				value="-1" /> 
			<s:textfield key="register.phone" name="phone" size="20"/>
			<s:textfield key="register.address1" name="address1" size="100"/>
			<s:textfield key="register.address2" name="address2" size="100"/>
			<s:textfield key="register.address3" name="address3" size="100"/>
			<s:textfield key="register.postalCode" name="postalCode" size="10"/>
			<s:select label="Country"
				headerKey="-1" headerValue="-Select One-"
				list="#{ 'IDN':'INDONESIA','MYS':'MALAYSIA', 'SGP':'SINGAPORE'}"
				name="country"
				value="-1" /> 
			<s:textfield key="register.bankCode" name="bankCode" size="10"/>
			<s:textfield key="register.accountNumber" name="accountNumber" size="20"/>
			<s:textfield key="register.accountName" name="accountName" size="60"/>
            <s:submit key="register.submit" align="left" label="login"/> 
            <tr><td></td><td><s:text name="* Required" /></td></tr> 
        </s:form>
		<p></p>
    </div> 
</body>
</html>
