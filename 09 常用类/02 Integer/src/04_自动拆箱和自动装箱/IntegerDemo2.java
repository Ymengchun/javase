package Demo_06;

/*
 * 看程序写结果
 * 
 * 注意：Integer的数据直接赋值，如果在-128到127之间，会直接从缓冲池里获取数据
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//只要是new，必定新创建了一个对象
		Integer i1 = new Integer(127);	
		Integer i2 = new Integer(127);	
		System.out.println(i1 == i2);		//false
		System.out.println(i1.equals(i2));	//true
		System.out.println("-----------");

		Integer i3 = new Integer(128);	
		Integer i4 = new Integer(128);	
		System.out.println(i3 == i4);	//false
		System.out.println(i3.equals(i4));	//true
		System.out.println("-----------");

		//没有new，但128不在Integer的范围内，每次创建新的空间
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);		//false
		System.out.println(i5.equals(i6));	//true
		System.out.println("-----------");

		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);	//true
		System.out.println(i7.equals(i8));	//true

		//-128~127之间的数据存储在数据缓冲池中，如果数据是该范围内的，每次并不创建新的空间
		//Integer ii = Integer.valueOf(127);
	}
}
