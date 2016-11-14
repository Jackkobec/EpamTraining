package com.jss.lessons.lesson6.inner.refactored_inner;

/**
 * Create open interface and implement it in the Inner or nested class.
 * Add method for create instance of the Nested or Inner class
 *
 * <p>
 * Inner. Task2Nested
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 12.11.2016.
 */
public class Task2Nested implements ITask2 {

    @Override
    public void printClassName() {
        System.out.println(new Task2Nested().getClass().getName());
    }

    /**
     * Use Nested class
     */
    //Nested private class
    private static class NestedTask2 implements ITask2 {

        @Override
        public void printClassName() {
            System.out.println(new NestedTask2().getClass().getName());
        }
    }

    //Method for return Instance of the Nested class
    public ITask2 createInstanceOfTheNestedClass() {

        return new NestedTask2();
    }
}