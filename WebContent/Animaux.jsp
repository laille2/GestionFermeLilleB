<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Les Animaux</title>
</head>
<body>
	<form action="Etat" method="POST">
		<div>
			<label>Etat</label> <input type="text" name="Etat">
		</div>
	</form>

	<label for="basseCour">BasseCour</label>
	<input type="checkbox" id="basseCour" onclick="myFunction()">

	<label for="betail">Bétail</label>
	<input type="checkbox" id="betail" onclick="myFunction()">



	<script>
		function myFunction() {
			var checkBox = document.getElementById("myCheck");
			var text = document.getElementById("text");
			if (checkBox.checked == true) {
				text.style.display = "block";
			} else {
				text.style.display = "none";
			}
		}
	</script>


	<button class="btn">Ajouter</button>

</body>
</html>