<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/19/2022
  Time: 11:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <span  id="span-convictions">
        <a href="${pageContext.request.contextPath}/convictions.jsp" role="button" id="convictions-button">
            <span>Convictions</span>
        </a>
    </span><br><br>
    <span id="span-health-care">
        <a href="${pageContext.request.contextPath}/health-care.jsp" role="button" id="health-care-button">
            <span>Health care</span>
        </a>
    </span><br><br>
    <span id="migration-care">
        <a href="${pageContext.request.contextPath}/migration.jsp" role="button" id="migration-button">
            <span>Traveling</span>
        </a>
    </span><br><br>

</body>
</html>
