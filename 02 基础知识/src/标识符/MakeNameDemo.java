package 标识符;

/*
	标识符：给类，接口，方法，变量等起名字。
		命名规则：
			1.字母，区分大小写
			2.数字字符
			3.$和_	
		注意事项：
			1.不能以数字开头
			2.不能是Java中的关键字
			3.Java区分大小写
		常见的命名规则：见名知意
			class Student {}
			
	包：就是文件夹，不同包中的类名可以相等
	        全部小写
			单级：liuyi
			多级：cn.itcast

					
	类或接口：
		一个单词：首字母大写
			举例：Student,Dog
		多个单词：每个单词的首字母必须大写
			举例：HelloWorld, StudentName
			
	方法或变量：
		一个单词：首字母小写
			举例：main,age
		多个单词：驼峰原则——从第二个单词开始，每个单词的首字母大写
			举例：studentAge,showAllNames()
				
	常量：
		一个单词：全部大写
			举例：PI
		多个单词：每个单词都大写，用_隔开
			举例：STUDENT_MAX_AGE
		
*/
class MakeNameDemo {
	public static void main(String[] args) {
		//正确做法
		int x = 100;
		
		//不能以数字开头
		//int 1y = 100;
		int y1 = 100;
		
		//不能是Java中的关键字
		//int public = 100;
		int Public = 100;
	}
}