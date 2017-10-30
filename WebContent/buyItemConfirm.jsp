<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="utf-8">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>buyItemConfirm画面</title>
<script type="text/javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>
</head>
<body>
	<!-- header -->
	<s:include value="header.jsp" />
	<!-- header end -->
	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
		<div>
			<s:form action="PaymentComplateAction">
				<s:iterator value="CartList">
					<tr>
						<td>商品名</td>
						<td><s:property value="itemName" /></td>
					</tr>
					<tr>
						<td>値段</td>
						<td><s:property value="price" /><span>円</span></td>
					</tr>
					<tr>
						<td>購入個数</td>
						<td><s:property value="quantities" /><span>個</span></td>
					</tr>
				</s:iterator>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td>支払い方法</td>
					<td><s:property value="session.pay" /></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td><input type="button" value="戻る"
						onclick="submitAction('HomeAction')" /></td>
					<td><input type="button" value="完了"
						onclick="submitAction('PaymentCompleteAction')" /></td>
				</tr>
			</s:form>
		</div>
	</div>
	  <s:include value="footer.jsp" />

</body>
</html>