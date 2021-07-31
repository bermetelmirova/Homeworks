<html>
<body>
<form >
    <h2>${february} <% request.getParameter("february");%></h2>
    <div class="month">
        <ul>
            <li>February<br><span style="font-size:18px">2018</span></li>
        </ul>
    </div>

    <ul class="weekdays">
        <li>Monday</li>
        <li>Tuesday</li>
        <li>Wednesday</li>
        <li>Thursday</li>
        <li>Friday</li>
        <li>Saturday</li>
        <li>Sunday</li>
    </ul>

    <ul class="days">
        <li> </li>
        <li> </li>
        <li> </li>
        <jsp:useBean id="listCalendar" scope="request" type="java.util.List"/>
        <c:forEach items="${listCalendar}" var="item">
            <li> ${item.date} </li>
        </c:forEach>
    </ul>
</form>
</body>
</html>