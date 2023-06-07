<html>
	<head>
	
	<style>
			table,td,th
			{
				border:1px solid red;
			}
	</style>
	
			<script>
					function display()
					{
							alert("hello");
							//Connection con=new ConnectionIMPL();
							//Connection con=DriverManger.getConnection();
							var table=document.createElement("table");
							var row=document.createElement("tr");

							var rnotd=document.createElement("td");
							
							var rnovalue=document.createTextNode("1");
					
							rnotd.appendChild(rnovalue);

							var markstd=document.createElement("td");
							var marksvalue=document.createTextNode("90");
						    markstd.appendChild(marksvalue);

							row.appendChild(rnotd);
							row.appendChild(markstd);
							
							table.appendChild(row);
		
							document.body.appendChild(table);
					}
		</script>
			
	</head>

	<body>
	<!-- HTML Element(tag) is a object  
		 It has attributes like type,value ,id...
		 Employee object has attributes like eno,salary,name
		 Employee e = new Employee();
		 e.setSalary(300000);
	-->
			<input type="button" value="all" onclick="display()">
			
	</body>

			
</html>