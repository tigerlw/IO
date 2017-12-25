package com.ucloudlink.serializer.kryo;

import com.ucloudlink.serializer.kryo.domain.BalanceBO;

public class SegmentMain 
{
	public static void main(String args[])
	{
		SegmentMap sgMap = new SegmentMap(5);
		
		BalanceBO bl = new BalanceBO();
		
		bl.setUserCode("liuwei");
		
		sgMap.put("123", bl);
		
		System.out.println(sgMap.get("123").getUserCode());
	}

}
