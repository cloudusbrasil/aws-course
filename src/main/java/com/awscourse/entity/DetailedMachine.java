package com.awscourse.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class DetailedMachine extends machine {
	private String javaVersion;
	private String javaVendor;
	private String javaVendorUrl;
	
	public DetailedMachine(String ip, String name, String os,String architecture,String osVersion, String javaVersion, String javaVendorUrl) {
		super(ip, name, os, architecture, osVersion);
		this.javaVersion = javaVersion;
		this.javaVendor = javaVendor;
		this.javaVendorUrl = javaVendorUrl;
	}

	

}
