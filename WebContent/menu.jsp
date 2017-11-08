
<style>
body {margin:0;}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav .icon {
  display: none;
}

@media screen and (max-width: 600px) {
  .topnav a:not(:first-child) {display: none;}
  .topnav a.icon {
    float: right;
    display: block;
  }
}

@media screen and (max-width: 600px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive .icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }

}
</style>
<script>
function myFunction() {
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
        x.className += " responsive";
    } else {
        x.className = "topnav";
    }
}
</script>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
	
	

   	
<div class="topnav" id="myTopnav">  

	<%
	Object user = (Object) session.getAttribute("USER_SESSION");
	if (user==null) {
	%>  	
  <a href="<s:url action="login"/>">Login</a> 
  <a href="<s:url action="register"/>">Register</a> 
  <a href="<s:url action="schedule"/>">Schedule</a> 
  <a href="<s:url action="aboutUs"/>">About Us</a> 
<%
	} else {
%>
	 
  <a href="<s:url action="home"/>">Home</a> 
  <a href="<s:url action="myProfile"/>">My Profile</a> 
  <a href="<s:url action="myOrder"/>">My Order</a> 
  <a href="<s:url action="addOrder"/>">Add Order</a> 
  <a href="<s:url action="schedule"/>">Schedule</a> 
  <a href="<s:url action="aboutUs"/>">About Us</a>   
  <a href="<s:url action="dologout"/>">Logout</a> 
  <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="myFunction()">&#9776;</a>
<%
	}
%>
</div>
