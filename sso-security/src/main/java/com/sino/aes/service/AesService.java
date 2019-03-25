package com.sino.aes.service;

import com.sino.aes.utils.AesResponse;

public interface AesService {

	public AesResponse testAes(String key, String securityMessage, String name, String password);
	
}
