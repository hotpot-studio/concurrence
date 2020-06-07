package com.hsc.pattern.structural.adapter.classAdapter;

/**
 * @ClassName: com.hsc.pattern.structural.adapter.classAdapter.ConcreateTarget
 * @auther: 侯森川
 * @Date: 2020-6-7 15:58
 **/

public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreateTarget的request");
    }
}
