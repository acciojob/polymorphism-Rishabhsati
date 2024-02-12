package com.driver;

public class Main {
    public Main(){}
    public static class Product{
        Product(){}
        public double product(double x, double y) {
            return x*y;
        }
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int ans1 = p.product(5, 6, 7);
        int ans2 = p.product(5, 5);
        double ans3 = p.product(5.0, 10.0);
        System.out.println(ans1 +" "+ ans2 +" "+ ans3);
    }
}