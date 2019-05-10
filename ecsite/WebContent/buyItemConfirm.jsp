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

<title>buyItemConfirm画面</title>

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
/* table{ */
/* 	text-align:center; */
/* 	margin:0 auto; */
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
table{
  width: 65%;
  border-collapse: collapse;
  margin:0 auto;
}

table tr{
  border-bottom: solid 2px white;
}

table tr:last-child{
  border-bottom: none;
}

table th{
  position: relative;
  text-align: left;
  width: 20%;
  background-color: #52c2d0;
  color: white;
  text-align: center;
  padding: 10px 0;
}

table th:after{
  display: block;
  content: "";
  width: 0px;
  height: 0px;
  position: absolute;
  top:calc(50% - 10px);
  right:-10px;
  border-left: 10px solid #52c2d0;
  border-top: 10px solid transparent;
  border-bottom: 10px solid transparent;
}

table td{
  text-align: left;
  width: 50%;
  text-align: center;
  background-color: #eee;
  padding: 10px 0;
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
	<p>BuyItem</p>
	</div><br><br>
	<div>
		<s:form>
			<tr>
				<th>
					商品名
				</th>
				<td>
					<s:property value="session.buyItem_name"/>
				</td>
			</tr>
			<tr>
				<th>
					値段
				</th>
				<td>
					<s:property value="session.total_price"/>
						<span>円</span>
				</td>
			</tr>
			<tr>
				<th>
					購入個数
				</th>
				<td>
					<s:property value="session.count"/>個</td>
			</tr>

			<tr>
				<th>
					支払い方法
				</th>
				<td>
				<s:property value="session.pay"/></td>
			</tr>

			<br>

			<tr>
				<td><input class="button" type="button" value="戻る"
				 onclick="submitAction('HomeAction')"/></td>
				<td><input class="button" type="button" value="注文する"
				 onclick="submitAction('BuyItemConfirmAction')"/></td>
			</tr>

			</s:form>
<div>
	<p>前画面へ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
	<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
</div>

		</div>
		</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>