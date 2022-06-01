<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<style>
<%@include file="/css/style.css" %>
</style>
<meta charset="ISO-8859-1">
<title>Lista de Contatos</title>
</head>
<body>
	<div class="content">
		<div class="container">
			<div class="vertical-center">

				<c:import url="cabecalho.jsp" />

				<table>
					<c:forEach var="contato" items="${contatos}">
						<tr>
							<td>${contato.nome}</td>
							<td><c:choose>
									<c:when test="${not empty contato.email}">
										<a href="mailto:${contato.email}" target="_blank">${contato.email}</a>
									</c:when>

									<c:otherwise>
							Email não informado
				 		</c:otherwise>
								</c:choose></td>

									<td>${contato.endereco}</td>

									<td><fmt:formatDate value="${contato.dataNascimento.time}"
											pattern="dd/MM/yyyy" /></td>

									<td><a
										href="mvc?logica=RemoveContatoLogica&id=${contato.id}">X</a>
									</td>
						</tr>
					</c:forEach>
					
					<c:if test="${empty contatos }">
					 				<a href="/fj21-agenda/adiciona-contato.jsp" class="addcontact">Add
									contacts</a>
								</c:if>
				</table>

				<c:import url="rodape.jsp" />

			</div>
		</div>
	</div>
</body>
</html>