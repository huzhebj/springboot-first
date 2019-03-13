<html>
<meta http-equiv=Content-Type content="text/html;charset=utf-8">
<head>
	<title>hello spring boot</title>
</head>
<body>
	<img src="/images/2010062315124364.jpg">
	商品列表<br>
	<table border="1">
		<tr>
			<th>商品id</th>
			<th>商品标题</th>
			<th>商品卖点</th>
			<th>商品价格</th>
		</tr>
		<#list itemList as item>
		<tr>
			<td>${item.id}</td>
			<td>${item.title}</td>
			<td>${item.sellPoint}</td>
			<td>${item.price}</td>
		</tr>
		</#list>
	</table>
</body>
</html>