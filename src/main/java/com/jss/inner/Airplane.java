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

    private String someField = "External field";

    public void printExternalName() {

        System.out.println(this.getClass().getName());
    }

    private class AirplaneEngine implements IEngine {


        public void callExternalFromInner() {

            //call field External class through External class instance
            System.out.println(new Airplane().someField);
            //call field External class directly
            System.out.println(someField);
            //call method from External class
            new Airplane().printExternalName();


        }

        //method of the AirplaneEngine
        @Override
        public void printEngine() {
            System.out.println("Overrided method int the AirplaneEngine");
        }

        public class Engine implements IEngine {
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

    public void callInnerFtromExternal() {

        //Call inner from external
        //Airplane airplane = new Airplane();
        Airplane.AirplaneEngine airplaneEngine = new Airplane().new AirplaneEngine();

        //call inner.inner
        Airplane.AirplaneEngine.Engine engine = airplaneEngine.new Engine();
        Airplane.AirplaneEngine.Engine2 engine2 = airplaneEngine.new Engine2();

    }
}








