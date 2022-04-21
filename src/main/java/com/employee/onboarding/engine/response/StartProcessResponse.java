package com.employee.onboarding.engine.response;

//BaseResponse
public class StartProcessResponse {
	
	private String processInstanceId;

	private String taskId;
	
	private String applicationNumber;
	
	private String bussinessKey;
	
	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getBussinessKey() {
		return bussinessKey;
	}

	public void setBussinessKey(String bussinessKey) {
		this.bussinessKey = bussinessKey;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StartProcessResponse [processInstanceId=")
		.append(processInstanceId).append(", taskId=").append(taskId)
		.append(", applicationNumber=").append(", bussinessKey=")
		.append(bussinessKey).append("]");
		
		return builder.toString();
	}

}
