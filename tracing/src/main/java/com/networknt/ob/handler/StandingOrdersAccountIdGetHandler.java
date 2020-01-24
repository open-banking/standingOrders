package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class StandingOrdersAccountIdGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        logger.debug("userId = " + userId);
        String accountId = exchange.getQueryParameters().get("AccountId").getFirst();
        logger.debug("accountId = " + accountId);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            switch(accountId) {
                case "22289":
                    responseBody = "{\"Data\":{\"StandingOrder\":[{\"AccountId\":\"22289\",\"StandingOrderId\":\"Ben3\",\"Frequency\":\"EvryWorkgDay\",\"Reference\":\"Towbar Club 2 - We Love Towbars\",\"FirstPaymentDateTime\":\"2017-08-12T00:00:00+00:00\",\"FirstPaymentAmount\":{\"Amount\":\"0.57\",\"Currency\":\"GBP\"},\"NextPaymentDateTime\":\"2017-08-13T00:00:00+00:00\",\"NextPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"FinalPaymentDateTime\":\"2027-08-12T00:00:00+00:00\",\"FinalPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"StandingOrderStatusCode\":\"Active\",\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"80200112345678\",\"Name\":\"Mrs Juniper\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/22289/standing-orders/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "31820":
                    responseBody = "{\"Data\":{\"StandingOrder\":[{\"AccountId\":\"31820\",\"StandingOrderId\":\"Ben3\",\"Frequency\":\"EvryWorkgDay\",\"Reference\":\"Towbar Club 2 - We Love Towbars\",\"FirstPaymentDateTime\":\"2017-08-12T00:00:00+00:00\",\"FirstPaymentAmount\":{\"Amount\":\"0.57\",\"Currency\":\"GBP\"},\"NextPaymentDateTime\":\"2017-08-13T00:00:00+00:00\",\"NextPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"FinalPaymentDateTime\":\"2027-08-12T00:00:00+00:00\",\"FinalPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"StandingOrderStatusCode\":\"Active\",\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"80200112345678\",\"Name\":\"Mrs Juniper\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/22289/standing-orders/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
        } else if("ericbroda".equals(userId)) {
            switch(accountId) {
                case "42281":
                    responseBody = "{\"Data\":{\"StandingOrder\":[{\"AccountId\":\"42281\",\"StandingOrderId\":\"Ben3\",\"Frequency\":\"EvryWorkgDay\",\"Reference\":\"Towbar Club 2 - We Love Towbars\",\"FirstPaymentDateTime\":\"2017-08-12T00:00:00+00:00\",\"FirstPaymentAmount\":{\"Amount\":\"0.57\",\"Currency\":\"GBP\"},\"NextPaymentDateTime\":\"2017-08-13T00:00:00+00:00\",\"NextPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"FinalPaymentDateTime\":\"2027-08-12T00:00:00+00:00\",\"FinalPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"StandingOrderStatusCode\":\"Active\",\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"80200112345678\",\"Name\":\"Mrs Juniper\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/42281/standing-orders/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "41221":
                    responseBody = "{\"Data\":{\"StandingOrder\":[{\"AccountId\":\"41221\",\"StandingOrderId\":\"Ben3\",\"Frequency\":\"EvryWorkgDay\",\"Reference\":\"Towbar Club 2 - We Love Towbars\",\"FirstPaymentDateTime\":\"2017-08-12T00:00:00+00:00\",\"FirstPaymentAmount\":{\"Amount\":\"0.57\",\"Currency\":\"GBP\"},\"NextPaymentDateTime\":\"2017-08-13T00:00:00+00:00\",\"NextPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"FinalPaymentDateTime\":\"2027-08-12T00:00:00+00:00\",\"FinalPaymentAmount\":{\"Amount\":\"0.56\",\"Currency\":\"GBP\"},\"StandingOrderStatusCode\":\"Active\",\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"80200112345678\",\"Name\":\"Mrs Juniper\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/41221/standing-orders/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
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
