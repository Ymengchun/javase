/*
	�����ڲ��ࣺ�ڲ���ļ�д����

	ǰ�᣺����һ���ࣨ������/�����඼�У����߽ӿ�

	��ʽ��
		new �������߽ӿ���(){
			��д����;
		}

	���ʣ�һ���̳��˸������ʵ���˸ýӿڵ�������������
*/
interface Inter {
    public abstract void show();
    public abstract void show2();
}

class Outer {
    public void method() {
        Inter i = new Inter() { //��̬
            public void show() {
                System.out.println("show");
            }

            public void show2() {
                System.out.println("show2");
            }
        };

        i.show();
        i.show2();
    }
}

class InnerClassDemo6 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}