<%@include file="C1.jsp" %>
<style>
    .w
    {
        color: red;
        
    }
    
    a
    {
        color: white; 
        text-shadow: 15px;
        text-decoration: none;
        font-size: 25px;
    }
    a:hover
    {
        color: aqua;
    }

    
</style>
<body style="background-color: turquoise;">
    <h1 style="margin-left: 10px;">
    <span>Welcome</span>
    <span>Sagar</span>
    <span class="w">Hospital
        <img src="image, nav/hospital.png" height="45px;"></span>
</h1>
    <img class="strip_img" src="image, nav/blue_strip.jpg" width="1028px" height="4" style="margin-bottom: 20px;"/>
<div>
    
    <h3 style="margin-left: 10px;">
   
    <button class="btn btn-info"  type="button" fdprocessedid="a8n4qh"><a href="Loginform.jsp">Login</a></button>
    <button class="btn btn-info" style="margin-left: 20px;" type="button" fdprocessedid="a8n4qh"><a href="HospitalReg.jsp">Hospital Registration</a></button>
</h3>
    <div style="float: right; margin-right: 10px;">
        <img src="image, nav/home.jpeg" width="500px;" height="320px;" style="margin-top:  -80px; border-radius: 15px; border: 3px solid red;"/>
    </div>
</div>
</body>
<%@include file="C2.jsp" %>