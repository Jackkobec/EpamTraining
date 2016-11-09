package com.jss.lessons.lesson6.inner;

/**
 * Created by Jack on 09.11.2016.
 */

/**
 * Task 1
 * Можно. private имеет смысл делать, если нужно сокрытие кода
 */
public class Airplane {

    private class AirplaneEngine implements IEngine {


        @Override
        public void printEngine() {
            System.out.println("Overrided method int the AirplaneEngine");
        }

        private class Engine implements IEngine {

            @Override
            public void printEngine() {
                System.out.println("Airplane > AirplaneEngine > Engine");
            }
        }

        private class Engine2 implements IEngine {

            @Override
            public void printEngine() {
                System.out.println("Airplane > AirplaneEngine > Engine2");
            }
        }
    }

    public interface IEngine {
        void printEngine();
    }
}








