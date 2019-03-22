package com.gupaoedu.vip.pattern.template.course;

public class NetworkCourseTest {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        BigDataCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
