<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/19/2022
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
</head>
<body>
<form action="RegistrationServlet" >
    <h3>Registration</h3>
    <label for="pid">Enter your personal ID</label><br>
    <input type="text" id="pid"  placeholder="Personal ID" name="pid" required><br><br>
    <label for="firstname">Enter your first name</label><br>
    <input type="text" id="firstname"  placeholder="First Name " name="firstname" required><br><br>
    <label for="lastname">Enter your last name</label><br>
    <input type="text" id="lastname" placeholder="Last Name " name="lastname" required><br><br>
    <label for="address">Enter your address</label><br>
    <input type="text" id="address" placeholder="Address " name="address" required><br><br>
    <label for="password">Enter your password</label><br>
    <input type="password" id="password" placeholder="Password " name="password" required><br><br>
    <label for="repPassword">Repeat password</label><br>
    <input type="password" id="repPassword" placeholder="Repeat password " name="repPassword" required><br><br>
    <% if(request.getAttribute("registrationStatus") != null) {%>
        <%if(request.getAttribute("registrationStatus").equals("invalid pid")) {%>
            <label>User with given Personal ID is already Registered or ID is invalid</label><br><br>
        <%} if(request.getAttribute("registrationStatus").equals("password mismatch")) {%>
            <label>Passwords Don't match, try again</label><br><br>
    <%}}%>
    <button type="submit" >Register</button><br><br>
    <a  href="index.jsp">Already have one? Log in!</a>
</form>
</body>
</html>
