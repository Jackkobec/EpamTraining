package com.jss.inner;

/**
 * Create Local class in the factory method
 * <p>
 * Inner. Task3Nested
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 12.11.2016.
 */

public class Task3Nested implements ITask2 {

    @Override
    public void printClassName() {

        System.out.println(new Task3Nested().getClass().getName());
    }

    /**
     * Use Nested class
     */
    //Inner private class
    private static class InnerTask3 implements ITask2 {

        @Override
        public void printClassName() {
            System.out.println(new InnerTask3().getClass().getName());
        }
    }

    /**
     * Local class in the factory method
     *
     * @return
     */
    public ITask2 localClassInTheFctoryMethod() {

        class LocalClassTask3 implements ITask2 {

            @Override
            public void printClassName() {

                System.out.println(new LocalClassTask3().getClass().getName());
            }
        }

        return new LocalClassTask3();
    }


    //method for return instance of the createInnerTask2
    public ITask2 createInnerTask2() {

        return new InnerTask3();
    }
}

