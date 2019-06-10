package com.biz.model;
/*
 * VO : Value Object
 * 사용자 정의 변수라고 하며
 * 멤버변수에 값들을 담아서 다른 메소드에 보내거나
 * 메소드에서 리턴하는 값을 받는 용도로 사용된다.
 */
public class StudentVO {
	
	// public : StudentVO를 객체로 생성한 곳에서
	// 마음대로 멤버변수에 값을 저장하거나
	// 값을 읽을 수 있도록 개방하는 keyword
	public String number;
	public String name;
	public int grade;
	public String tel;
	public int age;
	public String addr;
	
	
}
