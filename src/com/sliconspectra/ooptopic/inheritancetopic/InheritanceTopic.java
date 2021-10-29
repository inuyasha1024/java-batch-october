package com.sliconspectra.ooptopic.inheritancetopic;


class SupperClass {
    public int var1 = 1;
    public void method3() {

        System.out.println(var1);
    }

}

abstract class SupperClass2 {
    public int var1 = 1;
    public abstract void method2();
}



interface Interface1 {
    int var2 = 3;
    public void method3();
}

interface Interface2 extends Interface1 {
    public static int var3 = 4;
}


public class InheritanceTopic extends SupperClass {

    public int var1 = 5;
    public  void method3() {
        System.out.println(this.var1);
    };

    public void method4() {
        super.method3();
    }

    public static void main(String[] args) {
        InheritanceTopic inheritanceTopic = new InheritanceTopic();
//        inheritanceTopic.method4();
//        InheritanceTopic inheritanceTopic1 = inheritanceTopic;
        System.out.println(inheritanceTopic);
    }


}
