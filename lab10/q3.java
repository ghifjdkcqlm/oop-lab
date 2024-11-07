// Generic Node Class
class Node<T> {
    T data;
    Node<T> next;
    Node(T data) { this.data = data; }
}

// Generic Singly Linked List
class GenericList<T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Demonstration
public class GenericListDemo {
    public static void main(String[] args) {
        // Using GenericList with Integer
        GenericList<Integer> intList = new GenericList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.print("Integer List: ");
        intList.display();

        // Using GenericList with Double
        GenericList<Double> doubleList = new GenericList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        System.out.print("Double List: ");
        doubleList.display();
    }
}
