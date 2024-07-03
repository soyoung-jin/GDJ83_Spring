package com.winter.spring.robot;

import org.springframework.stereotype.Component;

@Component("la") // 객체(빈)의 이름이 ra로 됨 그 이름으로 만들어짐. 이 이름으로 구분함 그니까 다르면 안됨.
public class LeftArm implements Arm {
	public void info() {
		System.out.println("왼팔입니다.");
	}

}
