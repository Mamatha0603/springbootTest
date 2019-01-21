<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>completeReservation</title>
</head>
<body>
	<h2>Complete Reservation</h2>

	Airlines:${flight.operatingAirlines} <br>
	
	Airlines:${flight.departurecity}<br>

	Airlines:${flight.arrivalCity}<br>
	Airlines:${flight.id}<br>

<form:form method="POST"
          action="completeReservation" modelAttribute="reservationRequest">
<pre>
<h2>Passenger Details:</h2>
FirstName:<form:input  path="passengerFirstName"/>
LastName:<form:input  path="passengerLastName"/>

Email:<form:input  path="passengerEmail"/>

Phone:<form:input  path="passengerPhone"/>

<h2>Card Details:</h2>
Name on the card:<form:input  path="nameOnTheCard"/>

card No:<form:input  path="cardNumber"/>

Expiry Date:<form:input  path="expiryDate"/>

Three digit sec Code:<form:input  path="SecureCode"/>



<form:hidden path="flightId" value="${flight.id}"/>
<input type="submit" value="Confirm"/>

</pre>
</form:form>
	
</body>
</html>