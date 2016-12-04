package Task9;

/**
 * Task Collections. ConsoleTest.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 02.12.2016.
 */
public class ConsoleTest {

    public static void main(String[] args) {

        User user = new User("Vasa1");
        User user2 = new User("Peta2");
        User user3 = new User("Kolya3");

        IMyLinkedNodeUtils linkedNodeUtils = new MyMyLinkedNodeUtils();
        MyLinkedNode<User> myLinkedNode = linkedNodeUtils.createNodeR(user, user2, user3, user2, user2, user3, user3);
        //MyLinkedNode<User> myLinkedNode = linkedNodeUtils.createNodeR(user, user, user, user, user, user, user);

        System.out.println(linkedNodeUtils.toStringMyLinkedNodeWithRecursion(myLinkedNode));

        MyLinkedNode<User> myLinkedNodeAfter = linkedNodeUtils.removeDuplicates(myLinkedNode);////newHead

        System.out.println(linkedNodeUtils.toStringMyLinkedNodeWithRecursion(myLinkedNode));//modified head
        System.out.println(linkedNodeUtils.toStringMyLinkedNodeWithRecursion(myLinkedNodeAfter));//newHead



    }

}

