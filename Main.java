class laptop {
    String nama;
    String prosesor;
    int ram;
    String vga;
    int memory;
    int display;
        laptop (String nama, String prosesor, int ram, String vga, int memory, int display){
             this.nama= nama;
            this.prosesor = prosesor;
            this.ram = ram;
            this.vga = vga;
            this.memory = memory;
            this.display = display;
    }

    void print(){
        System.out.println("Nama Produk : "+nama);
        System.out.println("Prosesor    : "+prosesor);
        System.out.println("RAM         : "+ram +" GB");
        System.out.println("VGA         : "+vga);
        System.out.println("Memory      : "+memory +" GB");
        System.out.println("Display     : "+display + " Inch");
    }
}

public class Main {
     public static void main (String[]orgs){
     laptop laptop1 = new laptop ("Lenovo Ideapad Gaming 3", "Intel Core i5 5200U", 16, "RTX 3050", 512, 16);
     
     laptop laptop2 = new laptop ("ASUS ROG STRIX", "Intel Core i7-12650H", 32, "RTX 3090", 512, 15);
     laptop2.print();
     System.out.println();
     laptop1.print();

     }
 }
