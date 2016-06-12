<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% int correctnum = (int) request.getAttribute("correctnum");
int[] correctAns = (int[]) request.getAttribute("correctAns");%>
<html>
<head>
<meta charset="UTF-8">
<title>不合格</title>
</head>
<body>
<h1>不合格です！</h1>
<br>
<p>残念ですが、不合格です。</p>
<p>もう少し勉強しましょう</p>
<br>

正解数は<%=correctnum %>でした。
正解した問題は、<br>
<%for(int ans : correctAns){
	if(ans != 0){%>
		<%= ans %>問目<br>

<%	}
 } %>
です。<br>

<p>正解</p>
問1：HttpServlet<br>
問2：getParameterValues<br>
問3：&lt;%& … %&gt;以外すべて<br>
</body>
</html>