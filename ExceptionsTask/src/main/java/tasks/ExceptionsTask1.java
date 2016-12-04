package tasks;

/**
 * Task Exceptions. ExceptionsTask1.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 30.11.2016.
 */
public class ExceptionsTask1 {

    public void forNulPointerException(String string) {

        //some actions
    }

    public static void main(String[] args) {

        String test = "test";
        ExceptionsTask1 exceptionsTask1 = null;

        try {

            exceptionsTask1.forNulPointerException(test);

        } catch (NullPointerException e) {

            System.out.println("NullPointerException - unchecked, call through the  null - link.");
        }
    }
}
