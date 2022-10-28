package com.li.spidemo.test;

import com.li.spidemo.service.Developer;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Developer> services = ServiceLoader.load(Developer.class);
        for(Developer service :services){
            service.show();
        }
    }
}
