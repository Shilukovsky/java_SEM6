import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void PrintAllNouts(ArrayList<Nout> AL) {
        Stream<Nout> stream = AL.stream();
        Consumer<Nout> action = (n) -> {
            System.out.println(n.getName() + ", " + n.getRam() + ", " + n.getHd() + ", " + n.getOs() + ", " + n.getColor());
        };

        stream.forEach(action);
    }
    public static void PrintAllNoutsColor(ArrayList<Nout> AL, String color) {
        Stream<Nout> stream = AL.stream();
        Predicate<Nout> predicate = (nout) -> {
            if (nout.getColor() == color)
              return true;
            return false;
        };
        Stream<Nout> filterStream = stream.filter(predicate);
        Consumer<Nout> action = (n) -> {
            System.out.println(n.getName() + ", " + n.getRam() + ", " + n.getHd() + ", " + n.getOs() + ", " + n.getColor());
        };
        filterStream.forEach(action);
    }
    public static void PrintAllNoutsRam(ArrayList<Nout> AL, int ram) {
        Stream<Nout> stream = AL.stream();
        Predicate<Nout> predicate = (nout) -> {
            if (nout.getRam() >= ram)
              return true;
            return false;
        };
        Stream<Nout> filterStream = stream.filter(predicate);
        Consumer<Nout> action = (n) -> {
            System.out.println(n.getName() + ", " + n.getRam() + ", " + n.getHd() + ", " + n.getOs() + ", " + n.getColor());
            };
        filterStream.forEach(action);    
    }
    public static void PrintAllNoutsHd(ArrayList<Nout> AL, int hd) {
        Stream<Nout> stream = AL.stream();
        Predicate<Nout> predicate = (nout) -> {
            if (nout.getHd() >= hd)
              return true;
            return false;
        };
        Stream<Nout> filterStream = stream.filter(predicate);
        Consumer<Nout> action = (n) -> {
            System.out.println(n.getName() + ", " + n.getRam() + ", " + n.getHd() + ", " + n.getOs() + ", " + n.getColor());
            };
        filterStream.forEach(action);    
    }
    public static void PrintAllNoutsName(ArrayList<Nout> AL, String name) {
        Stream<Nout> stream = AL.stream();
        Predicate<Nout> predicate = (nout) -> {
            if (nout.getName() == name)
              return true;
            return false;
        };
        Stream<Nout> filterStream = stream.filter(predicate);
        Consumer<Nout> action = (n) -> {
            System.out.println(n.getName() + ", " + n.getRam() + ", " + n.getHd() + ", " + n.getOs() + ", " + n.getColor());
        };
        filterStream.forEach(action);
    }
    public static void PrintAllNoutsOs(ArrayList<Nout> AL, String os) {
        Stream<Nout> stream = AL.stream();
        Predicate<Nout> predicate = (nout) -> {
            if (nout.getOs() == os)
              return true;
            return false;
        };
        Stream<Nout> filterStream = stream.filter(predicate);
        Consumer<Nout> action = (n) -> {
            System.out.println(n.getName() + ", " + n.getRam() + ", " + n.getHd() + ", " + n.getOs() + ", " + n.getColor());
        };
        filterStream.forEach(action);
    }
    public static void main(String[] args) {
        ArrayList<Nout> AL = new ArrayList<Nout>();
        AL.add(new Nout("Irbis", 16, 1128, "Windows", "black"));
        AL.add(new Nout("Honor", 8, 512, "Windows", "silver"));
        AL.add(new Nout("HP", 8, 256, "Linux", "black"));

        StreamAPI.PrintAllNouts(AL);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - Название \n2 - RAM \n3 - HD \n4 - операционгная система \n5 - цвет ");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Введите название нотбука \n1 - Irbis \n2 - Honor \n3 - HP");
            int b = scanner.nextInt();
            if (b == 1) {
                StreamAPI.PrintAllNoutsName(AL, "Irbis");
            } else if (b == 2) {
                StreamAPI.PrintAllNoutsName(AL, "Honor");
            } else if (b == 3) {
                StreamAPI.PrintAllNoutsName(AL, "HP");
            } else {
                System.out.println("Нет такого названия");
            }
        }
        if (a == 2) {
            System.out.println("Введите количество оперативной памяти ");
            int c = scanner.nextInt();
            if (c > 7) {
                StreamAPI.PrintAllNoutsRam(AL, c);
            } else {
                System.out.println("У нас нет ноутбуков с памятью меньше 8");
            }            
        }
        if (a == 3) {
            System.out.println("Введите объем жесткого диска");
            int d = scanner.nextInt();
            if (d > 255) {
                StreamAPI.PrintAllNoutsHd(AL, d);                
            } else {
                System.out.println("У нас нет ноутбуков с жестким диском меньше 256");
            }
        }
        if (a == 4) {
            System.out.println("Введите номер операционной системы нотбука \n1 - Windows \n2 - Linux ");
            int e = scanner.nextInt();
            if (e == 1) {
                StreamAPI.PrintAllNoutsOs(AL, "Windows");
            } else if (e == 2) {
                StreamAPI.PrintAllNoutsOs(AL, "Linux");
            } else {
                System.out.println("Ноутбука с такой системой у нас нет");
            }
        }
        if (a == 5) {
            System.out.println("Введите номер цвета нотбука \n1 - black \n2 - silver ");
            int h = scanner.nextInt();
            if (h == 1) {
                StreamAPI.PrintAllNoutsColor(AL, "black");
            } else if (h == 2) {
                StreamAPI.PrintAllNoutsColor(AL, "silver");
            } else {
                System.out.println("у нас только два цвета ноутбуков");
            }
        scanner.close();   
        }

    }

}

