package com.company;

public class Main {

    public static void main(String[] args) {
        Factorial factorial = (x) ->{
            int y = 1;
            for (int i = 2; i <= x; i++) {
                y *= i;
            }
            return y;
        };
        Calculation sqrt =(x, y) -> {
            for (int i = 0; i < y/2; i++) {
                if(Math.pow(i, x) == y)
                    return i;
            }
            return 0;
        };
        System.out.println(sqrt.operation(4, 81) == 0 ? "Нет корня!": sqrt.operation(4, 81));
        System.out.println(factorial.factorial(5));
    }
}
