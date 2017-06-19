package com.xls.ds.component.main.model;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by luoshun
 */
public class ExtractApplyData extends RecursiveTreeObject<ExtractApplyData> {
    private StringProperty bankName;
    private StringProperty cardName;
    private StringProperty cardNo;
    private DoubleProperty cashBackTotalAmount;
    private StringProperty city;
    private LongProperty cityId;
    private StringProperty county;
    private LongProperty countyId;
    private StringProperty provinceType;
    private LongProperty provinceId;
    private StringProperty ctime;
    private StringProperty district;
    private StringProperty extractType;
    private DoubleProperty goodsTotalAmount;
    private DoubleProperty money;
    private StringProperty note;
    private StringProperty phone;
    private DoubleProperty reimburseTotalAmount;
    private DoubleProperty runSubTotalAmount;
    private StringProperty saleOrdersId;
    private StringProperty status;
    private StringProperty stime;
    private LongProperty userId;
    private StringProperty userMsg;

    public ExtractApplyData(String cardName, String extractType) {
        this.cardName = new SimpleStringProperty(cardName);
        this.extractType = new SimpleStringProperty(extractType);
    }

    public String getBankName() {
        return bankName.get();
    }

    public StringProperty bankNameProperty() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName.set(bankName);
    }

    public String getCardName() {
        return cardName.get();
    }

    public StringProperty cardNameProperty() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName.set(cardName);
    }

    public String getCardNo() {
        return cardNo.get();
    }

    public StringProperty cardNoProperty() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo.set(cardNo);
    }

    public double getCashBackTotalAmount() {
        return cashBackTotalAmount.get();
    }

    public DoubleProperty cashBackTotalAmountProperty() {
        return cashBackTotalAmount;
    }

    public void setCashBackTotalAmount(double cashBackTotalAmount) {
        this.cashBackTotalAmount.set(cashBackTotalAmount);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public long getCityId() {
        return cityId.get();
    }

    public LongProperty cityIdProperty() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId.set(cityId);
    }

    public String getCounty() {
        return county.get();
    }

    public StringProperty countyProperty() {
        return county;
    }

    public void setCounty(String county) {
        this.county.set(county);
    }

    public long getCountyId() {
        return countyId.get();
    }

    public LongProperty countyIdProperty() {
        return countyId;
    }

    public void setCountyId(long countyId) {
        this.countyId.set(countyId);
    }

    public String getProvinceType() {
        return provinceType.get();
    }

    public StringProperty provinceTypeProperty() {
        return provinceType;
    }

    public void setProvinceType(String provinceType) {
        this.provinceType.set(provinceType);
    }

    public long getProvinceId() {
        return provinceId.get();
    }

    public LongProperty provinceIdProperty() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId.set(provinceId);
    }

    public String getCtime() {
        return ctime.get();
    }

    public StringProperty ctimeProperty() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime.set(ctime);
    }

    public String getDistrict() {
        return district.get();
    }

    public StringProperty districtProperty() {
        return district;
    }

    public void setDistrict(String district) {
        this.district.set(district);
    }

    public String getExtractType() {
        return extractType.get();
    }

    public StringProperty extractTypeProperty() {
        return extractType;
    }

    public void setExtractType(String extractType) {
        this.extractType.set(extractType);
    }

    public double getGoodsTotalAmount() {
        return goodsTotalAmount.get();
    }

    public DoubleProperty goodsTotalAmountProperty() {
        return goodsTotalAmount;
    }

    public void setGoodsTotalAmount(double goodsTotalAmount) {
        this.goodsTotalAmount.set(goodsTotalAmount);
    }

    public double getMoney() {
        return money.get();
    }

    public DoubleProperty moneyProperty() {
        return money;
    }

    public void setMoney(double money) {
        this.money.set(money);
    }

    public String getNote() {
        return note.get();
    }

    public StringProperty noteProperty() {
        return note;
    }

    public void setNote(String note) {
        this.note.set(note);
    }

    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public double getReimburseTotalAmount() {
        return reimburseTotalAmount.get();
    }

    public DoubleProperty reimburseTotalAmountProperty() {
        return reimburseTotalAmount;
    }

    public void setReimburseTotalAmount(double reimburseTotalAmount) {
        this.reimburseTotalAmount.set(reimburseTotalAmount);
    }

    public double getRunSubTotalAmount() {
        return runSubTotalAmount.get();
    }

    public DoubleProperty runSubTotalAmountProperty() {
        return runSubTotalAmount;
    }

    public void setRunSubTotalAmount(double runSubTotalAmount) {
        this.runSubTotalAmount.set(runSubTotalAmount);
    }

    public String getSaleOrdersId() {
        return saleOrdersId.get();
    }

    public StringProperty saleOrdersIdProperty() {
        return saleOrdersId;
    }

    public void setSaleOrdersId(String saleOrdersId) {
        this.saleOrdersId.set(saleOrdersId);
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getStime() {
        return stime.get();
    }

    public StringProperty stimeProperty() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime.set(stime);
    }

    public long getUserId() {
        return userId.get();
    }

    public LongProperty userIdProperty() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId.set(userId);
    }

    public String getUserMsg() {
        return userMsg.get();
    }

    public StringProperty userMsgProperty() {
        return userMsg;
    }

    public void setUserMsg(String userMsg) {
        this.userMsg.set(userMsg);
    }
}
