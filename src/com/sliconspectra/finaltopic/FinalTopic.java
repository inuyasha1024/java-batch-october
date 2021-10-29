package com.sliconspectra.finaltopic;

//how to make a class immutable
//1 use final on the class
//2 define all variables as final
//3 initilize all variable in the constructor
//4 getter function
final class FinalClassSample {

    final int variable;
    final Object object;

    public  FinalClassSample(int variable, Object object) {
        this.variable = variable;
        this.object = object;
    }

    public int getVariable() {
        return this.variable;
    }

    public Object getObject() {

        return this.object;
    }
}


final public class FinalTopic {

    public final static void main(String[] args) {
//        final int a = 1;
//        int a = 2;
//        final String string1 = "123";
//        string1 = "345";
    }
}

