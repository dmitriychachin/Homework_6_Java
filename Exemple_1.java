package Homework_6;

import java.util.Scanner;

public class Exemple_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        notebookConstructor(iScanner);

        iScanner.close();
    }
    
    public static int random(){
        int x = 0;
        while(x % 1024 != 0){
            x = (int) (Math.random() * x);
        }
        
        return x;
        
    }

    public static String mainMemoryType(Scanner iScanner){
        System.out.println("Выберите тип памяти.(1 - DDR3, 2 - DDR4, 3 - DDR5)");
        int x = scannerInt(iScanner);
        String a = "";
        switch (x) {
            case 1:
                a = "DDR3";
                break;
            case 2:
                a = "DDR4";
                break;
            case 3:
                a = "DDR5";
                break;
            default:
                a = "DDR4";
                System.out.println("Мы установили память DDR4");
                break;
        }
        return a;
    }

    public static int scannerInt (Scanner iScanner) {
        int x = iScanner.nextInt();

        return x;
    }

    public static String staticMemoryType(Scanner iScanner){
        System.out.println("Выберите тип памяти.(1 - HDD, 2 - SSD)");
        int x = scannerInt(iScanner);
        String a = "";
        switch (x) {
            case 1:
                a = "HDD";
                break;
            case 2:
                a = "SSD";
                break;

            default:
                a = "HDD";
                System.out.println("Мы установили память HDD");
                break;
        }
        return a;
    }

    public static String operatingSystemType(Scanner iScanner){
        System.out.println("Выберите тип операционной системы.(1 - Windows OS, 2 - Linux OS, 3 - macOS)");
        int x = scannerInt(iScanner);
        String a = "";
        switch (x) {
            case 1:
                a = "Windows";
                break;
            case 2:
                a = "Linux";
                break;
            case 3:
                a = "macOS";
                break;
            default:
                a = "Windows";
                System.out.println("Мы установили Windows OS");
                break;
        }
        return a;
    }

    public static double OSversion(Scanner iScanner){
        double x = 0;
        while(x > 20){
            x = (Double) (Math.random() * x);
        }
        
        return x;
    }

    public static String screenType(Scanner iScanner){
        System.out.println("Выберите тип матрицы.(1 - IPS, 2 - OLED)");
        int x = scannerInt(iScanner);
        String a = "";
        switch (x) {
            case 1:
                a = "IPS";
                break;
            case 2:
                a = "OLED";
                break;

            default:
                a = "IPS";
                System.out.println("Мы установили матрицу IPS");
                break;
        }
        return a;
    }

    public static String scannerStr (String message,Scanner iScanner) {
        System.out.println(message);
        String str = null;
        do{
        str = iScanner.nextLine();
        }while(str.isEmpty());


        return str;
    }

    public static void notebookConstructor(Scanner iScanner){
        NoteBook name = new NoteBook();
        name.volume_main_memory = random();
        name.type_main_memory = mainMemoryType(iScanner);
        name.volume_static_memory = random();
        name.type_static_memory = staticMemoryType(iScanner);
        name.type_operating_system = operatingSystemType(iScanner);
        name.version_operating_system = OSversion(iScanner);
        name.size_screen = OSversion(iScanner);
        name.type_screen = screenType(iScanner);
    }

}
