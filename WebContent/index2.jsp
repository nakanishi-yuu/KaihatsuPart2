<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- @auther hideki.hayashi -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<title>Insert title here</title>

<style>
/* main */
html, body {
	border: none;
	border-spacing: 0;
	margin: 0;
	padding: 0;
	font-size: 105%;
	background-color: white;
	height: 100%;
}

div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, fieldset,
	input, p, blockquote, th, td, hr, iframe {
	margin: 0;
	padding: 0;
}

table {
	border-spacing: 0;
	border-collapse: collapse;
}

a {
	color: #2929ff;
	text-decoration: none;
}

a:visited {
	color: #2929ff;
	text-decoration: none;
}

a:hover {
	color: #600060;
	text-decoration: underline;
}

fieldset, img {
	border: 0 none;
}

ul {
	list-style-type: square;
}

noscript {
	padding: 20px;
	border: 1px solid #dcdcdc;
	background-color: #ffffe3;
	font-size: small;
	position: relative;
	float: right;
	width: 100%;
	text-align: center;
	margin-bottom: 1em;
}

button, input[type='button'], input[type='reset'], input[type='submit']
	{
	padding: 0.2em 0.4em 0.2em 0.4em;
	border: 1px solid #918e8c;
	color: #333333;
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;
	border-radius: 3px;
	background: -webkit-gradient(linear, left top, left bottom, from(#f3f3f3),
		to(#cfcfcf));
	background: -moz-linear-gradient(top, #f3f3f3, #cfcfcf);
}

button:focus, input[type='reset']:focus, input[type='button']:focus,
	input[type='submit']:focus {
	outline: medium none;
}

button:hover, input[type='reset']:hover, input[type='button']:hover,
	input[type='submit']:hover {
	background-position: 0 -11px;
	background-color: #eae9e8;
	border-color: #5e5e5e;
	color: black;
}

button:active, input[type='reset']:active, input[type='button']:active,
	input[type='submit']:active {
	background-image: none;
	outline: medium none;
}

textarea, select, iframe, input[type='text'], input[type='file'], input[type='password']
	{
	border: 1px solid #9d9d9d;
	padding: 0.3em;
	margin: 0.3em;
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;
	border-radius: 3px;
}

textarea:focus, input[type='text']:focus, input[type='password']:focus {
	-moz-box-shadow: 0 0 8px rgba(82, 168, 236, 0.5);
	-webkit-box-shadow: 0 0 8px rgba(82, 168, 236, 0.5);
	box-shadow: 0 0 8px rgba(82, 168, 236, 0.5);
	border: 1px solid #52a8ec !important;
	background: #fbfbfb;
}

input.large_button {
	padding: 0.8em 2em 0.8em 2em;
	background: -webkit-gradient(linear, left top, left bottom, from(#f3f3f3),
		to(#cfcfcf));
	background: -moz-linear-gradient(top, #f3f3f3, #cfcfcf);
}

/* form error */
input.error {
	background-color: #ffffe3;
}

textarea.error {
	background-color: #ffffe3;
}

.error-message {
	color: #e14e54;
	visibility: visible;
}

/* header */
#page_header {

}

/* footer */
#page_footer {
	text-align: right;
	position: fixed;
	bottom: 0;
	right: 0;
	width: 100%;
	background-color: #3c3c3c;
	color: #dcdcdc;
	font-size: small;
	padding: 3em 3em 2em 3em;
}

/* centering page */
#top {
	margin-top: 20px;
	position: relative;
	float: right;
	width: 100%;
	text-align: center;
}

#floater {
	height: 50%;
	margin-bottom: -180px;
	position: relative;
}

#content {
	clear: both;
	position: relative;
	width: 70%;
	margin: 0 auto;
	padding: 20px;
	height: 300px;
}

#start {
	visibility: hidden;
}

#start, #regist, #login, #mypage, #allclear, #ranking {
	text-align: center;
}

#start input[type='text'], #regist input[type='password'] {
	text-align: center;
}

#login table {
	margin-right: auto;
	margin-left: auto;
}

#login table tr {
	text-align: left;
}
</style>

	<style>
body {
	background-color: #8EAF8C;
}
</style>


</head>
<body>

	<noscript>お使いのブラウザのJavaScriptを有効にしてください。</noscript>

	<script type="text/javascript">
		$(function() {
			$(document).bind('contextmenu', function() {
				alert('残念。。。(^^)/');
				return false;
			});
		});
	</script>
	<br>
	<br>

	<div id="top">
		<h2>認証突破練習問題 ２</h2>
	</div>

	<div id="content">

		<p id="top" style="color: red">${errorMessage}</p>

		<div id="login">
			<form action="Le2Servlet" method="post">

				<!-- reminder -->
				<!-- id: admin -->
				<!-- pass: RedChili -->

				<br>
				<br>
				<table>
					<tr>
						<td>ID:</td>
						<td><input type="text" name="name" value=""
							autocomplete="off" required /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" name="password" value=""
							autocomplete="off" required /></td>
					</tr>
				</table>
				<br>
				<br>
				<br> <input class="large_button" type="submit" value="ログイン" />
			</form>

		</div>
	</div>

</body>
</html>