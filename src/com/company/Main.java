package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person defaultPerson = new Person();
        System.out.println(defaultPerson);

        LocalDate fDato1 = LocalDate.of(1991,4,13 );
        Person person1 = new Person(42, "Magnus Pihl", "Adresse X", "Patrulje Y", fDato1, false);
        System.out.println(person1);

        LocalDate fDato2 = LocalDate.of(1961,4,13 );
        Person person2 = new Person(43,"Jens Peter Andersen","Adresse Z","Patrulje V",fDato2,true);
        System.out.println(person2);

        Tilmeldingskatalog tilm1 = new Tilmeldingskatalog();
        System.out.println(tilm1);

        LocalDate startDato1 = LocalDate.of(2021,7,20);
        LocalDate slutDato1 = LocalDate.of(2021,7,27);
        Tilmeldingskatalog tilm2 = new Tilmeldingskatalog("Sommerlejr",false,startDato1,slutDato1);
        System.out.println(tilm2);
    }
}
