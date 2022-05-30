<%@ page
	import="java.util.*,
br.com.caelum.ConnectionFactory,
br.com.caelum.ContatoDao,
br.com.caelum.Contato"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<%
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
		%>

		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<td><%=contato.getDataNascimento()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>