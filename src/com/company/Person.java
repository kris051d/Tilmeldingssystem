package com.company;

import java.time.LocalDate;

public class Person {

        int Id;
        String Navn;
        String Adresse;
        String Patrulje;
        LocalDate FoedelsDato;
        boolean EnUge;


        public Person(){
            Id = 0;
            Navn = "";
            Adresse = "";
            Patrulje = "";
            FoedelsDato = LocalDate.now();
            EnUge = false;
        }

        public Person (int id,
                       String navn,
                       String adresse,
                       String patrulje,
                       LocalDate fDato,
                       boolean enUge)
        {
           Id = id;
           Navn = navn;
           Adresse = adresse;
           Patrulje = patrulje;
           FoedelsDato = fDato;
           EnUge = enUge;
        }

        public String toString()
        {
            return      "ID: " + Id
                    + ", Navn: " + Navn
                    + ", Adresse: " + Adresse
                    + ", Patrulje: " + Patrulje
                    + ", Foedselsdato: " + FoedelsDato
                    + ", EnUge: " + EnUge + ".";

        }

        public int getID(){return Id;}
        public String getNavn () {return Navn;}
        public String getAdresse () {return Adresse;}
        public String getPatrulje () {return Patrulje;}
        public LocalDate getFodselsdato(){return FoedelsDato;}
        public boolean getEnUge () {return EnUge;}

        public void setID(int value) {Id = value;}
        public void setNavn (String value) {Navn = value;}
        public void setAdresse (String value) {Adresse = value;}
        public void setPatrulje (String value) {Patrulje = value;}
        public void setFoedelsDato (LocalDate value) {FoedelsDato = value;}
        public void setEnUge (boolean value) {EnUge = value;}
}



