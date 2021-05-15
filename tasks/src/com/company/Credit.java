package com.company;

public class Credit {
    private String id;
    private double sum;
    private double percentage;
    private static double totalSum;
    private static double count;

    public Credit() {
        count++;
    }

    public Credit(String id, double sum, double percentage) {
        this.id = id;
        this.sum = sum;
        this.percentage = percentage;
        count++;
        totalSum += sum;
    }

    public static double average() {
        double avg;
        avg = totalSum/count;
        return avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        totalSum += sum;
        this.sum = sum;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Credit.totalSum = totalSum;
    }

    public static double getCount() {
        return count;
    }

    public static void setCount(double count) {
        Credit.count = count;
    }
}
