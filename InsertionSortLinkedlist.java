class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class InsertionSortLinkedlist {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    void sort() {
        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            if (sorted == null || current.data < sorted.data) {
                current.next = sorted;
                sorted = current;
            } else {
                Node temp = sorted;

                while (temp.next != null && temp.next.data < current.data) {
                    temp = temp.next;
                }

                current.next = temp.next;
                temp.next = current;
            }

            current = next;
        }

        head = sorted;
    }

    public static void main(String[] args) {
       InsertionSortLinkedlist list = new InsertionSortLinkedlist();

        list.insert(4);
        list.insert(2);
        list.insert(5);
        list.insert(1);

        System.out.println("Before Sorting:");
        list.display();

        list.sort();

        System.out.println("After Sorting:");
        list.display();
    }
}