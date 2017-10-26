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
	<!--<s:if test="%{cartList.size() > 0 && #session.userId != null}">-->
		<s:iterator value="cartList">
			<tr align="center">
				<td align="left"><h4>
						<s:property value="itemName" />
					</h4></td>
				<td><h4>
						<s:property value="price" />
					</h4></td>
				<td><s:property value="quantities" /></td>

				<td><s:form action="CartUpdateAction">
						<s:hidden name="cartId" value="%{cartId}" />
						<s:hidden name="itemId" value="%{itemId}" />
						<s:hidden name="prevQuantities" value="%{quantities}" />
						<input type="text" style="width: 30px; height: 20px;"
							name="quantities" id="${cartId}" name="quantities"
							value="${quantities}" maxlength="2"
							<s:if test="stocks+quantities>=9"> pattern="([0-9])|([0-4][0-9])|(9)" placeholder="1-49"</s:if>
							<s:else>pattern="[1-<s:property value="quantities+stocks"/>]*" placeholder="1-<s:property value="quantities+stocks"/>"</s:else> />
						<button type="submit" class="btn-action marginLeft">
						</button>
					</s:form></td>
				<td><s:form action="CartDeleteAction">
						<s:hidden name="userId" value="%{userId}" />
						<s:hidden name="cartId" value="%{cartId}" />
						<button type="submit" class="btn-action paddingHeight">
						</button>
					</s:form></td>
			</tr>
		</s:iterator>
		<s:property value="item_name" />
	a
	<s:property value="price" />
	a
	<s:property value="quantities" />
	a
	<s:property value="item_id" />
	a
	<s:property value="userId" />
	</s:if>

	<s:else>
		<h2>カートは空です</h2>
	</s:else>

</body>
</html>