<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Create user</title>
  <style>
    span{
      display: inline-block;
      width: 60px;
    }
  </style>
</head>
<body>
<h3>Create user</h3>
<form name="user" method="post" action="/addUser">
  <div>
    <span>
      Name
    </span>
     <input title="Name" type="text" name="name">
  </div>
  <div>
    <span>
      Email
    </span>
    <input title="Email" type="text" name="email">
  </div>
  <div>
    <span>
       Age
    </span>
    <input title="Age" type="text" name="age">
  </div>
  <button type="submit">
    save
  </button>

</form>
</body>
</html>