package org.withoutBoot;

public class Laptop implements Computers {
    @Override
    public void system() {
        System.out.println("Laptop system is used for building");
    }
}
