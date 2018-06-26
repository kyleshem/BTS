package com.enwan.mp.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestResponse {
	
	private Boolean success;
	private String message;
	
	public RequestResponse(Boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	
	
}
