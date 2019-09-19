package com.shirc.arthasexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArthasExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArthasExampleApplication.class, args);
        run();
    }


    public static void run(){
        while (true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
