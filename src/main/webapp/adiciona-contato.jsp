<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum"%>
<!DOCTYPE html>
<html>
<head>
	<link href="css/jquery.css" rel="stylesheet" />
	<script src="js/jquery.js"> </script>
	<script src="js/jquery-ui.js"> </script>
	<meta charset="ISO-8859-1" />
	<style>
		<%@include file="/css/style.css" %>
	</style>
	<title>Insert title here</title>
</head>
<body>
	<div class="content">
		<div class="container">
	    	<div class="vertical-center">
				<c:import url="cabecalho.jsp" />
				<h1>Add contacts</h1>
				<br/>
				<form action="adicionaContato">
					Nome: <input type="text" name="nome" /><br /> E-mail: <input
						type="text" name="email" /><br /> Endereço: <input type="text"
						name="endereco" /><br /> Data Nascimento:
					<caelum:campoData id="dataNascimento" />
					<br /> <input type="submit" value="Gravar" />
				</form>
				<c:import url="rodape.jsp" />
	    	</div>
		</div>
	</div>

</body>
</html>