public class MyQueue<T> {
    private T[] array;
    private int start;
    private int end;
    private int length;

    public MyQueue(int len) {
        this.start = len - 1;
        this.end = len - 1;
        this.length = len;
        this.array = (T[]) new Object[len];
    }

    public int size() {
        return end - start;
    }

    public boolean isEmpty() {
        return end - start == 0;
    }

    public void push(T value) {
        if (end - start < length - 1) {
            array[start--] = value;
            if (start < 10) control();
        } else {
            System.out.println("Очередь переполнена");
        }
    }

    public T peek() {
        if (this.size() > 0)
            return this.array[end];
        else {
            System.out.println("Очередь пуста");
            return null;
        }
    }

    public T pop() {
        if (this.size() > 0) {
            return this.array[this.end--];
        } else {
            System.out.println("Очередь пуста");
            return null;
        }
    }

    private void control() {
        int count = this.length - 1;
        for (int i = this.end; i >= start; i--) {
            this.array[count--] = this.array[i];
        }
        this.end = length - 1;
        this.start = count + 1;
    }

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>(10);
        myQueue.push(5);
        myQueue.push(7);
        myQueue.push(6);
        System.out.println(myQueue.pop());
        }
    }
