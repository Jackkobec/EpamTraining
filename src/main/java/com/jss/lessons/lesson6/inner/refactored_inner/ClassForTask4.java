package com.jss.lessons.lesson6.inner.refactored_inner;


/**
 * Created by Jack on 09.11.2016.
 */
public class ClassForTask4 implements ITask2 {

    @Override
    public void printClassName() {
        System.out.println(new ClassForTask4().getClass().getName());
    }
}
