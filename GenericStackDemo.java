import java.util.ArrayList;
import java.util.Scanner;

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    // Push operation
    public void push(T item) {
        list.add(item);
        System.out.println(item + " pushed to stack");
    }

    // Pop operation
    public T pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    // Display stack
    public void display() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements: " + list);
        }
    }
}

// Main class
public class GenericStackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int choice;

        do {
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    Integer popped = stack.pop();
                    if (popped != null) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}