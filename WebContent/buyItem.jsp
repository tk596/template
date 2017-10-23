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
  <title>BuyItem画面</title>
  <link rel="stylesheet" href="./css/index.css" type="text/css">

</head>
<body>
  <div class="header">
    <div class="pr">
    </div>
  </div>
  <div class="main">
    <div class="top">
      <p>BuyItem</p>
    </div>
    <div>
    <s:form action="BuyItemAction">
      <table>
        <tr>
          <td>
            <span>商品名</span>
          </td>
          <td>
            <s:property value="session.buyItem_name" /><br>
          </td>
        </tr>
        <tr>
          <td>
            <span>値段</span>
          </td>
          <td>
            <s:property value="session.buyItem_price" /><span>円</span>
          </td>
        </tr>
        <tr>
          <td>
            <span>購入個数</span>
          </td>
          <td>
            <select name="count">
              <option value="1" selected="selected">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>
            <span>支払い方法</span>
          </td>
          <td>
            <input type="radio" name="pay" value="1" checked="checked">現金払い
            <input type="radio" name="pay" value="2">クレジットカード
          </td>
        </tr>
        <tr>
          <td>
            <s:submit value="購入"/>
          </td>
        </tr>
      </table>
    </s:form>
      <div>
        <p>前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
        <p>マイぺージは<a href='<s:url action="MyPageAction" />'>こちら</a></p>
      </div>
    </div>
  </div>
  <div class="footer">
    <div class="pr">
    </div>
  </div>
</body>
</html>