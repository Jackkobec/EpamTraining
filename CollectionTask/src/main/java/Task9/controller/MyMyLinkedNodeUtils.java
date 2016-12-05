package Task9.controller;

import Task9.model.MyLinkedNode;

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
     * removeDuplicatesWithSetHelp with set
     *
     * @param head
     * @return
     */
    @Override
    public void removeDuplicatesWithSetHelp(MyLinkedNode<E> head) {

        if (null == head) {
            throw new NullPointerException("head = null");
        }

        Set<E> filterSet = new HashSet();//Create a HashSet for search duplicates
        MyLinkedNode<E> newHead = head;

        while (null != head) {

            if (filterSet.add(head.getValue())) {//if current add to set - it is unique
                newHead = head;
            } else {
                newHead.setNext(head.getNext());//if don't add to set - it is a duplicate and we jump it with setNext(head.getNext()
            }

            head = head.getNext();//for next loop step
        }
    }


    /**
     * removeDuplicatesWithMapHelp with map(Hashtable)
     *
     * @param head
     * @return
     */
    @Override
    public void removeDuplicatesWithMapHelp(MyLinkedNode<E> head) {

        if (null == head) {
            throw new NullPointerException("head = null");
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
    }

    /**
     * removeDuplicatesWith2Loops with 2 loops
     *
     * @param head
     * @return
     */
    @Override
    public void removeDuplicatesWith2Loops(MyLinkedNode<E> head) {

        if (null == head) {
            throw new NullPointerException("head = null");
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