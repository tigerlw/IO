package com.ucloudlink.serializer.kryo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.ucloudlink.serializer.kryo.domain.BalanceBO;
import com.ucloudlink.serializer.kryo.domain.Segment;

public class KryoMainLoad 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Kryo kryo = new Kryo();
		
		kryo.register(Segment.class);
		
		String path = "D:/bin/";
		
		File f = new File(path);
		
		File fa[] = f.listFiles();
		
		SegmentMap sgMap = new SegmentMap(5);
		
		for(File file:fa)
		{
			Input input = new Input(new FileInputStream(path+file.getName()));
			
			
			Segment sgmt = kryo.readObject(input, Segment.class);
			
			input.close();
			
			System.out.println(sgmt.getIndex());
			
			for(Entry<String, BalanceBO> bl :sgmt.getDataMap().entrySet())
			{
				String key = bl.getKey();
				
				System.out.println("key =========="+key);
			}
			
			sgMap.putSegment(sgmt, sgmt.getIndex());
		}
		
		
		
	
		
		System.out.println("load finish=========="+sgMap.get("100").getUserCode());
		
		/*for(Entry<String, BalanceBO> entry :someObject.entrySet())
		{
			System.out.println(entry.getValue().getUserCode());
		}*/
		
	}

}
