package com.ucloudlink.lambda.domain;



public class FlowLog 
{

	private String userCode;
	
	private String custId;
	
	private String country;
	
	private double flowSize;
	
	public FlowLog(String userCode,String custId,String country,double flowSize)
	{
		this.userCode = userCode;
		this.custId = custId;
		this.country = country;
		this.flowSize = flowSize;
	}
	
	public boolean equals(Object o)
	{
		FlowLog flowLog = (FlowLog) o;
		
		if(this.userCode.equals(flowLog.getUserCode())&&this.custId.equals(flowLog.getCustId()))
		{
			return true;
		}

		
		return false;
	}
	
	public int hashCode()
	{
	    return 1;
	}
	
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("userCode:");
		builder.append(this.userCode);
		builder.append(";custId:");
		builder.append(this.custId);
		builder.append(";flowSize:");
		builder.append(this.flowSize);
		
		return builder.toString();
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getFlowSize() {
		return flowSize;
	}

	public void setFlowSize(double flowSize) {
		this.flowSize = flowSize;
	}
	
   


}
