package com.example.demo.util;

import org.springframework.stereotype.Component;

@Component
public class DllUtil {

	static {
		
		try{
			System.loadLibrary("JNIDllUtil");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public native int getCount(int a,int b);
}
