package com.guapaoedu.vip.pattern.observer.gperadvice;

public class ObserverTest {

    public static void main(String[] args) {
        GPer gper = GPer.getInstance();

        Teacher teacher = new Teacher("tom");

        Question question = new Question();
        question.setContent("我有一个问题");
        question.setUserName("老王");
        gper.addObserver(teacher);
        gper.publishQuestion(question);

    }
}
