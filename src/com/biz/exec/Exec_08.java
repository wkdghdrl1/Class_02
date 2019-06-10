package com.biz.exec;

import java.time.Month;

import com.biz.sharp.Rectangle;

import com.biz.sharp.Sharp;

public class Exec_08 {

	public static void main(String[] args) {
		
		Sharp sharp = new Sharp();
		Rectangle rectangle = new Rectangle();
		
		sharp.rotate();
		
		System.out.println();
		System.out.println("rectangle method");
		rectangle.sharpName = "사각형";
		rectangle.rotate();
		
		
		
		
	}

}
