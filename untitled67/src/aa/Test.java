package aa;

/**
 * @author 陈杰华
 * @date 2020/4/4 - 9:56
 */
public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        t.add();
    }

    /* 程序员面试过程中，常见的i++和++i的区别(放到字节码的篇章再讲)*/
    public void add(){
        //第1类问题：
        int i1 = 10;
        i1++;
        System.out.println("i1 = " + i1);

        int i2 = 10;
        ++i2;
        System.out.println("i2 = " + i2);

        //第2类问题：
        int i3 = 10;
        int i4 = i3++;
        System.out.println("i4 = " + i4);

        int i5 = 10;
        int i6 = ++i5;
        System.out.println("i6 = " + i6);

        //第3类问题：
        int i7 = 10;
        i7 = i7++;
        System.out.println("i7 = " + i7);

        int i8 = 10;
        i8 = ++i8;
        System.out.println("i8 = " + i8);

        //第4类问题：
        int i9 = 10;
        int i10 = i9++ + ++i9;
        System.out.println("i10 = " + i10);
    }







    public void testAddOperation(){
        //byte、short、char、boolean：都以int型来保存
        //这个对应字节码中的：bipush 15中的bi
        byte i = 15;
        int j = 8;
        int k = i+j;

        int m = 800;
    }

    public int getSum(){
        int m = 10;
        int n = 28;
        int k = m+n;
        return k;
    }

    public void testGetSum(){
        int i = getSum();
        int j = 10;
    }
}
