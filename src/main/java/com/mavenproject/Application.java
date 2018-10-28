package com.mavenproject;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public void versionSpecificMethod() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hahaha diamond operator pre java 7");

        for(String element: stringList) {
            System.out.println("Application output: " + element);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Maven ;)");
        Application app = new Application();
        app.versionSpecificMethod();
    }
}