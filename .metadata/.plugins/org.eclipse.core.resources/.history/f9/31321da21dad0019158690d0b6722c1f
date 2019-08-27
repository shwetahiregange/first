<%@page import="com.javaTpoint.model.StudentName" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome to Spring Web MVC project</title>
</head>

<body>
    <h1>Index page</h1>
    <table>
    
    <tr>
    <th>Student Id</th>
    <th>Student Name</th>
     </tr>
     <% ArrayList <StudentName> al=(ArrayList<StudentName>)request.getAttribute("tt");
     Iterator itr= al.iterator();
     StudentName sn=new StudentName();
     while(itr.hasNext()){
    	 sn=(StudentName)itr.next();%>
    	 <tr>
    	 
    	 <td><%=sn.getId() %></td>
    	 <td><%=sn.getName() %></td>
    	 <td><a href="/updateStud">Update</a></td>
    	 <td><a href="/deleteStud">Delete</a></td>
    	 
   </tr>
    	 
    <% }%> 
     
    
    
    
    </table>
</body>
    </html>