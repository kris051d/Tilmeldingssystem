package com.company;

import java.time.LocalDate;

public class Person {

        int id;
        String navn;
        String adresse;
        String patrulje;
        LocalDate fodselsdato;
        //boolean enUge;

        Person (int ID, String Navn, String Adresse, String Patrulje, LocalDate Fodselsdato){
           id = ID;
           navn = Navn;
           adresse = Adresse;
           patrulje = Patrulje;
           fodselsdato = Fodselsdato;
        }

        public String toString() {
            return "ID: " + id + "\n Navn: " + navn + "\n Adresse: " + adresse + "\n Patrulje: " + patrulje + "\n Fodselsdato: " + fodselsdato + ".";
        }

    }


