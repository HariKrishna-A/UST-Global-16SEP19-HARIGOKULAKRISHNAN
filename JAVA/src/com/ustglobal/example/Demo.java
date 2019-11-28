package com.ustglobal.example;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {

		System.out.println("---------predicate---------");

		Predicate<Byte> p = i -> 3 == i;
		System.out.println(p.test((byte) 3));

		System.out.println("---------function---------");

		Function<Integer,Integer> f = i -> i * 3;

		for (int j = 1; j <= 10; j++) {

			System.out.println(f.apply(j));

		}

		System.out.println("---------suppalier---------");

		Supplier<String> str = () -> "Hii";
		System.out.println(str.get());
		
		System.out.println("---------consumer---------");
		
		Consumer<Integer> c = i -> {
			System.out.println("Hello Consumer");
		};
		
		c.accept(5);
		
		System.out.println("---------Bi_consumer---------");
		
		BiConsumer<String, Integer> bi = (s,i) -> {
			System.out.println("Name : "+s);
			System.out.println("Id : "+i);
		};
		
		bi.accept("Krishna", 29);
	}

}
