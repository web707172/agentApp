package com.xls.ds.remote;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by luoshun
 */
public class ExtractApply {
    private String bankName;
    private String cardName;
    private String cardNo;
    private Double cashBackTotalAmount;
    private String city;
    private Long cityId;
    private String county;
    private Long countyId;
    private String provinceType;
    private Long provinceId;
    private String ctime;
    private String district;
    private String extractType;
    private Double goodsTotalAmount;
    private Double money;
    private String note;
    private String phone;
    private Double reimburseTotalAmount;
    private Double runSubTotalAmount;
    private String saleOrdersId;
    private String status;
    private String stime;
    private Long userId;
    private String userMsg;

    public ExtractApply() {
    }

    public ExtractApply(String cardName, String extractType) {
        this.cardName = cardName;
        this.extractType = extractType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Double getCashBackTotalAmount() {
        return cashBackTotalAmount;
    }

    public void setCashBackTotalAmount(Double cashBackTotalAmount) {
        this.cashBackTotalAmount = cashBackTotalAmount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getProvinceType() {
        return provinceType;
    }

    public void setProvinceType(String provinceType) {
        this.provinceType = provinceType;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getExtractType() {
        return extractType;
    }

    public void setExtractType(String extractType) {
        this.extractType = extractType;
    }

    public Double getGoodsTotalAmount() {
        return goodsTotalAmount;
    }

    public void setGoodsTotalAmount(Double goodsTotalAmount) {
        this.goodsTotalAmount = goodsTotalAmount;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getReimburseTotalAmount() {
        return reimburseTotalAmount;
    }

    public void setReimburseTotalAmount(Double reimburseTotalAmount) {
        this.reimburseTotalAmount = reimburseTotalAmount;
    }

    public Double getRunSubTotalAmount() {
        return runSubTotalAmount;
    }

    public void setRunSubTotalAmount(Double runSubTotalAmount) {
        this.runSubTotalAmount = runSubTotalAmount;
    }

    public String getSaleOrdersId() {
        return saleOrdersId;
    }

    public void setSaleOrdersId(String saleOrdersId) {
        this.saleOrdersId = saleOrdersId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserMsg() {
        return userMsg;
    }

    public void setUserMsg(String userMsg) {
        this.userMsg = userMsg;
    }
}
