package com.jss.inner;


/**
 * ClassForTask4
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 12.11.2016.
 */
public class ClassForTask4 implements ITask2 {

    @Override
    public void printClassName() {
        System.out.println(new ClassForTask4().getClass().getName());
    }
}
