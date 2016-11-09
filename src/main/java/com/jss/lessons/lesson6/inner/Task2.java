package com.jss.lessons.lesson6.inner;

/**
 * Created by Jack on 09.11.2016.
 * Task2 предпочтительнее использовать внутренний клас заместо вложенного
 */

public class Task2 implements ITask2 {

    @Override
    public void printClassName() {
        System.out.println("Task2");
    }

    //method for return instance of the createInnerTask2
    public InnerTask2 createInnerTask2() {
        return new InnerTask2();
    }

    /**
     * Task3
     *
     * @return
     */
    public ITask2 createLocalCalssForTask3() {

        class LocalClassTask3 implements ITask2 {

            @Override
            public void printClassName() {
                System.out.println("LocalClassTask3");
            }
        }
        return new LocalClassTask3();
    }

    /**
     * Task4 with interface
     *
     * @return
     */
    public ITask2 createAnonymusCalssForTask4() {

        //realisation of the method from the interface
        return () -> {
            System.out.println("createAnonymusCalssForTask4");
        };
    }

    /**
     * Task4 with class
     *
     * @return
     */
    public ClassForTask4 createAnonymusCalssForTask4withClass() {

        return new ClassForTask4() {
            @Override
            public void printClassName() {
                System.out.println("Anonymous class int the ClassForTask4");
            }
        };
    }

    private class InnerTask2 implements ITask2 {

        @Override
        public void printClassName() {
            System.out.println("InnerTask2");
        }
    }
}
