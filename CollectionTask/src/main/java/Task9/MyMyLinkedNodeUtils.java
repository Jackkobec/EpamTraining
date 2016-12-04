package Task9;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Task Collections. MyMyLinkedNodeUtils.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 02.12.2016.
 */
public class MyMyLinkedNodeUtils<E> implements IMyLinkedNodeUtils<E> {


    /**
     * removeDuplicates with set
     *
     * @param head
     * @return
     */
    @Override
    public MyLinkedNode<E> removeDuplicates(MyLinkedNode<E> head) {

        if (null == head) {
            return null;
        }

        if (null == head.getNext()) {
            return head;
        }

        Set<E> filterSet = new HashSet();//Create a HashSet for search duplicates
        //MyLinkedNode<E> newHead = null;
        MyLinkedNode<E> newHead = head;

        while (null != head) {

            if (filterSet.add(head.getValue())) {//if current add to set - it is unique
                newHead = head;
            } else {
                newHead.setNext(head.getNext());//if don't add to set - it is a duplicate and we jump it with setNext(head.getNext()
            }

            head = head.getNext();//for next loop step
        }

        return newHead;
    }

    /**
     * removeDuplicates2 with map(Hashtable)
     *
     * @param head
     * @return
     */
    @Override
    public MyLinkedNode<E> removeDuplicates2(MyLinkedNode<E> head) {

        if (null == head) {
            return null;
        }

        if (null == head.getNext()) {
            return head;
        }

        Map<E, Boolean> myHashTable = new Hashtable();//Create a HashTable for search duplicates
        MyLinkedNode<E> newHead = null;

        while (null != head) {

            if (myHashTable.containsKey(head.getValue())) {
                newHead.setNext(head.getNext());
            } else {
                myHashTable.put(head.getValue(), true);
                newHead = head;
            }

            head = head.getNext();//for next loop step
        }

        return newHead;
    }

    /**
     * removeDuplicates3 with 2 loops
     *
     * @param head
     * @return
     */
    @Override
    public MyLinkedNode<E> removeDuplicates3(MyLinkedNode<E> head) {

        if (null == head) {
            return null;
        }

        if (null == head.getNext()) {
            return head;
        }

        MyLinkedNode<E> current = head;

        while (current != null) {
            MyLinkedNode<E> innerLoopStep = current;

            while (innerLoopStep.getNext() != null) {

                if (innerLoopStep.getNext().getValue() == current.getValue()) {
                    innerLoopStep.setNext(innerLoopStep.getNext().getNext());
                } else {
                    innerLoopStep = innerLoopStep.getNext();
                }
            }

            current = current.getNext();
        }


        return current;
    }

    /**
     * Create  MyLinkedNode<E> from a few E elements.
     *
     * @param mas
     * @return
     */
    @Override
    public MyLinkedNode createNodeR(Object... mas) {

        if (mas.length == 0) return null;
        // if mas consist of more then 1 Object we create new Array for the next operations
        Object[] masReduced = new Object[mas.length - 1];
        // copy source Array from position 1 to the created Array on first position and created Array length
        System.arraycopy(mas, 1, masReduced, 0, masReduced.length);
        // call recursion with reduced Array
        return new MyLinkedNode(mas[0], createNodeR(masReduced));
    }

    /**
     * MyLinkedNode<E> toString good view
     *
     * @param head
     * @return
     */
    @Override
    public String toStringMyLinkedNode(MyLinkedNode<E> head) {

        StringBuilder sb = new StringBuilder();
        MyLinkedNode lastPointer = head;

        while (lastPointer != null) {
            sb.append(lastPointer.getValue() + "->");
            lastPointer = lastPointer.getNext();
        }
        sb.append(" null");
        return sb.toString();
    }

    /**
     * MyLinkedNode<E> toString good view
     * Recursion method.
     *
     * @param head
     * @return
     */
    @Override
    public String toStringMyLinkedNodeWithRecursion(MyLinkedNode<E> head) {

        return (null != head) ?
                (head.getValue().toString() + " -> " + toStringMyLinkedNodeWithRecursion(head.getNext())) : "null";
    }

}