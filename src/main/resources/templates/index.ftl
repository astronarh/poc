<#import "/spring.ftl" as spring/>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Welcome</title>

    <style type="text/css">
        body, html {
            font-family: sans-serif;
        }
    </style>

    <script src="js/vis.min.js"></script>
    <link href="css/vis.min.css" rel="stylesheet" type="text/css" />
</head>

<body>
<h1>Welcome</h1>
<#if message??>
    <h2>${message}</h2>
</#if>

<a href="<@spring.url '/personList'/>">Person List</a>

<form>
    <label id="search">
        <input type="text" id="search">
    </label>
</form>

<table>
    <tr>
        <td>id</td>
        <td>product id</td>
        <td>price</td>
    </tr>
    <#list products as product>
        <tr>
            <td>${product.id}</td>
            <td>${product.productId}</td>
            <td>
                <#list product.prices as date, price>
                    ${date} : ${price}
                </#list>
            </td>
        </tr>
    </#list>
</table>

<div id="visualization"></div>

<script type="text/javascript">
    var container = document.getElementById('visualization');
    var items = [
        {x: '2014-06-11', y: 10},
        {x: '2014-06-12', y: 25},
        {x: '2014-06-13', y: 30},
        {x: '2014-06-14', y: 10},
        {x: '2014-06-15', y: 15},
        {x: '2014-06-16', y: 30}
    ];

    var dataset = new vis.DataSet(items);
    var options = {
        start: '2014-06-10',
        end: '2014-06-18'
    };
    var graph2d = new vis.Graph2d(container, dataset, options);
</script>

</body>

</html>