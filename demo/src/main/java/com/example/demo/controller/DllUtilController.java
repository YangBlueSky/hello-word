package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.util.DllUtil;

@Controller
@ResponseBody
public class DllUtilController {
	
	@Autowired
	private DllUtil dllUtil;
	@RequestMapping("/getCount")
	public int getCountFromC(int a,int b){
		int count = dllUtil.getCount(a, b);
		System.out.println("count====>"+count);
		return count;
	}
	
}
