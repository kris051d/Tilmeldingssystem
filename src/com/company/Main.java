package com.company;

public class Main {

    static void printTilmelding(Person tilmelding) { System.out.println(tilmelding); }

    public static void main(String[] args) {

        Person tilmeldingsblanket = new Person(0710006105, 123);
        printTilmelding(tilmeldingsblanket);

    }
}
