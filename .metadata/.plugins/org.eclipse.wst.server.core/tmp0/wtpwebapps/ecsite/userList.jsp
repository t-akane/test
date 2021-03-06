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
	<title>ユーザー一覧画面</title>
	<style type="text/css">
	/* ========TAG LAYOUT======== */
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

	/* ========ID LAYOUT======== */

	#header {
	width: 100%;
	height: 80px;
	background-color: lightcoral;
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
	#text-right {
	display: inline-block;
	text-align: right;

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
table{
  width: 80%;
  border-collapse: collapse;
  border-spacing: 0;
  margin:0 auto;
}

table th,table td{
  padding: 10px 0;
  text-align: center;
}

table tr:nth-child(odd){
  background-color: mistyrose
}
table th{
  background-color: lightcoral

}
.button {
  display       : inline-block;
  border-radius : 6%;          /* 角丸       */
  font-size     : 18pt;        /* 文字サイズ */
  text-align    : center;      /* 文字位置   */
  cursor        : pointer;     /* カーソル   */
  padding       : 12px 12px;   /* 余白       */
  background    : #ffcc99;     /* 背景色     */
  color         : #ffffff;     /* 文字色     */
  line-height   : 1em;         /* 1行の高さ  */
  transition    : .3s;         /* なめらか変化 */
  box-shadow    : 2px 2px 3px #666666;  /* 影の設定 */
  border        : 2px solid #ffcc99;    /* 枠の指定 */
}
.button:hover {
  box-shadow    : none;        /* カーソル時の影消去 */
  color         : #ffcc99;     /* 背景色     */
  background    : #ffffff;     /* 文字色     */
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
				<p>userList</p>
			</div><br><br>
			<div>
				<s:if test="userInfoDTOList == null">
					<h3>ユーザー情報はありません。</h3>
				</s:if>
				<s:elseif test="message == null">
					<h3>ユーザー情報は以下になります。</h3>
					<table border="1">
						<tr>
							<th>id</th>
							<th>ログインID</th>
							<th>パスワード</th>
							<th>ユーザー名</th>
							<th>登録日</th>
							<th>更新日</th>
						</tr>
						<s:iterator value="userInfoDTOList">
							<tr>
								<td><s:property value="id" /></td>
								<td><s:property value="loginId" /></td>
								<td><s:property value="loginPass" /></td>
								<td><s:property value="userName" /></td>
								<td><s:property value="insert_date" /></td>
								<td><s:property value="update_date" /></td>
							</tr>
						</s:iterator>
					</table>
					<br><br>
					<s:form action="UserListDeleteConfirmAction" theme="simple">
						<s:submit class="button" value="削除" />
					</s:form>
				</s:elseif><br><br>
				<div id="text-right">
					<p>管理者TOP画面へ戻る場合は<a href='admin.jsp'>こちら</a></p>
				</div>
			</div>
		</div>
		<div id="footer">
			<div id="pr">
			</div>
		</div>
	</body>
</html>
