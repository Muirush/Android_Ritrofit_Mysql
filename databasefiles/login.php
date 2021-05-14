<?php
$conn = mysqli_connect("localhost", "root","","project");

$phone = $_POST['phone'];
$password = $_POST['password'];

$sql_Check = "select * from users where phone ='$phone' and password ='$password'";

$result  = mysqli_query($conn,$sql_Check);
if (mysqli_num_rows($result) == 0) {
	$response ['success'] = false;
	$response ['message'] = "User not found.";
}
else{
	$row = mysqli_fetch_assoc($response);
	$response ['success'] = true;
	$response ['message'] = "User logged in.";

	$response ['fullname'] = $row['fullname'];
	$response ['phone'] = $row['phone'];
	$response ['password'] = $row['password'];
	//$response ['fullname'] = $row['fullname'];
}


echo json_encode($response);
mysqli_close($conn);

?>