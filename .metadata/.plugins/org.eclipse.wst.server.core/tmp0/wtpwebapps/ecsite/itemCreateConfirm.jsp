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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<!-- //これの追加を忘れたので、ボタンが押せなかった。 -->

<title>ItemCreateConfirm画面</title>

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
<script type="text/javascript">
function submitAction(url){
		$('form').attr('action',url);
		$('form').submit();
}
</script>
</head>
<body>

	<div id="header">
		<div id="pr"></div>
	</div><br><br>
	<div id="main">
	<div id="top">
	<p>ItemCreateConfirm</p>
	</div><br><br>
	<div>
	<h3>登録する内容は以下でよろしいですか。</h3>
			<table>
			<s:form action="ItemCreateCompleteAction">
				<tr id="box">
				<td>
					<label>商品名：</label>
				</td>
				<td>
					<s:property value="session.itemName"/>
				</td>
			</tr>
			<tr id="box">
				<td>
					<label>金額：</label>
				</td>
				<td>
					<s:property value="session.itemPrice"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>在庫数：</label>
				</td>
				<td>
					<s:property value="session.itemStock" />
				</td>
			</tr>
			<tr>
				<td>
					<s:submit value="完了"/>
				</td>
			</tr>

		</s:form>
		</table>
		</div>
		</div>
	<div id="footer">
		<div id="pr"></div>

	</div>

</body>
</html>