package com.ucloudlink.serializer.kryo.domain;

public class BalanceBO 
{
	private String userCode;
	
	private double amount;
	
	private String org;
	
	private byte[] msg;
	
	
	private String mvnoCode;
	
	private String custId;

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getMvnoCode() {
		return mvnoCode;
	}

	public void setMvnoCode(String mvnoCode) {
		this.mvnoCode = mvnoCode;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public byte[] getMsg() {
		return msg;
	}

	public void setMsg(byte[] msg) {
		this.msg = msg;
	}

}
