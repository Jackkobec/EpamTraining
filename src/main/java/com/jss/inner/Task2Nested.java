package com.jss.inner;

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
public class Task2Nested {

    private String someField = "External field";


    /**
     * Use Nested class
     */
    //Nested private class
    private static class NestedTask2 implements ITask2 {

        public void callExternalFromNested(){

            //call field from External class
            System.out.println(new Task2Nested().someField);
            //call method from External class
            new Task2Nested().callNestedFromExternal();


        }

        @Override
        public void printClassName() {
            System.out.println(new NestedTask2().getClass().getName());
        }
    }

    //Method for return Instance of the Nested class
    public ITask2 createInstanceOfTheNestedClass() {

        return new NestedTask2();
    }

    public void callNestedFromExternal(){

        //call nested class through External
        Task2Nested.NestedTask2 nestedTask2 = new Task2Nested.NestedTask2();

        //call  method from nested class
        nestedTask2.printClassName();

    }
}