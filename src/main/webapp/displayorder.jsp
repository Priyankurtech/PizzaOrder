<%@page import="com.pizza.dto.Pizza"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<h1>Welcome to Dominoz Pizza</h1>

		<table style="border: 1px solid black;">

			<tr>
				<th>Order ID</th>
				<th>Prize</th>
				<th>Status</th>
				<th>Change Status</th>
			</tr>
			<%
			List<Pizza> list = (List<Pizza>) request.getAttribute("orders");
			for (Pizza order : list) {
			%>
			<tr>
				<td><%=order.getOrderId()%></td>
				<td><%=order.getPrice()%></td>
				<td><%=order.getStatus()%></td>
				<td><a href="changestatus?id=<%=order.getOrderId()%>"><button>Placed</button><button>Preparing</button><button>Ready</button></a></td>
			</tr>
			<%
			}
			%>
		</table>


	</form>
</body>
</html>