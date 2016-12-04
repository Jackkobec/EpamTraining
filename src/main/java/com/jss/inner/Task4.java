package com.jss.inner;

/**
 * Create anonymous class in the factory method
 * Inner. Task4
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 12.11.2016.
 */
public class Task4 implements ITask2 {

    @Override
    public void printClassName() {

        System.out.println(new Task4().getClass().getName());
    }

    public ITask2 createAnonymous() {
        return () -> {
            System.out.println("Return interface reference");
        };
    }

    /**
     * Return new Instance of the Anonymous class
     *
     * @return
     */
    public ITask2 createAnonymous2() {

        return new ClassForTask4() {
        };
    }
}