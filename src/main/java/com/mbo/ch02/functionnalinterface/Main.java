package com.mbo.ch02.functionnalinterface;

import com.mbo.ch02.functionnalinterface.classes.Animal;
import com.mbo.ch02.functionnalinterface.classes.CheckTrait;

public class Main {
	
	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		} else 
			System.out.println("N/A");
	}

	public static void main(String[] args) {
		//Tiger t = new Tiger();
		//t.sprint(t);
		print(new Animal("fish", false, true), a->a.canHop());
		print(new Animal("fish", false, true), a->a.canSwim());
		print(new Animal("kangaroo", true, false), a->a.canHop());
		print(new Animal("kangaroo", true, false), a->a.canSwim());
	}
}
