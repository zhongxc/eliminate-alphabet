package com.eliminateAlphabe;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class EliminateAlphabetApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EliminateAlphabetApplication.class);
    }



    @Override
    public void run(String... args) throws Exception {
        System.out.println(a("aaafffsda"));
        System.out.println("===============");
        System.out.println(a("aasffvvv"));
        System.out.println("===============");
        System.out.println(a("asdddwewe"));
        System.out.println(a("sdfas"));
    }

    private String a(String p ){
        String[] strArray = p.split("|");
        for (int i = 0; i+2 < strArray.length; i++) {
            if (strArray[i].equals(strArray[i+1]) && strArray[i].equals(strArray[i+2])){
                return a(eliminateAlphabet(i,p));
            }
        }
        return p;
    }

    private String eliminateAlphabet(int i, String p){
        return p.substring(0,i)+p.substring(i+3);
    }

}
