<%@ page import="java.util.Date" %>
<html>
<body>
<h1>Hello World!</h1>
    <%
        Date date = new Date();
        String strdate = date.toString();
    %>
<h3>Today is:<%=strdate%></h3>
</body>
</html>
