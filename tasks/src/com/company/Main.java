package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RouteStrategy walking = new WalkingStrategy();
        RouteStrategy driving = new RoadStrategy();
        RouteStrategy bus = new PublicTransportStrategy();

        Navigator navigator = new Navigator();
        int choice = 0;
        while (choice < 3) {
            System.out.println("1.Walking\n2.Car road\n3.Public transport");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    navigator.setRouteStrategy(walking);
                    navigator.buildRoute();
                    break;
                case 2:
                    navigator.setRouteStrategy(driving);
                    navigator.buildRoute();
                    break;
                case 3:
                    navigator.setRouteStrategy(bus);
                    navigator.buildRoute();
                    break;
            }
        }

    }
}
