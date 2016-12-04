package Task9;

/**
 * Created by Jack on 02.12.2016.
 */
public class ConsoleTest {

    public static void main(String[] args) {

        User user = new User("Vasa1");
        User user2 = new User("Peta2");
        User user3 = new User("Kolya3");

        ILinkedNodeUtils linkedNodeUtils = new LindedNodeUtils();
        linkedNodeUtils.createNodeR(user, user2, user3);




    }

}

