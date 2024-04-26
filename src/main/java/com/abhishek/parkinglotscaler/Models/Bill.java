package com.abhishek.parkinglotscaler.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private int amount;
    private Operator operator;
    private Gate gate;
    private List<Payment> payments;
    private BillStatus billStatus;
    private Ticket ticker;

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Ticket getTicker() {
        return ticker;
    }

    public void setTicker(Ticket ticker) {
        this.ticker = ticker;
    }
}
