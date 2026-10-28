package org.withoutBoot;

public class Dev {
     Desktop desktop;
     Laptop laptop;
    public Dev(Desktop desktop, Laptop laptop) {
       this.desktop = desktop;
       this.laptop = laptop;
    }
    void build(){
        desktop.system();
        laptop.system();

        System.out.println("Building application");
    }
}
