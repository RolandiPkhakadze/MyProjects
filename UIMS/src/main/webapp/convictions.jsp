<%@ page import="com.example.uims.model.User" %>
<%@ page import="com.example.uims.Services.ConvictionsService" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/21/2022
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convictions</title>
</head>
<body>
    <span id="home-page-care">
        <a href="${pageContext.request.contextPath}/home-page.jsp" role="button" id="home-page-button">
            <span>Home page</span>
        </a><br><br>
        <%
            User user = (User) request.getSession().getAttribute("user");
            String convictionsText;
            try {
                convictionsText = ConvictionsService.getDescriptionText(user);
            }catch (SQLException e){
                throw new RuntimeException(e);
            }

        %>
        <pre>
            <%=convictionsText%>
        </pre>

    </span><br><br>
</body>
</html>
