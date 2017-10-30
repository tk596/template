<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cart.jsp</title>
</head>
<body>
<s:include value="header.jsp" />
	<div id="main">
		<div>
			<s:form action="PaymentAction">
				<s:iterator value="CartList">
					<s:if test="itemName != null">
						<table>
							<tr>
								<td><span>商品名</span></td>
								<td><s:property value="itemName" /><br></td>
							</tr>
							<tr>
								<td><span>値段</span></td>
								<td><s:property value="price" /><span>円</span></td>
							</tr>
							<tr>
								<td><span>購入個数</span></td>
								<td><s:property value="quantities" /><span>個</span>
							</tr>
						</table>
					</s:if>
				</s:iterator>
				<div>
					<p>
						<input type="radio" name="pay" value="現金払い" checked="checked">現金払い

					</p>
					<p class="btn-select position1">
						<button class="btn buy" type="submit">購入</button>
					</p>
					<p>
						前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>
					</p>
					<p>
						マイぺージは<a href='<s:url action="MyPageAction" />'>こちら</a>
					</p>
				</div>
			</s:form>
			<s:else>
				<div>
					<h1>カートは空です。</h1>
				</div>
			</s:else>
		</div>
	</div>
  <s:include value="footer.jsp" />

</body>
</html>