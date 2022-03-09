package com.employee.onboarding.engine.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class BaseResponse {
	
	private int status;
	
	@JsonInclude(Include.NON_NULL)
	private String errorMessage;
	
	@JsonInclude(Include.NON_NULL)
	private String errorCode;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("BaseResponse [status=").append(status).append(", errorMessage=")
		.append(errorMessage).append(", errorCode=").append(errorCode).append("]");
		
		return builder.toString();
	}
	
	

}
