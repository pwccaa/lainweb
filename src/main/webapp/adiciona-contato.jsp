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
		html * {
			overflow: hidden;
		}
		<%@include file="/css/style.css" %>
	</style>
	<title>Add you contact</title>
</head>
<body>
	<div class="content">
		<div class="container">
	    	<div class="vertical-center">
				<c:import url="cabecalho.jsp" />
				<h1 class="add">Add contacts</h1>
				<br/>
				<form action="adicionaContato">
					<input type="text" name="nome" placeholder=" Name" /><br />
					<br><input type="text" name="email" placeholder=" Email" /><br />
					<br><input type="text" name="endereco" placeholder=" Address"/><br />
					<br><input type="text" name="dataNascimento" placeholder=" BirthDate dd/mm/yyyy"/><br />
					<br><input class="submit" type="submit" value="Submit" />
				</form>
				<c:import url="rodape.jsp" />
	    	</div>
		</div>
	</div>

</body>
</html>