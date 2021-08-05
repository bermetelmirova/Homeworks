<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.OutputStream" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            border: 1px solid;
            width: 5em;
            height: 5em;
            text-align: center;
            vertical-align: middle; }

        .n1 { background: #f0d9b5; }
        .n-1 { background: #b58863; }
    </style>
</head>
    <body>
        <table>
            <tr>
                <th>A</th>
                <th>B</th>
                <th>C</th>
                <th>D</th>
                <th>E</th>
                <th>F</th>
                <th>G</th>
                <th>H</th>
            </tr>
           <tr>
            <jsp:useBean id="numbers" scope="request" type="java.util.List"/>
                <c:forEach items="${numbers}" var="item">
                        <td >${item}</td>
                </c:forEach>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            </tr>
        </table>
    </body>
</html>
