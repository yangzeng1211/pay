<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">

        <title>Paymax 体验支付</title>
        <script type='text/javascript' src='http://dev.paymax.cc/merchant-api/js/config?config=app_49b0f1dd741646d2b277524de2785836'></script>
        <%--<script type='text/javascript' src='https://www.paymax.cc/merchant-api/js/config?config=app_7hqF2S6GYXET457i'></script>--%>
    </head>
    <body>
        <button id="charge" onclick="charge()">Paymax 体验支付</button>
    </body>
<script src="/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
        var path = "${pageContext.request.contextPath}";
        var Authorization ;
        var nonce ;
        var timestamp ;
        var sign ;
        var request_data ;
        $.ajax({
            url:path+"/assemblyParameters",
            dataType:"json",
            success:function(data){
                Authorization = data.AUTHORIZATION;
                nonce = data.nonce;
                timestamp = data.timestamp;
                sign = data.sign;
                request_data = data.requestBody;
            },
            error: function() {
                alert("error");
              }
        });

    function charge() {
        alert(123);
        Paymax.charge({
            "debug" : false,
            "Authorization": Authorization,
            "nonce": nonce,
            "timestamp": timestamp,
            "sign": sign, //商品信息hash值
            "request_data" : request_data
        },{ wxJsApiFinish: function(response) {},
            wxJsApiSuccess: function(response) {},
            wxJsApiFail: function(response) {},
            dataError: function(msg) {}
        });
        alert(456);
    }
</script>
</html>
