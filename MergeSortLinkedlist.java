class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class MergeSortLinkedlist {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static Node merge(Node l1, Node l2) {
        Node head = null;
        Node tail = null;

        while (l1 != null && l2 != null) {
            Node temp;

            if (l1.data <= l2.data) {
                temp = l1;
                l1 = l1.next;
            } else {
                temp = l2;
                l2 = l2.next;
            }

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        if (l1 != null) {
            tail.next = l1;
        } else if (l2 != null) {
            tail.next = l2;
        }

        return head;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node l1 = null;
        Node l2 = null;

        l1 = insert(l1, 1);
        l1 = insert(l1, 2);
        l1 = insert(l1, 4);

        l2 = insert(l2, 1);
        l2 = insert(l2, 3);
        l2 = insert(l2, 4);

        System.out.println("List 1:");
        display(l1);

        System.out.println("List 2:");
        display(l2);

        Node result = merge(l1, l2);

        System.out.println("Merged List:");
        display(result);
    }
}