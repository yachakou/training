package training.algorithms.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArray {

    public static void main(String[] args) {

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sortUsingComparable(Product[] products) {
        Arrays.sort(products);
    }

    public static void sortUsingComparator(Employee[] employees) {
        Arrays.sort(employees, Comparator.comparingInt(c -> c.seniority));
    }

    public static class Product implements Comparable<Product> {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public int compareTo(Product o) {
            if (this.price == o.price) {
                return 0;
            } else if (this.price < o.price) {
                return -1;
            }
            return 1;
        }
    }

    public static class Employee {
        String name;
        int seniority;

        public Employee(String name, int seniority) {
            this.name = name;
            this.seniority = seniority;
        }
    }
}
