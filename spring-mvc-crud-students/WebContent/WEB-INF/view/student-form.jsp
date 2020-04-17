<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js""></script>
</head>
<body>
       <div id="wrapper">
  
   <div class="container">
    <div class="header">
      <h2>CRM -- Add Students</h2>    
      </div>
     <div>
        <form:form modelAttribute="student" method="POST" action="addStudent" >
             <form:hidden path="id"/>
			  <div class="form-group">
			    <label for="exampleInputEmail1">FirstName</label>
			    <form:input path="firstName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter firstName" />
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">LastName</label>
			    <form:input path="lastName" class="form-control" id="exampleInputPassword1" placeholder="Enter LastName" />
			  </div>
			 <div class="form-group">
			    <label for="exampleInputPassword1">Email</label>
			    <form:input path="email" class="form-control" id="exampleInputPassword1" placeholder="Enter LastName" />
			  </div>
			 
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form:form>
     </div>
</div>
</div>
</body>
</html>