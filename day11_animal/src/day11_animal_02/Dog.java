package day11_animal_02;

import day11_animal_01.Jump;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		System.out.println("jumpping dog");

	}

	@Override
	public void eat() {
		System.out.println("eating dog");

	}

	@Override
	public void sleep() {
		System.out.println("sleeping dog");

	}

}
