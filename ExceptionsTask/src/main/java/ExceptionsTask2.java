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

            System.out.println("Перехват NullPointerException в другом методе.");
        } finally {

            System.out.println("Выполнение finally после перехвата исключения.");
        }
    }

    public static void main(String[] args) {

        new ExceptionsTask2().methodWhereCatchException();
    }
}
