import Task9.IMyLinkedNodeUtils;
import Task9.MyLinkedNode;
import Task9.MyMyLinkedNodeUtils;
import Task9.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Task Collections. TestRemoveDuplicates.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 02.12.2016.
 */
public class TestRemoveDuplicates {

    private IMyLinkedNodeUtils iMyLinkedNodeUtils = new MyMyLinkedNodeUtils();

    private MyLinkedNode<User> expected;
    private MyLinkedNode<User> expectedOne;

    private MyLinkedNode<User> nodeWithDuplicates;
    private MyLinkedNode<User> nodeWithDuplicatesOneEl;

    @Before
    public void initTestNodes() {

        User user = new User("Vasa1");
        User user2 = new User("Peta2");
        User user3 = new User("Kolya3");

        MyLinkedNode<User> expected = iMyLinkedNodeUtils.createNodeR(user, user2, user3);
        MyLinkedNode<User> expectedOne = iMyLinkedNodeUtils.createNodeR(user);

        MyLinkedNode<User> nodeWithDuplicates = iMyLinkedNodeUtils.createNodeR(user, user2, user3, user, user2, user3, user, user2);
        MyLinkedNode<User> nodeWithDuplicatesOneEl = iMyLinkedNodeUtils.createNodeR(user, user, user, user, user, user, user);
    }

    @Test
    public void testRemoveDuplicates() {

        Assert.assertEquals(expected, iMyLinkedNodeUtils.removeDuplicates(nodeWithDuplicates));
        Assert.assertEquals(expectedOne, iMyLinkedNodeUtils.removeDuplicates(nodeWithDuplicatesOneEl));
    }

    @Test
    public void testRemoveDuplicates2() {

        Assert.assertEquals(expected, iMyLinkedNodeUtils.removeDuplicates2(nodeWithDuplicates));
        Assert.assertEquals(expectedOne, iMyLinkedNodeUtils.removeDuplicates2(nodeWithDuplicatesOneEl));
    }

    @Test
    public void testRemoveDuplicates3() {

        Assert.assertEquals(expected, iMyLinkedNodeUtils.removeDuplicates3(nodeWithDuplicates));
        Assert.assertEquals(expectedOne, iMyLinkedNodeUtils.removeDuplicates3(nodeWithDuplicatesOneEl));
    }

    @Test
    public void testForNullInput() {

        Assert.assertEquals(null, iMyLinkedNodeUtils.removeDuplicates(null));
        Assert.assertEquals(null, iMyLinkedNodeUtils.removeDuplicates2(null));
        Assert.assertEquals(null, iMyLinkedNodeUtils.removeDuplicates3(null));
    }
}
