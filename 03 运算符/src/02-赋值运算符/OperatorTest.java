package s2_赋值运算符;
/*
	面试题：
		short s = 1; s = s + 1; 
		short s = 1; s += 1;
		上面两个代码有没有问题，如果有，那里有问题。
		
		第一个编译不通过：s是short类型，1是int类型，s+1是int类型（自动转换），等号左边的s是short类型
					  s+1→s要强制转换而第一个式子没有
		第二个没有问题：
			扩展的赋值运算符其实隐含了一个强制类型转换。
			
			s += 1;
			不是等价于 s = s + 1;
			而是等价于 s = (s的数据类型)(s + 1);
*/
class OperatorTest {
	public static void main(String[] args) {
		//short s = 1;
		//s = s + 1;
		//System.out.println(s);
		
		short s = 1;
		s += 1; //好像是 s = s + 1;
		System.out.println(s);
	}
}