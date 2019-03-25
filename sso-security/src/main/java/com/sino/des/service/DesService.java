package com.sino.des.service;

import com.sino.des.utils.DesResponse;

public interface DesService {

	public DesResponse testDes(String key, String securityMessage, String name, String password);
	
}
