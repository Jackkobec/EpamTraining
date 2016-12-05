import Task9.controller.IMyLinkedNodeUtils;
import Task9.controller.MyMyLinkedNodeUtils;
import Task9.model.MyLinkedNode;
import Task9.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

        expected = iMyLinkedNodeUtils.createNodeR(user, user2, user3);
        expectedOne = iMyLinkedNodeUtils.createNodeR(user);

        nodeWithDuplicates = iMyLinkedNodeUtils.createNodeR(user, user2, user3, user, user2, user3, user, user2);
        nodeWithDuplicatesOneEl = iMyLinkedNodeUtils.createNodeR(user, user, user, user, user, user, user);
    }

    @Test
    public void testRemoveDuplicates() {

        iMyLinkedNodeUtils.removeDuplicatesWithSetHelp(nodeWithDuplicates);
        iMyLinkedNodeUtils.removeDuplicatesWithSetHelp(nodeWithDuplicatesOneEl);

        Assert.assertEquals(expected, nodeWithDuplicates);
        Assert.assertEquals(expectedOne, nodeWithDuplicatesOneEl);
    }

    @Test
    public void testRemoveDuplicates2() {

        iMyLinkedNodeUtils.removeDuplicatesWithMapHelp(nodeWithDuplicates);
        iMyLinkedNodeUtils.removeDuplicatesWithMapHelp(nodeWithDuplicatesOneEl);

        Assert.assertEquals(expected, nodeWithDuplicates);
        Assert.assertEquals(expectedOne, nodeWithDuplicatesOneEl);
    }

    @Test
    public void testRemoveDuplicates3() {

        iMyLinkedNodeUtils.removeDuplicatesWith2Loops(nodeWithDuplicates);
        iMyLinkedNodeUtils.removeDuplicatesWith2Loops(nodeWithDuplicatesOneEl);

        Assert.assertEquals(expected, nodeWithDuplicates);
        Assert.assertEquals(expectedOne, nodeWithDuplicatesOneEl);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test()
    public void testForNullInput() {

        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("head = null");

        iMyLinkedNodeUtils.removeDuplicatesWithSetHelp(null);
        iMyLinkedNodeUtils.removeDuplicatesWithMapHelp(null);
        iMyLinkedNodeUtils.removeDuplicatesWith2Loops(null);
    }
}
