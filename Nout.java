public class Nout {
    String name;
    int ram;
    int hd;
    String os;
    String color;
    
    public Nout(String name, int ram, int hd, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hd = hd;
        this.os = os;
        this.color = color;
    }

    String getName() { return name; }
    int getRam() { return ram; }
    int getHd() { return hd; }
    String getOs() { return os; }
    String getColor() { return color; }
}    

