package genericEx;

public class MyStack {

    public static void main(String[] args) {

        GStack<String> stringGStack = new GStack<>();

        stringGStack.push("seoul");
        stringGStack.push("busan");
        stringGStack.push("LA");

        for (int n = 0; n < 3; n++) {
            System.out.println(stringGStack.pop());
        }

        GStack<Integer> integerGStack = new GStack<>();

        integerGStack.push(100);
        integerGStack.push(200);
        integerGStack.push(300);

        for (int n = 0; n < 3; n++) {
            System.out.println(integerGStack.pop());
        }
    }
}
