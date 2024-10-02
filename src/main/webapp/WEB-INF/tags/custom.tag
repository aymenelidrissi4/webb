<html>
<head>
    <title>Custom Tag Example</title>
</head>
<body>
    <h2>Welcome to Custom Tag Example</h2>

    <!-- Invoking the body content passed from the JSP -->
    <div>
        <jsp:invoke var="bodyContent"/>
        Body content: <br/>
        <div style="border:1px solid #000;padding:10px;">
            ${bodyContent}
        </div>
    </div>

    <!-- Displaying a custom attribute -->
    <h3>Message:</h3>
    <p><jsp:attribute name="message" /></p>
</body>
</html>
