package Day10;

class NodeCount {
    int data;
    NodeCount next;

    NodeCount(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountNodes {
    NodeCount head;

    public void insert(int data) {
        NodeCount newNode = new NodeCount(data);

        if (head == null) {
            head = newNode;
            return;
        }

        NodeCount temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public int count() {
        int count = 0;
        NodeCount temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public void display() {
        NodeCount temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        CountNodes list = new CountNodes();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();

        System.out.println("Number of nodes: " + list.count());
    }
}