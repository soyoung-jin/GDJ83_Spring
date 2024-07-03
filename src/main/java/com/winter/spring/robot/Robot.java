package com.winter.spring.robot;

public class Robot {
//@Autowired // setrightarm에 rightarm을 넣어주는 역할, 만들어진 객체를 주입 역할
//@Qualifier("ra"); //다른 빈의 이름을 사용해야 할 때 
	private Arm rightArm; // 로봇은 오른쪽 팔을 가지고 있다.

//@Autowired
//@Qualifier("la");
//private Arm la;

	private Arm leftArm;
	private int age;
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Arm getRightArm() {
		return rightArm;
	}

	public void setRightArm(Arm rightArm) {
		this.rightArm = rightArm;
	}

	public Arm getLeftArm() {
		return leftArm;
	}

	public void setLeftArm(Arm leftArm) {
		this.leftArm = leftArm;
	}

}