package com.jss.inner;

import com.jss.lessons.lesson6.inner.previos_inner.ITask2;

/**
 * Create open interface and implement it in the Inner or nested class.
 * Add method for create instance of the Nested or Inner class
 * <p>
 * <p>
 * Inner. Task2Inner
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 12.11.2016.
 */

public class Task2Inner implements ITask2 {

    @Override
    public void printClassName() {
        System.out.println(new Task2Inner().getClass().getName());
    }

    /**
     * Use Inner class
     */
    //Inner private class
    private static class InnerTask2 implements ITask2 {

        @Override
        public void printClassName() {
            System.out.println(new InnerTask2().getClass().getName());
        }
    }


    //method for return instance of the createInnerTask2
    public ITask2 createInnerTask2() {
        return new InnerTask2();
    }


}
