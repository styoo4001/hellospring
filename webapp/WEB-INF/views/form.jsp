<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="/hellospring/guestbook/insert">


		이름 : <input type="text" name="name" ><br><br>
		
		비밀번호 : <input type="text" name="password" ><br><br>
		메세지 : <input type="text" name="message" ><br><br>
		<input type="submit" value="전송">
</form>


</body>
</html>