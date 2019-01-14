<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<form action="completeReservation" method="post">
<pre>
<h2>Passenger Details:</h2>
FirstName:<input type="text" name="passengerFirstName"/><br>
LastName:<input type="text" name="passengerLastName"/><br>
Email:<input type="text" name="passengerEmail"/><br>
Phone:<input type="text" name="passengerPhone"/><br>

<h2>Card Details:</h2>
Name on the card:<input type="text" name="nameOnTheCard"/><br>
card No:<input type="text" name="cardNumber"/><br>
Expiry Date:<input type="text" name="expiryDate"/><br>
Three digit sec Code:<input type="text" name="SecureCode"/><br>

<input type="hidden" name="flight.id" value="${flight.id}"/>
<input type="submit" value="Confirm"/>

</pre>
</form>	 
	
</body>
</html>