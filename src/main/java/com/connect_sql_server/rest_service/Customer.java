package com.connect_sql_server.rest_service;

public class Customer {

    private String customerName;
    private boolean enabled;
    private int mapGroupId;
    private int customerId; 

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getMapGroupId() {
        return mapGroupId;
    }

    public void setMapGroupId(int mapGroupId) {
        this.mapGroupId = mapGroupId;
    }
}
