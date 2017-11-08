<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>  
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="http://connect.facebook.net/en_US/all.js"></script>
</script>
</head> 
<body>


    <div align="center">
<button id="loginBtn">Facebook Login</button>
<div id="response"></div>
<script type="text/javascript">
function getUserData() {
	FB.api('/me', function(response) {
		document.getElementById('response').innerHTML = 'Hello ' + response.name + ' ' + response.id+ response.gender;
	});
}
 
window.fbAsyncInit = function() {
	//SDK loaded, initialize it
	FB.init({
		appId      : '1776747725958288',
		xfbml      : true,
		version    : 'v2.2'
	});
 
	//check user session and refresh it
	FB.getLoginStatus(function(response) {
		if (response.status === 'connected') {
			//user is authorized
			document.getElementById('loginBtn').style.display = 'none';
			getUserData();
		} else {
			//user is not authorized
		}
	});
};
 
//load the JavaScript SDK
(function(d, s, id){
	var js, fjs = d.getElementsByTagName(s)[0];
	if (d.getElementById(id)) {return;}
	js = d.createElement(s); js.id = id;
	js.src = "//connect.facebook.com/en_US/sdk.js";
	fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));
 
//add event listener to login button
document.getElementById('loginBtn').addEventListener('click', function() {
	//do the login
	FB.login(function(response) {
		if (response.authResponse) {
			//user just authorized your app
			document.getElementById('loginBtn').style.display = 'none';
			getUserData();
		}
	}, {scope: 'email,public_profile', return_scopes: true});
}, false);

</script>

<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
</fb:login-button>

		<h3><s:text name="login.header"/></h3>
        <s:form action="doLogin" method="post" validate="true">
			<s:textfield key="login.username" name="username" />
            <s:password key="login.password" name="password" />
            <s:submit key="login.submit" /> 
        </s:form>
		<p></p>
		<a href="<s:url action="register"/>"><s:text name="login.register" /></a>&nbsp;
		<a href="<s:url action="register"/>"><s:text name="login.forgotPassword" /></a>
		<p></p>         
        <p>
		Language :
		<s:url id="localeIND" namespace="/" action="locale" >
		   <s:param name="request_locale" >ind</s:param>
		</s:url> 
		<s:url id="localeEN" namespace="/" action="locale" >
		   <s:param name="request_locale" >en</s:param>
		</s:url>
		<s:url id="localezhCN" namespace="/" action="locale" >
		   <s:param name="request_locale" >zh_CN</s:param>
		</s:url> 
		<s:url id="localeTH" namespace="/" action="locale" >
		   <s:param name="request_locale" >th</s:param>
		</s:url> 
		<s:a href="%{localeIND}" ><s:text name="global.ind" /></s:a> 
		<s:a href="%{localeEN}" ><s:text name="global.eg" /></s:a>
		<s:a href="%{localezhCN}" ><s:text name="global.zh_CN" /></s:a> 
		<s:a href="%{localeTH}" ><s:text name="global.th" /></s:a> 
		</p> 
        
    </div> 
</body>
</html>
