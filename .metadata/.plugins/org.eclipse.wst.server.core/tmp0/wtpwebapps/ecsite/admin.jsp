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

<title>Admin画面</title>

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

/* #top{ */
/* 	width:780px; */
/* 	margin:30px auto; */
/* 	border:1px solid #333; */
/* 	} */

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
#user{
	margin:auto;
	background-color:#ffe4e1;
	width:30%;
	border-radius:25px;
	font-size:18px;
	}
#item{
	margin:auto;
	background-color:#fff0f5;
	width:30%;
	border-radius:25px;
	font-size:18px;

	}
#contents{
	}
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
.button {
  position: relative;
  display: inline-block;
  padding: 0.25em 0.5em;
  text-decoration: none;
  color: #FFF;
  background: sandybrown;/*色*/
  border-radius: 4px;/*角の丸み*/
  box-shadow: inset 0 2px 0 rgba(255,255,255,0.2), inset 0 -2px 0 rgba(0, 0, 0, 0.05);
  font-weight: bold;
  border: solid 2px #d27d00;/*線色*/

}
.button:hover {
 box-shadow: 0 0 2px rgba(0, 0, 0, 0.30);
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
#user,#item{
  padding: 0.4em 0.5em;/*文字の上下 左右の余白*/
  color: #494949;/*文字色*/
  background: #f4f4f4;/*背景色*/
  border-left: solid 5px #7db4e6;/*左線*/
  border-bottom: solid 3px #d7d7d7;/*下線*/
}
</style>

</head>
<body>

	<div id="header">
		<div id="pr"></div>
	</div>
	<br><br>
	<div id="main">
	<div id="top">
	<p>管理画面</p>
	</div><br>
	<div id="contents">
	<div id="user">
	<p>ユーザー</p>
			<s:form action="UserCreateAction">
				<s:submit class="button" value="新規登録"/>
			</s:form>
			<s:form action="UserListAction">
				<s:submit class="button" value="一覧"/>
			</s:form>
		</div><br>

	<div id="item">
		<p>商品</p>
			<s:form action="ItemCreateAction">
				<s:submit class="button" value="新規登録"/>
			</s:form>
			<s:form action="ItemListAction">
				<s:submit class="button" value="一覧"/>
			</s:form>
		</div>
</div>
			<span>前画面に戻る場合は</span>
			<a href='<s:url action="HomeAction"/>'>こちら</a>
		</div>

	<div id="footer">
		<div id="pr"></div>

	</div>

</body>
</html>