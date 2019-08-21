package org.taru.entity;

import java.io.Serializable;

/**
 * 订单表
 */
public class Orders implements Serializable {
    private int orderId;
    private  int homeId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderUserIndate() {
        return orderUserIndate;
    }

    public void setOrderUserIndate(String orderUserIndate) {
        this.orderUserIndate = orderUserIndate;
    }

    public String getOrderOutdate() {
        return orderOutdate;
    }

    public void setOrderOutdate(String orderOutdate) {
        this.orderOutdate = orderOutdate;
    }

    private int userId;
    private String orderPrice;
    private int orderStatus;
    private String orderUserIndate;
    private String orderOutdate;
}
