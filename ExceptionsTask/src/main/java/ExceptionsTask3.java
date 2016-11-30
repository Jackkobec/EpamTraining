/**
 * Created by Jack on 30.11.2016.
 */
public class ExceptionsTask3 {

    public void methodForThrowsException(User user) throws IncorrectUserException {

        if (null == user) {
            throw new IncorrectUserException("Передан неправильный user.");
        }

        user.getName();
    }

    public void methodWhereCatchException() {

        try {

            methodForThrowsException(null);//передадим null вместо user

        } catch (IncorrectUserException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Выполнение finally после перехвата исключения.");
        }
    }

    public static void main(String[] args) {

        new ExceptionsTask3().methodWhereCatchException();
    }
}
