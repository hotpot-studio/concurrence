package com.hsc.pattern.creational.singleton;

/**
 * @ClassName: com.hsc.pattern.creational.singleton.StaticInnerClassSingleton
 * @auther: 侯森川
 * @Date: 2020-6-5 17:34
 **/

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}

    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

}
