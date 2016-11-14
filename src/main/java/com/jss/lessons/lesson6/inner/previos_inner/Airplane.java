package com.jss.lessons.lesson6.inner.previos_inner;

/**
 * Created by Jack on 09.11.2016.
 */

/**
 * Task 1
 * Можно. private имеет смысл делать, если нужно сокрытие кода
 */
public class Airplane {

    private class AirplaneEngine implements IEngine {

        //method of the AirplaneEngine
        @Override
        public void printEngine() {
            System.out.println("Overrided method int the AirplaneEngine");
        }

        private class Engine implements IEngine {
            //method of the Engine
            @Override
            public void printEngine() {
                System.out.println("Airplane > AirplaneEngine > Engine");
            }
        }

        private class Engine2 implements IEngine {
            //method of the Engine2
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








