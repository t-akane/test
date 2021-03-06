<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<title>Home画面</title>
		<style type="text/css">

			body {
				margin:0;
				padding:0;
				line-height:1.6;
				letter-spacing:1px;
				font-family:Verdana, Helvetica, sans-serif;
				font-size:12px;
				color:#333;
				background:#fff;
			}
			table {
				text-align:center;
				margin:0 auto;
			}
			/* ========ecsite LAYOUT======== */


			#header {
				width: 100%;
				height: 80px;
				background-color:lightcoral;
			}
			#main {
				width: 100%;
				height: 500px;
				text-align: center;
			}
			#footer {
				width: 100%;
				height: 80px;
				background-color: lightcoral;
				clear:both;
			}
			#text-center {
				display: inline-block;
				text-align: center;
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
#btn{
text-align : center ;
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
		</style>
	</head>

	<body>

		<div id="header">
		<div id="pr">
		</div>

		</div><br><br>
		<div id="main">
			<div id="top">
				<h1>Home</h1>
			</div><br><br>
			<div id=”text-center”>
				<s:form action="HomeAction">
					<s:submit class="button" value="商品購入"/>
				</s:form>
				<s:if test="#session.id != null">
					<p>ログアウトする場合は
						<a href='<s:url action="LogoutAction" />'>こちら</a>
					</p>
				</s:if>
			</div>
		</div>
		<div id="footer">
			<div id="pr">
			</div>
		</div>
	</body>
</html>
