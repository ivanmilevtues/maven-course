package com.mavenproject;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public void versionSpecificMethod() {
        String[] stringList = StringUtils.split("I am sadasd", ' ');

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