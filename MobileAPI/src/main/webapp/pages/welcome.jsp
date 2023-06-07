welcome ${username}

<%!
  String imageURL="";
%>

<%
	imageURL="/images/"+ request.getAttribute("username") +".jpg";
%>

<img src=<%=imageURL %> height=100px width=100px>