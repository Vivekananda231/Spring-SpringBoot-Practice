package org.withoutBoot;

public class Desktop implements Computers {

    @Override
    public void system() {
        System.out.println("Desktop system used for building");
    }
}
