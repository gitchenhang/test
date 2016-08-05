package com.gcs.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GcsService {
	public String csg_message(String vssid,String data,String token){
		System.out.println("------------");
		System.out.println(data);
		System.out.println("------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	    String timeString = sdf.format(new Date());
		String xml = "<?xml version=\"1.0\" encoding=\" UTF-8 \" standalone=\"yes\" ?><ROOT><CODE>00</CODE><MESSAGE>" + 
			      data + "</MESSAGE><TIME>" + timeString + "</TIME></ROOT>";
		return xml;
	}
}
