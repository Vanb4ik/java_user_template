<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <style>
    table {
      border-collapse: collapse
    }
    tr td{
      padding: 1px 5px;
      border: 1px solid darkcyan;
    }
    a{
      text-decoration: none;
    }
  </style>
</head>
<body>
<h1>Users list!</h1>

<table>
  <tr>
    <th>id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Age</th>
  </tr>
   <#list users as user>
       <tr>
         <td><a href="/user/${user.id}"> Go to user ${user.name}</a></td>
         <td>${user.name}</td>
         <td>${user.email}</td>
         <td>${user.age}</td>
         <td><a href="/delete/${user.id}">Delete user ${user.name}</a></td>
         <td><a href="/update/${user.id}">Update user ${user.name}</a></td>
       </tr>
   </#list>
</table>
<a href="/addUser"> Add new User</a>
</body>
</html>