package tasks;

/**
 * Created by Jack on 30.11.2016.
 */
public class ExceptionsTask4 {

    public int generateStackOverflowError(int k) {

        k += 7;

        return generateStackOverflowError(k);
    }

    public String[][] generateOutOfMemoryError() {

        String[][] strings = new String[0xffffff][0xffffff];

        return strings;
    }

    public static void main(String[] args) {

        // call StackOverflowError
        //System.out.println(new tasks.ExceptionsTask4().generateStackOverFlowException(7));

        //call OutOfMemoryError
        new ExceptionsTask4().generateOutOfMemoryError();

    }
}
