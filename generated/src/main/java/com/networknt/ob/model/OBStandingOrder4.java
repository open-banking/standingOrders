package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBStandingOrder4  {

    private OBSupplementaryData1 SupplementaryData;
    private OBBranchAndFinancialInstitutionIdentification5 CreditorAgent;
    private String AccountId;
    private String StandingOrderId;
    private String Reference;
    private OBExternalStandingOrderStatus1Code StandingOrderStatusCode;
    private OBCashAccount5 CreditorAccount;
    private OBActiveOrHistoricCurrencyAndAmount FirstPaymentAmount;
    private OBActiveOrHistoricCurrencyAndAmount FinalPaymentAmount;
    private java.time.LocalDateTime FinalPaymentDateTime;
    private OBActiveOrHistoricCurrencyAndAmount NextPaymentAmount;
    private java.time.LocalDateTime NextPaymentDateTime;
    private String Frequency;
    private java.time.LocalDateTime FirstPaymentDateTime;

    public OBStandingOrder4 () {
    }

    @JsonProperty("SupplementaryData")
    public OBSupplementaryData1 getSupplementaryData() {
        return SupplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 SupplementaryData) {
        this.SupplementaryData = SupplementaryData;
    }

    @JsonProperty("CreditorAgent")
    public OBBranchAndFinancialInstitutionIdentification5 getCreditorAgent() {
        return CreditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification5 CreditorAgent) {
        this.CreditorAgent = CreditorAgent;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("StandingOrderId")
    public String getStandingOrderId() {
        return StandingOrderId;
    }

    public void setStandingOrderId(String StandingOrderId) {
        this.StandingOrderId = StandingOrderId;
    }

    @JsonProperty("Reference")
    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    @JsonProperty("StandingOrderStatusCode")
    public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
        return StandingOrderStatusCode;
    }

    public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code StandingOrderStatusCode) {
        this.StandingOrderStatusCode = StandingOrderStatusCode;
    }

    @JsonProperty("CreditorAccount")
    public OBCashAccount5 getCreditorAccount() {
        return CreditorAccount;
    }

    public void setCreditorAccount(OBCashAccount5 CreditorAccount) {
        this.CreditorAccount = CreditorAccount;
    }

    @JsonProperty("FirstPaymentAmount")
    public OBActiveOrHistoricCurrencyAndAmount getFirstPaymentAmount() {
        return FirstPaymentAmount;
    }

    public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount FirstPaymentAmount) {
        this.FirstPaymentAmount = FirstPaymentAmount;
    }

    @JsonProperty("FinalPaymentAmount")
    public OBActiveOrHistoricCurrencyAndAmount getFinalPaymentAmount() {
        return FinalPaymentAmount;
    }

    public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount FinalPaymentAmount) {
        this.FinalPaymentAmount = FinalPaymentAmount;
    }

    @JsonProperty("FinalPaymentDateTime")
    public java.time.LocalDateTime getFinalPaymentDateTime() {
        return FinalPaymentDateTime;
    }

    public void setFinalPaymentDateTime(java.time.LocalDateTime FinalPaymentDateTime) {
        this.FinalPaymentDateTime = FinalPaymentDateTime;
    }

    @JsonProperty("NextPaymentAmount")
    public OBActiveOrHistoricCurrencyAndAmount getNextPaymentAmount() {
        return NextPaymentAmount;
    }

    public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount NextPaymentAmount) {
        this.NextPaymentAmount = NextPaymentAmount;
    }

    @JsonProperty("NextPaymentDateTime")
    public java.time.LocalDateTime getNextPaymentDateTime() {
        return NextPaymentDateTime;
    }

    public void setNextPaymentDateTime(java.time.LocalDateTime NextPaymentDateTime) {
        this.NextPaymentDateTime = NextPaymentDateTime;
    }

    @JsonProperty("Frequency")
    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    @JsonProperty("FirstPaymentDateTime")
    public java.time.LocalDateTime getFirstPaymentDateTime() {
        return FirstPaymentDateTime;
    }

    public void setFirstPaymentDateTime(java.time.LocalDateTime FirstPaymentDateTime) {
        this.FirstPaymentDateTime = FirstPaymentDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBStandingOrder4 OBStandingOrder4 = (OBStandingOrder4) o;

        return Objects.equals(SupplementaryData, OBStandingOrder4.SupplementaryData) &&
               Objects.equals(CreditorAgent, OBStandingOrder4.CreditorAgent) &&
               Objects.equals(AccountId, OBStandingOrder4.AccountId) &&
               Objects.equals(StandingOrderId, OBStandingOrder4.StandingOrderId) &&
               Objects.equals(Reference, OBStandingOrder4.Reference) &&
               Objects.equals(StandingOrderStatusCode, OBStandingOrder4.StandingOrderStatusCode) &&
               Objects.equals(CreditorAccount, OBStandingOrder4.CreditorAccount) &&
               Objects.equals(FirstPaymentAmount, OBStandingOrder4.FirstPaymentAmount) &&
               Objects.equals(FinalPaymentAmount, OBStandingOrder4.FinalPaymentAmount) &&
               Objects.equals(FinalPaymentDateTime, OBStandingOrder4.FinalPaymentDateTime) &&
               Objects.equals(NextPaymentAmount, OBStandingOrder4.NextPaymentAmount) &&
               Objects.equals(NextPaymentDateTime, OBStandingOrder4.NextPaymentDateTime) &&
               Objects.equals(Frequency, OBStandingOrder4.Frequency) &&
               Objects.equals(FirstPaymentDateTime, OBStandingOrder4.FirstPaymentDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SupplementaryData, CreditorAgent, AccountId, StandingOrderId, Reference, StandingOrderStatusCode, CreditorAccount, FirstPaymentAmount, FinalPaymentAmount, FinalPaymentDateTime, NextPaymentAmount, NextPaymentDateTime, Frequency, FirstPaymentDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStandingOrder4 {\n");
        sb.append("    SupplementaryData: ").append(toIndentedString(SupplementaryData)).append("\n");        sb.append("    CreditorAgent: ").append(toIndentedString(CreditorAgent)).append("\n");        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    StandingOrderId: ").append(toIndentedString(StandingOrderId)).append("\n");        sb.append("    Reference: ").append(toIndentedString(Reference)).append("\n");        sb.append("    StandingOrderStatusCode: ").append(toIndentedString(StandingOrderStatusCode)).append("\n");        sb.append("    CreditorAccount: ").append(toIndentedString(CreditorAccount)).append("\n");        sb.append("    FirstPaymentAmount: ").append(toIndentedString(FirstPaymentAmount)).append("\n");        sb.append("    FinalPaymentAmount: ").append(toIndentedString(FinalPaymentAmount)).append("\n");        sb.append("    FinalPaymentDateTime: ").append(toIndentedString(FinalPaymentDateTime)).append("\n");        sb.append("    NextPaymentAmount: ").append(toIndentedString(NextPaymentAmount)).append("\n");        sb.append("    NextPaymentDateTime: ").append(toIndentedString(NextPaymentDateTime)).append("\n");        sb.append("    Frequency: ").append(toIndentedString(Frequency)).append("\n");        sb.append("    FirstPaymentDateTime: ").append(toIndentedString(FirstPaymentDateTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
