<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Log In</title>
</head>
<body>
<form action="LoginServlet" >
    <h3>Log In</h3>
    <label for="pid">Enter Your Personal ID</label><br><br>
    <input type="text" id="pid" class="pid" placeholder="Personal ID " name="pid"><br><br>
    <label for="password">give me password</label><br><br>
    <input type="password" id="password" class="input-box" placeholder="password" name="password"><br><br>
    <% if (request.getAttribute("loginStatus") != null){ %>
    <%  if (request.getAttribute("loginStatus").equals("wrong pid")) {%>
    <label>Invalid Personal ID</label>
    <% }else if(request.getAttribute("loginStatus").equals("incorrect pass")) { %>
    <label> Password incorrect </label>
    <% }}%>
    <br>
    <button type="submit" class="login-button">Sign in</button>
    <br>
    <br>
    <a href="registration.jsp">New to here? Sign up!</a>
</form>
</body>
</html>