package Day10;
import java.util.Stack;

public class ReverseStack {

    // Insert element at bottom
    public static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        insertAtBottom(st, x);
        st.push(temp);
    }

    // Reverse stack using recursion
    public static void reverse(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int temp = st.pop();
            reverse(st);
            insertAtBottom(st, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Original Stack: " + st);

        reverse(st);

        System.out.println("Reversed Stack: " + st);
    }
}