package Task9;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jack on 02.12.2016.
 */
public class LindedNodeUtils implements ILinkedNodeUtils {


    @Override
    public LinkedNode removeDuplicates(LinkedNode head) {

        if (null == head) {
            return null;
        }

        if (null == head.getNext()) {
            return head;
        }

        LinkedNode newHead = null;
        LinkedNode current = null;

        LinkedNode nextLoopElement = null;
        Set<LinkedNode> filterSet = new HashSet<>();

        while (null != head) {

            nextLoopElement = head.getNext();
            filterSet.add(head);

            head = nextLoopElement;
        }


        return newHead;
    }

    @Override
    public LinkedNode removeDuplicates2(LinkedNode head) {

        if (null == head) {
            return null;
        }

        if (null == head.getNext()) {
            return head;
        }

        LinkedNode newHead = null;

        if (head.getValue().equals(head.getNext())) {
            newHead = head.getNext();
        }


        return removeDuplicates2(newHead);

    }

    @Override
    public LinkedNode removeDuplicates3(LinkedNode head) {

        if (null == head) {
            return null;
        }

        if (null == head.getNext()) {
            return head;
        }

        LinkedNode newHead = null;
        LinkedNode current = null;

        LinkedNode nextLoopElement = null;


        while (null != head) {

            current = head;

            while (null != head) {

                if (head == current) {
                    newHead = head.getNext();
                    newHead.setNext(head.getNext().getNext());
                }

            }


            head = head.getNext();
        }


        return newHead;
    }

    public LinkedNode createNodeR(Object... mas) {

        if (mas.length == 0) return null;
        // if mas consist of more then 1 Object we create new Array for the next operations
        Object[] masReduced = new Object[mas.length - 1];
        // copy source Array from position 1 to the created Array on first position and created Array length
        System.arraycopy(mas, 1, masReduced, 0, masReduced.length);
        // call recursion with reduced Array
        return new LinkedNode(mas[0], createNodeR(masReduced));
    }

    public String toStringLinkedNode(LinkedNode head) {

        StringBuilder sb = new StringBuilder();
        LinkedNode lastPointer = head;

        while (lastPointer != null) {
            sb.append(lastPointer.getValue() + "->");
            lastPointer = lastPointer.getNext();
        }
        sb.append(" null");
        return sb.toString();
    }

}