<html>
<head>
    <meta charset="utf-8">
    <style type="text/css">
        h1 {
            color: hotpink;
            margin-top: 320px;
            text-align: center;
            text-decoration: underline;
            font-style: italic;
        }
        body {
            background-color: black;
        }
    </style>
</head>
<body>
<form>
    <h1>${name} <% request.getParameter("name");%></h1>
</form>
</body>
</html>