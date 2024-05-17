<?php
$servername = "localhost:81";
$username = "username";
$password = "";
$dbname = "student";

		$name =$_POST['name'];
       $password =$_POST['password'];
// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);
// Check connection
if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

$sql = "INSERT INTO login (name,password)
VALUES ('$name', '$password')";

if (mysqli_query($conn, $sql)) {
  echo "New record created successfully";
} else {
  echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}

mysqli_close($conn);
?>