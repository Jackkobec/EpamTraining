package Task9;

/**
 * Created by Jack on 02.12.2016.
 */
public class LinkedNode {

    private Object value;

    private LinkedNode next;

    public LinkedNode() {
    }

    public LinkedNode(Object value, LinkedNode next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkedNode that = (LinkedNode) o;

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
        return "LinkedNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
