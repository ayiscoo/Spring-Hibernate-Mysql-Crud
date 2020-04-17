<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js""></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>students</title>
</head>
<body>
   
    <div id="wrapper">
  
   <div class="container">
    <div class="header">
      <h2>CRM -- Students Relation Manager</h2>        
      <pre></pre>
       <button class="btn btn-success" onclick="window.location.href='addStudent'">Add Student</button>
      <pre></pre>
  </div>
   <table class="table">
  <thead class="thead-dark">
    <tr>     
      <th scope="col">FirstName</th>
      <th scope="col">LastName</th>
      <th scope="col">Email</th>
      <th scope="col">Action</th>  
      
    </tr>
  </thead>
  <tbody>
      <c:forEach var="tempStudent" items="${student}" >
         
         <c:url var="updatelink" value="/student/showUpdateForm">
           <c:param name="studentID" value="${tempStudent.id }"></c:param>         
         </c:url>
         <c:url var="deletelink" value="/student/deleteStudent">
           <c:param name="delstudentID" value="${tempStudent.id }"></c:param>         
         </c:url>
         <tr>
          <td scope="row">${ tempStudent.firstName}</td>
          <td>${ tempStudent.lastName}</td>
          <td>${ tempStudent.email}</td>
          <td><a href="${updatelink }">Update</a>   |   <a href="${deletelink}"
           onclick="if(!confirm('Are you sure you want to delete this item')) return false ">Delete</a></td>
         </tr>
      </c:forEach>
   
  </tbody>
</table>
</div>
</div>
    
</body>
</html>