package com.test.controller;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

public class Test extends Model<Test>{
	
	public static final Test me=new Test();
	
	public Page<Test> paginate(int pageNumber,int pageSize){
		return paginate(pageNumber,pageSize,"select * ","from job_info_yanweikang");
	}

	public List<Test> getList(){
		return null;
	}
}
