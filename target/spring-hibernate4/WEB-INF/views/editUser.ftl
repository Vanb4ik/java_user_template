<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Edit user</title>
  <style>
    span{
      display: inline-block;
      width: 60px;
    }
  </style>
</head>
<body>
<h3>Edit user</h3>
<form name="user" method="post" action="/updateUser">
  <div>
    <span>
      ID
    </span>
    <input title="ID" readonly type="text" name="id" value="${user.id}">
  </div>
  <div>
    <span>
      Name
    </span>
     <input title="Name" type="text" name="name" value="${user.name}">
  </div>
  <div>
    <span>
      Email
    </span>
    <input title="Email" type="text" name="email" value="${user.email}">
  </div>
  <div>
    <span>
       Age
    </span>
    <input title="Age" type="text" name="age" value="${user.age}">
  </div>
  <button type="submit">
    save
  </button>

</form>
</body>
</html>