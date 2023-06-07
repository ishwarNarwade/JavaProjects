<html>
<head>
<style>
</style>
</head>


<body>
<span id="message">${message}</span>

<form name ="productform" enctype="multipart/form-data">
			
			<input type="text" name="pid" placeholder="Enter product id"><span id="errorMessage"> </span><br><br>
			
			<input type="text" name="name" placeholder="Enter product name"><br><br>
			
			<input type="text" name="price" placeholder="Enter product price"><br><br>
			
			<input type="text" name="cid" placeholder="Enter category id"><br><br>
			
			<label>Select Photo	</label>
			<input type="file" name="images"><br><br>
						
			<input type=submit value=post formmethod=post formaction="saveProduct">

			<br><br><br>
						
			<table id="table1">
				
			</table>
			
</form>

<p id="p1"> Test </p>

</body>

</html>