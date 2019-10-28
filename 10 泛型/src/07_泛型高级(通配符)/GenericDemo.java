package Demo_07;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型高级(通配符)
 * 		?：任意类型，一般为Object类或任意的Java类
 * 		? extends E：向下限定，E及其子类
 * 		? super E：向上限定，E及其父类
 */
public class GenericDemo {
	public static void main(String[] args) {
		//泛型如果明确的写的时候，前后必须一致
		Collection<Object> c1 = new ArrayList<Object>();
		//Collection<Object> c2 = new ArrayList<Animal>();	//错误
		//Collection<Object> c3 = new ArrayList<Dog>();		//错误
		//Collection<Object> c4 = new ArrayList<Cat>();		//错误

		//?表示:任意的类型都是可以的
		Collection<?> c5 = new ArrayList<Object>();
		Collection<?> c6 = new ArrayList<Animal>();
		Collection<?> c7 = new ArrayList<Dog>();
		Collection<?> c8 = new ArrayList<Cat>();

		//? extends E：向下限定，E及其子类
		//Collection<? extends Animal> c9 = new ArrayList<Object>();	//错误，Object是Animal的父类，而非子类
		Collection<? extends Animal> c10 = new ArrayList<Animal>();
		Collection<? extends Animal> c11 = new ArrayList<Dog>();
		Collection<? extends Animal> c12 = new ArrayList<Cat>();

		//? super E：向上限定，E及其父类
		Collection<? super Animal> c13 = new ArrayList<Object>();
		Collection<? super Animal> c14 = new ArrayList<Animal>();
		// Collection<? super Animal> c15 = new ArrayList<Dog>();	//错误，Dog是Animal的子类，而非父类
		// Collection<? super Animal> c16 = new ArrayList<Cat>();
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}