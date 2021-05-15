package com.company;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit("st4578", 20000, 10.0);
        Credit credit2 = new Credit("gh4893", 25360, 5.0);
        Credit credit3 = new Credit("fr4589", 15800, 15.0);
        Credit credit4 = new Credit("nm1238", 5000, 6.0);
        Credit credit5 = new Credit("eb4789", 200000, 8.0);
        System.out.println("Кол-во кредитов: " + Credit.getCount());
        System.out.println("Общая сумма выданных кредитов: " + Credit.getTotalSum());
        System.out.println("Средняя сумма кредитов: " + Credit.average());
    }
}
