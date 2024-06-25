package com.winter.spring.departments;

public class DepartmentDTO {
	// 기본 생성자
	// department테이블 값 중에서 하나의 행값을 저장

	// 테이블의 컬럼명과 타입을 일치시킨다.

	// 자바니까 자바의 문법을 따라서 변수명이 소문자 시작
	private Integer department_id;
	private String department_name;
	private Long manager_id;
	private Integer location_id;

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Long getManager_id() {
		return manager_id;
	}

	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

}
