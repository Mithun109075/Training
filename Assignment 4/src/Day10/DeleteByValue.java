package Day10;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteByValue {
    ListNode head;

    public void insert(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void delete(int key) {
        if (head != null && head.data == key) {
            head = head.next;
            return;
        }

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        prev.next = temp.next;
    }

    public void display() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DeleteByValue list = new DeleteByValue();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Before deletion: ");
        list.display();

        list.delete(20);

        System.out.print("After deletion: ");
        list.display();
    }
}