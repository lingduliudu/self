package com.localaccount.enums;

public enum SerialEnum {
	
	BEL_TOUZI("BEL_TOUZI"," 贝尔投资");
	private String type;
	private String description;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	private SerialEnum(String type, String description) {
		this.type=type;
		this.description=description;
	}

	
}
