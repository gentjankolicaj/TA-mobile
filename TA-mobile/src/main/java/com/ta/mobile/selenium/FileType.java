package com.ta.mobile.selenium;

public enum FileType {

	JPG(".jpg"),PNG(".png"),JPEG(".jpeg"),SVG(".svg");
	
	private String extension;
	
	FileType(String extension){
		this.extension=extension;
	}

	public String getExtension() {
		return extension;
	}
	
	
}
