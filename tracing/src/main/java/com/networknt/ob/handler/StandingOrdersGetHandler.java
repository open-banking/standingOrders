package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class StandingOrdersGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            responseBody = "{\"Data\":{\"StandingOrder\":[{\"AccountId\":\"22289\",\"StandingOrderId\":\"Ben3\",\"Frequency\":\"EvryWorkgDay\",\"Reference\":\"Towbar Club 2 - We Love Towbars\",\"FirstPaymentDateTime\":\"2017-08-12T00:00:00+00:00\",\"FirstPaymentAmount\":{\"Amount\":\"0.57\",\"Currency\":\"GBP\"},\"NextPaymentDateTime\":\"2017-08-13T00:00:00+00:00\",\"NextPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"FinalPaymentDateTime\":\"2027-08-12T00:00:00+00:00\",\"FinalPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"StandingOrderStatusCode\":\"Active\",\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"80200112345678\",\"Name\":\"Mrs Juniper\"}},{\"AccountId\":\"31820\",\"StandingOrderId\":\"Ben5\",\"Frequency\":\"WkinMnthDay(2)\",\"Reference\":\"Golf - We Love Golf\",\"FirstPaymentDateTime\":\"2017-06-12T00:00:00+00:00\",\"FirstPaymentAmount\":{\"Amount\":\"23.00\",\"Currency\":\"GBP\"},\"NextPaymentDateTime\":\"2017-07-12T00:00:00+00:00\",\"NextPaymentAmount\":{\"Amount\":\"23.00\",\"Currency\":\"GBP\"},\"FinalPaymentDateTime\":\"2018-06-12T00:00:00+00:00\",\"FinalPaymentAmount\":{\"Amount\":\"23.00\",\"Currency\":\"GBP\"},\"StandingOrderStatusCode\":\"Active\",\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"23605490179017\",\"Name\":\"Mr Tee\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/standing-orders/\"},\"Meta\":{\"TotalPages\":1}}";
        } else if ("ericbroda".equals(userId)) {
            responseBody = "{\"Data\":{\"StandingOrder\":[{\"AccountId\":\"42281\",\"StandingOrderId\":\"Ben3\",\"Frequency\":\"EvryWorkgDay\",\"Reference\":\"Towbar Club 2 - We Love Towbars\",\"FirstPaymentDateTime\":\"2017-08-12T00:00:00+00:00\",\"FirstPaymentAmount\":{\"Amount\":\"0.57\",\"Currency\":\"GBP\"},\"NextPaymentDateTime\":\"2017-08-13T00:00:00+00:00\",\"NextPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"FinalPaymentDateTime\":\"2027-08-12T00:00:00+00:00\",\"FinalPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"StandingOrderStatusCode\":\"Active\",\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"80200112345678\",\"Name\":\"Mrs Juniper\"}},{\"AccountId\":\"41221\",\"StandingOrderId\":\"Ben5\",\"Frequency\":\"WkinMnthDay(2)\",\"Reference\":\"Golf - We Love Golf\",\"FirstPaymentDateTime\":\"2017-06-12T00:00:00+00:00\",\"FirstPaymentAmount\":{\"Amount\":\"23.00\",\"Currency\":\"GBP\"},\"NextPaymentDateTime\":\"2017-07-12T00:00:00+00:00\",\"NextPaymentAmount\":{\"Amount\":\"23.00\",\"Currency\":\"GBP\"},\"FinalPaymentDateTime\":\"2018-06-12T00:00:00+00:00\",\"FinalPaymentAmount\":{\"Amount\":\"23.00\",\"Currency\":\"GBP\"},\"StandingOrderStatusCode\":\"Active\",\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"23605490179017\",\"Name\":\"Mr Tee\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/standing-orders/\"},\"Meta\":{\"TotalPages\":1}}";
        }
        if(responseBody != null) {
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
            exchange.getResponseSender().send(responseBody);
        } else {
            exchange.setStatusCode(404);
            exchange.getResponseSender().send("");
        }
    }
}
