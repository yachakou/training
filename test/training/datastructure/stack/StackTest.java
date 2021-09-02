package training.datastructure.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackTest {


    @Test
    public void stackTest() {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        Assertions.assertEquals(3, integerStack.size());
        integerStack.print();
        Integer val1 = popElementANdPrint(integerStack);
        Assertions.assertEquals(30, val1);
        integerStack.print();
        Integer val2 = popElementANdPrint(integerStack);
        Assertions.assertEquals(20, val2);
        integerStack.print();
        Integer val3 = popElementANdPrint(integerStack);
        Assertions.assertEquals(10, val3);
        integerStack.print();

    }

    private Integer popElementANdPrint(Stack<Integer> integerStack) {
        Integer integer = integerStack.pop();
        System.out.println("Pop value is : " + integer);
        return integer;
    }
}