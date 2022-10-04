public class Stack<T> {
    private T[] array;
    private int index;
    private int length;

    public Stack(int len) {
        this.index = 0;
        this.length = len;
        this.array = (T[]) new Object[len];
    }

    public int size() {
        return this.index;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void push(T value) {
        if (this.size() < this.length)
            this.array[index++] = value;
        else {
            System.out.println("Переполнен");
        }
    }

    public T peek() {
        if (this.size() > 0)
            return this.array[index - 1];
        else {
            System.out.println("Стек пуст");
            return null;
        }
    }

    public T pop() {
        if (this.size() > 0)
            return this.array[--index];
        else {
            System.out.println("Стек пуст");
            return null;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(3);
        stack.push(7);
        stack.push(5);
        System.out.println(stack.pop());
    }
}