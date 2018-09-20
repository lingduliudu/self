package com.localaccount.response;

import com.alibaba.fastjson.JSON;

public class ResponseInfo {
	
	private int responseCode;
	private String info;
	private String data;
	
	public void doSuccess() {
		this.responseCode=1;
		this.info="操作成功!";
	}
	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String toString(){
		return JSON.toJSONString(this);
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

}
