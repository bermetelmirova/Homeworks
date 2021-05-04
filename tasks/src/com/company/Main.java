package com.company;

public class Main {

    public static void main(String[] args) {
        Display display = new Display(15.6, "USA", "Slim");
        HardDrive hardDrive = new HardDrive(500, 2);
        RAM ram = new RAM(8, "Intel");
        UsbPort[] usbPort = new UsbPort[3];
        String portID = "12X09";
        String portType = "0.2";
        for (int i = 0; i < usbPort.length; i++) {
            if (i % 2 == 0) portType = "0.3";
            else portType = "0.2;";
            usbPort[i] = new UsbPort(portType, portID);
            portID = portID + i;
        }
        Keyboard keyboard = new Keyboard(false, true);
        Computer computer = new Computer(display, "Lenovo", "Grey", hardDrive, ram, "gtx1050", usbPort, keyboard);
        System.out.printf(" Бренд: %s\n Цвет: %s\n",computer.getBrand(),computer.getColor() );
        System.out.printf(" Диоганаль: %s\n Производитель: %s\n Тип матрицы: %s\n",display.getDiagonal(), display.getProducer(), display.getTypeOfMatrix());
        System.out.printf(" Кол-во чвстей дисков: %s\n Объем памяти: %s гб\n", hardDrive.getAmountOfDrives(), hardDrive.getMemoryCapacity());
        System.out.printf(" Производитель(ОП): %s\n Объем памяти(ОП): %s гб\n", ram.getProducer(), ram.getVolume());
        System.out.println("USB Порты:");
        for (int i = 0; i < usbPort.length; i++) {
            System.out.printf(" ID порта:%s\n Тип порта: %s\n", usbPort[i].getPortID(),usbPort[i].getPortType());
        }
        if(keyboard.isAdditionalFigures())
            System.out.println(" С доп. цифрами справа");
        else System.out.println(" Без доп. цифр справа");
        if(keyboard.isBackLighting())
            System.out.println(" С подсветкой");
        else System.out.println(" Без подсветки");

    }

    }
