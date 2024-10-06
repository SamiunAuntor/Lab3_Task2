public class Main {

    public static void main(String[] args) {

        MinStack stack = new MinStack();

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        System.out.println("Min: " + stack.getMin());

        stack.pop();
        System.out.println("Min: " + stack.getMin());
    }
}
