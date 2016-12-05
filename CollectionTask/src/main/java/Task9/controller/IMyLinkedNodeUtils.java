package Task9.controller;

import Task9.model.MyLinkedNode;

/**
 * Task Collections. IMyLinkedNodeUtils.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 02.12.2016.
 */
public interface IMyLinkedNodeUtils<E> {

    MyLinkedNode<E> removeDuplicates (MyLinkedNode<E> head);

    MyLinkedNode<E> removeDuplicates2 (MyLinkedNode<E> head);

    MyLinkedNode<E> removeDuplicates3 (MyLinkedNode<E> head);

    MyLinkedNode<E> createNodeR(E... elements);

    String toStringMyLinkedNode(MyLinkedNode<E> head);

    String toStringMyLinkedNodeWithRecursion(MyLinkedNode<E> head);


}
