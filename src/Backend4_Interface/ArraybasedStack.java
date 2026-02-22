package Backend4_Interface;

public class ArraybasedStack implements Stack {
    @Override
    public void push(int x) {
        System.out.println("push");
    }

    @Override
    public void pop() {
    System.out.println("pop");
    }
}
