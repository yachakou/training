package training.algorithms.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortingArrayTest {

    @Test
    public void sortUsingComparable() {
        SortingArray.Product apple = new SortingArray.Product("Apple", 1);
        SortingArray.Product banana = new SortingArray.Product("Banana", 5);
        SortingArray.Product orange = new SortingArray.Product("Orange", 2);


        SortingArray.Product[] products = {banana, orange, apple};
        SortingArray.sortUsingComparable(products);

        Assertions.assertEquals(products[0].name, "Apple");
        Assertions.assertEquals(products[1].name, "Orange");
        Assertions.assertEquals(products[2].name, "Banana");
    }

    @Test
    public void sortUsingArrays() {
        int[] input = {5, 98, -2, 5, 4};
        SortingArray.sort(input);

        Assertions.assertArrayEquals(input, new int[]{-2, 4, 5, 5, 98});
    }

    @Test
    public void sortUsingComparator() {
        SortingArray.Employee emp1= new SortingArray.Employee("Kei", 5);
        SortingArray.Employee emp2 = new SortingArray.Employee("Nagai", 10);
        SortingArray.Employee emp3 = new SortingArray.Employee("Nakano", 2);


        SortingArray.Employee[] employees = {emp1, emp2, emp3};

        SortingArray.sortUsingComparator(employees);

        Assertions.assertEquals(employees[0].name, "Nakano");
        Assertions.assertEquals(employees[1].name, "Kei");
        Assertions.assertEquals(employees[2].name, "Nagai");
    }
}