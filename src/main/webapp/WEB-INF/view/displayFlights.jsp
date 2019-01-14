<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Flights:</title>
</head>
<body>

<table>
<tr><th>Airline</th>
<th>DepartureCity</th>
<th>DepartureTime</th>
<th>ArrivalCity</th></tr>

<c:forEach items="${flights}" var="flight">
<tr><td>${flight.operatingAirlines}</td>
<td>${flight.departurecity}</td>
<td>${flight.dateOfDeparture}</td>
<td>${flight.arrivalCity}</td>
<td><a href="showCompleteReservationFlights?flightId=${flight.id}">select</a></td></tr>






</c:forEach>
</table>

</body>
</html>