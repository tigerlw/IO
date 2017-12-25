package com.ucloudlink.serializer.kryo.domain;

import java.util.HashMap;

public class Segment 
{
	private int index;
	
	private HashMap<String,BalanceBO> dataMap;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public HashMap<String,BalanceBO> getDataMap() {
		return dataMap;
	}

	public void setDataMap(HashMap<String,BalanceBO> dataMap) {
		this.dataMap = dataMap;
	}

}
