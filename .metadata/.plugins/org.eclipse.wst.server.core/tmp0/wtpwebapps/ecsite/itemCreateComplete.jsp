<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>

<title>ItemCreateComplete画面</title>

<style type="text/css">

body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana,Helvetica,sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
	}
table{
	text-align:center;
	margin:0 auto;
	}



#header{
	width:100%;
	height:80px;
	background-color:lightcoral;
	}

#main{
	width:100%;
	height:500px;
	text-align:center;
	}

#footer{
	width:100%;
	height:80px;
	background-color:lightcoral;
	clear:both;
	}
#top {
    width:30%;
    padding: 0.5em 1em;
    margin: 2em 0;
    color: #232323;
    background: #fff8e8;
    border-left: solid 10px #ffc06e;
    margin:0 auto;
    font-size:20px;
}
#top p {
    margin: 0;
    padding: 0;
}

</style>

</head>
<body>

	<div id="header">
		<div id="pr"></div>
	</div><br><br>
	<div id="main">
	<div id="top">
	<p>ItemCreateComplete</p>
	</div><br><br>
	<div>
	<h3>商品の登録が完了致しました。</h3>
	<div>
		<a href='<s:url action="HomeAction"/>'>ログインへ</a>
	</div>
		</div>
		</div>
	<div id="footer">
		<div id="pr"></div>

	</div>

</body>
</html>