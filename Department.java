package com.dept;


	public class Department {//Department must be declared in its own file
		private int departmentNumber; //same as deptno column
		private String departmentName; // same as dname column
		private String departmentLocation; //same as loc column
		private int departmentId;
		//setter and getter to set and fetch information 
		public int getDepartmentNumber() {
			return departmentNumber;
		}
		public void setDepartmentNumber(int departmentNumber) {
			this.departmentNumber = departmentNumber;
		}
		public int getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
		
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		
		public String getDepartmentLocation() {
			return departmentLocation;
		}
		public void setDepartmentLocation(String departmentLocation) {
			this.departmentLocation = departmentLocation;
		}
	}



