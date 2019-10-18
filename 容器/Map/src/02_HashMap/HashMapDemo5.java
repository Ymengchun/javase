package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
如果没有重写hashCode和equals：则成员变量相同时也会判断为不同对象（没有重写hashcode和equals方法之前，认为s1和s5作为key是不相等的）
 */
public class test {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<Student, String> hm = new HashMap<Student, String>();

        // 创建学生对象
        Student s1 = new Student("貂蝉", 27);
        Student s2 = new Student("王昭君", 30);
        Student s3 = new Student("西施", 33);
        Student s4 = new Student("杨玉环", 35);
        Student s5 = new Student("貂蝉", 27);

        // 添加元素
        hm.put(s1, "8888");
        hm.put(s2, "6666");
        hm.put(s3, "5555");
        hm.put(s4, "7777");
        hm.put(s5, "9999");

        // 遍历
        Set<Student> set = hm.keySet();
        for (Student key : set) {
            String value = hm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---"
                    + value);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + age;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Student other = (Student) obj;
//        if (age != other.age)
//            return false;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        return true;
//    }

}
