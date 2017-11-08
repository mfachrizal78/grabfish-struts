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
        <s:form action="saveMyProfile" method="post" validate="true">
			<s:textfield key="myprofile.username" name="username" readonly="true"/> 
			<s:textfield key="myprofile.email" name="email" size="30"/>
			<s:textfield key="myprofile.name" name="name" size="60"/> 
			<s:textfield key="myprofile.dob" name="dob"/>
			<s:select label="Origin"
				headerKey="-1" headerValue="-Select One-"
				list="#{ 'IDN':'INDONESIA','MYS':'MALAYSIA', 'SGP':'SINGAPORE'}"
				name="origin"
				value="-1" /> 
			<s:textfield key="myprofile.phone" name="phone" size="20"/>
			<s:textfield key="myprofile.address1" name="address1" size="100"/>
			<s:textfield key="myprofile.address2" name="address2" size="100"/>
			<s:textfield key="myprofile.address3" name="address3" size="100"/>
			<s:textfield key="myprofile.postalCode" name="postalCode" size="10"/>
			<s:select label="Country"
				headerKey="-1" headerValue="-Select One-"
				list="#{ 'IDN':'INDONESIA','MYS':'MALAYSIA', 'SGP':'SINGAPORE'}"
				name="country"
				value="-1" /> 
			<s:textfield key="myprofile.bankCode" name="bankCode" size="10"/>
			<s:textfield key="myprofile.accountNumber" name="accountNumber" size="20"/>
			<s:textfield key="myprofile.accountName" name="accountName" size="60"/>
 
            
            <tr>
			    <td colspan="2">
			    <div align="left">
			    	<input type="submit" id="saveMyProfile_myprofile_save" name="myprofile.save" value="<s:text name="myprofile.save"/>"/>
			    	<input type="button" onclick="location.href='myProfile.action';" value="Back" /> 
				</div>
				</td>
			</tr>
            
            <tr><td></td><td><s:text name="* Required" /></td></tr> 
        </s:form>
		<p></p>
    </div> 
</body>
</html>
