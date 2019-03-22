package com.gupaoedu.vip.pattern.template.course;

public class BigDataCourse extends NetworkCourse{
    private boolean needHomework = false;

    public BigDataCourse(boolean needHomework) {
        this.needHomework = needHomework;
    }

    void checkHomework() {
        System.out.println("检查大数据课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomework;
    }
}
