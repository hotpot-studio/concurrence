package com.hsc.pattern.structural.adapter.objectAdapter;



/**
 * @ClassName: com.hsc.pattern.structural.adapter.objectAdapter.Test
 * @auther: 侯森川
 * @Date: 2020-6-7 16:55
 **/

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreateTarget();
        target.request();

        target = new Adapter();
        target.request();
    }
}
