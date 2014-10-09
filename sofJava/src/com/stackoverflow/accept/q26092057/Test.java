package com.stackoverflow.accept.q26092057;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/*
 * Change file permission
Path file = ...;  
Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-------");  
FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);  
try {  
    Attributes.setPosixFilePermissions(file, perms);  
} catch (IOException x) {  
    System.err.println(x);  
}  
 */

public class Test {
    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);
        ex.scheduleAtFixedRate(new Start(),  0 , 24, TimeUnit.HOURS);
        ex.scheduleAtFixedRate(new End(),  2 , 24, TimeUnit.HOURS);
        scanner = new Scanner(System.in);
        while(true){
            if(scanner.hasNext() && "Q".equals(scanner.next())){
                System.exit(0);
            }
            Thread.sleep(10000);
        }
    }
}

class Start implements Runnable{

    @Override
    public void run() {
        //start your game
    }

}

class End implements Runnable{

    @Override
    public void run() {
        //shutdown your game
    }

}


