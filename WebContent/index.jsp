<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
 <script type="text/javascript">
     //刷新验证码
     function changeImg()
     {
         document.getElementById("validateCodeImg").src="CheckCodeServlet.do?"+Math.random();
     }
     
</script>
<style> 
		body
		{
			background-repeat:no-repeat;
			background-size: 100% ;
			background-attachment: fixed;
			background-image: url(E:\JavaProject/UserLogin/WebContent/META-INF/img/t1.webp);
			width:100%;
			height:100%;
		}
		.div1
		{
			position:absolute;
		    top:50%;
		    left:65%;
		    margin:-225px 0 0 -400px;
			text-align:center;
			color: black;
			border-radius:5px;
			background-color: beige;
			width: 350px;
			height: 400px;
			opacity:0.7;
		} 
		
		input
		{
			border-radius:5px;
			height: 25px;
			width: 200px;
			margin-top: 20px;
		}
		
		.form-control
		{
			width: 70px;
		}
		
		
		button
		{
			margin-top: 20px;
			width: 100px;
			height: 30px;
			background-color: cornflowerblue;
			border-radius:5px;
		}
	</style> 
<body>

	<div class="div1">
			<h1>用户登录</h1>
			<form action="LoginController.do" method="post">
				<input type="text" name="uname" id="username" placeholder="用户名" required autofocus/><br />
				<input type="password" name="upwd" id="userpassword" placeholder="密码" required autofocus/><br />
				<input type="text"  name="validateCode" class="form-control" placeholder="验证码" required autofocus/>
				<img  src="CheckCodeServlet.do" id="validateCodeImg" onclick="changeImg()"></br>
				<input type="checkbox" name="nologin" id="nologin" value="yes" placeholder="一周免登录"/><a>一周免登录</a><br>
				<button type="submit" id="login">登录</button>
			</form>
	</div>
</body>
</html>