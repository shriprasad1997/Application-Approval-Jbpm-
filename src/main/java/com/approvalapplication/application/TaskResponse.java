package com.approvalapplication.application;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TaskResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private com.approvalapplication.application.Employee employee;
	private com.approvalapplication.application.Application application;
	private java.lang.String status;

	public TaskResponse() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public com.approvalapplication.application.Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(
			com.approvalapplication.application.Employee employee) {
		this.employee = employee;
	}

	public com.approvalapplication.application.Application getApplication() {
		return this.application;
	}

	public void setApplication(
			com.approvalapplication.application.Application application) {
		this.application = application;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public TaskResponse(java.lang.Long id,
			com.approvalapplication.application.Employee employee,
			com.approvalapplication.application.Application application,
			java.lang.String status) {
		this.id = id;
		this.employee = employee;
		this.application = application;
		this.status = status;
	}
// 		public TaskResponse(com.approvalapplication.application.Employee employee,
// 			com.approvalapplication.application.Application application,
// 			java.lang.String status) {
// 		this.employee = employee;
// 		this.application = application;
// 		this.status = status;
// 	}

}