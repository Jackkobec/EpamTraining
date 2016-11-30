package tasks;

import model.User;

/**
 * Created by Jack on 30.11.2016.
 */
public class ExceptionsTask2 {

    public static void methodForThrowsException(User user) throws NullPointerException {

        user = null;
        user.getName();
    }

    public void methodWhereCatchException() {

        try {

            methodForThrowsException(new User("Vasa"));

        } catch (NullPointerException e) {

            System.out.println("Catch NullPointerException in the another method.");
        } finally {

            System.out.println("Executing finally after exception catching.");
        }
    }

    public static void main(String[] args) {

        new ExceptionsTask2().methodWhereCatchException();
    }
}
