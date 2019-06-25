package com.Bean;

public class orderform {
	private String orderNumber;
	private String logName;
	private String orderMess;
	private String sum;
	
	
	public orderform() {
		super();
	}

	public orderform(String orderNumber, String logName, String orderMess, String sum) {
		super();
		this.orderNumber = orderNumber;
		this.logName = logName;
		this.orderMess = orderMess;
		this.sum = sum;
	}
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getLogName() {
		return logName;
	}
	public void setLogName(String logName) {
		this.logName = logName;
	}
	public String getOrderMess() {
		return orderMess;
	}
	public void setOrderMess(String orderMess) {
		this.orderMess = orderMess;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	
	
}
