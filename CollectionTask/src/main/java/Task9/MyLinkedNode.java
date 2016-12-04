package Task9;

/**
 * Task Collections. MyLinkedNode.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 02.12.2016.
 */
public class MyLinkedNode<E> {

    private E value;

    private MyLinkedNode<E> next;

    public MyLinkedNode() {
    }

    public MyLinkedNode(E value, MyLinkedNode<E> next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public MyLinkedNode<E> getNext() {
        return next;
    }

    public void setNext(MyLinkedNode<E> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyLinkedNode<?> that = (MyLinkedNode<?>) o;

        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        return next != null ? next.equals(that.next) : that.next == null;

    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MyLinkedNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
