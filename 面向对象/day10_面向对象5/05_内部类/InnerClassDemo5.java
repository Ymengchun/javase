/*
	�ֲ��ڲ��ࣺ�ھֲ�λ�ã������У��������
		A:����ֱ�ӷ����ⲿ��ĳ�Ա
		B:���ʹ�ã����ⲿ��ķ������ڣ��ھֲ��ڲ������ⴴ���ֲ��ڲ�����󣬵��þֲ��ڲ��෽��

	�ֲ��ڲ�����ʾֲ�������ע������?
		�ֲ��ڲ�����ʾֲ�����������final����
		ԭ��
			�ֲ����������ŷ����ĵ��ö����������ŵ�����϶���ʧ��
			���ֲ��ڲ�����������в�����������ʧ�����Ǿͻ������һ������Ľ����
			�ֲ��ڲ���������һ���Ѳ����ڵľֲ�������
			�����Ϊ������final������
*/
class Outer {
    private int num  = 10;

    public void method() {
        //int num2 = 20;    //���󣬱�����final����
        final int num2 = 20;
        class Inner {
            public void show() {
                System.out.println(num);	//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա����
                //���ڲ������ⲿ�����num2; ��Ҫ��num2����Ϊfinal����
                System.out.println(num2);   //20
            }
        }
        

        Inner i = new Inner();
        i.show();
    }
}

class InnerClassDemo5 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}