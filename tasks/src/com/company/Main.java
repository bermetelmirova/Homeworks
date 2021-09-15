package com.company;

public class Main {

    public static void main(String[] args) {
        Teams firstTeam = new Teams("Barcelona");
        firstTeam.start();
        statics(firstTeam);

        Teams secondTeam = new Teams("Real Madrid");
        secondTeam.start();
        statics(secondTeam);
    }
    static void statics(Teams Team){
        System.out.println("Команда: " + Team.getTeamName());
        System.out.println("Кол-в забитых мячей:" + Team.getBallCount());
        System.out.println("Кол-в желтых карточек:" + Team.getYellowCards());
        System.out.println("Кол-в офсайдов :" + Team.getOffsideCount());

        System.out.println();
    }
}
