package Task9.view;

import Task9.controller.IMyLinkedNodeUtils;
import Task9.controller.MyMyLinkedNodeUtils;
import Task9.model.MyLinkedNode;
import Task9.model.User;

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

        /*MyLinkedNode<User> myLinkedNodeAfter = */linkedNodeUtils.removeDuplicatesWithSetHelp(myLinkedNode);////newHead

        System.out.println(linkedNodeUtils.toStringMyLinkedNodeWithRecursion(myLinkedNode));//modified head(myLinkedNode)
        //System.out.println(linkedNodeUtils.toStringMyLinkedNodeWithRecursion(myLinkedNodeAfter));//newHead



    }

}

