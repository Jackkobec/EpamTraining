package com.jss.inner;

/**
 * Created by Jack on 09.11.2016.
 */

/**
 * Create class Airplane with several engines
 * Engined like a previos_inner classes.
 * <p>
 * Inner. Task1
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 12.11.2016.
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








