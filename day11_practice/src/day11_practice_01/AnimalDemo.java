package day11_practice_01;

import day11_animal_02.Animal;
import day11_animal_02.Cat;
import day11_animal_02.Dog;
/**
 * 
 * 
 * Import all the missing packages in Eclipse IDE: 
 *     Mac: Command + Shift + o
 *     Windows: Ctrl + Shift + o
 *     
 * Shortcut to create main method:  
 *     ma(main) + Control + Space  
 *
 */
public class AnimalDemo {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.sleep();
		
		a = new Dog();
		a.eat();
		a.sleep();
		
		Dog d = (Dog) a;
		d.eat();
		d.sleep();
		d.jump();
		
		
		
		
		
	}
	
	
	
}
