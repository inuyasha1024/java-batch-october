package com.sliconspectra.designpatterntopic.singletontopic;

interface Tool{

}

class ToolOrigin implements Tool {

}

class ToolUpdate implements Tool {

}

class ToolNew implements Tool {

}

public class FactoryTopic {

    public Tool getTool() {
        return new ToolNew();
    }

    public void method1() {
        Tool tool = getTool();
    }

    public void method2() {
        Tool tool = getTool();
    }

    public void method3() {
        Tool tool = getTool();
    }
}
