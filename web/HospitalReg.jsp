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
    .l
    {
        width: 380px;
    }
</style>
<h1 style="margin-left: 10px;">
    <span class="w">Hospital</span>
    <span>Registration</span>
</h1>
<img class="strip_img" src="image, nav/blue_strip.jpg" width="1000px" height="4" style="margin-bottom: 20px;"/>
<div style="margin-left: 10px;">
<h3>Name : <input type="text" id="t1"/></h3>
<h3>Address : <input type="text" id="t2"/></h3>
<h3>Contact : <input type="text" value="+91" id="t3" placeholder="0000000000"/></h3>
<h3>Date of Birth : <input type="date" id="t4" placeholder="DD-MM-YYYY"/></h3>
<h3>Taking any medication Currently ?</h3>
<h3><input type="radio" name="c1" id="c2"/>Yes &nbsp;
<input type="radio" name="c1" id="d2" />No</h3>
<h3>Email : <input type="email" class="l" id="t5" placeholder="ex-name123@example.com"/></h3>
<h3>Password : <input type="text" id="t6"/></h3>
<h3>Confirm Password : <input type="text" id="t7"/></h3>
<h3><button class="btn btn-info" style="font-size: 25px;" type="button" fdprocessedid="a8n4qh"><a href="#">Register</a></button></h3>

<%@include file="C2.jsp" %>
