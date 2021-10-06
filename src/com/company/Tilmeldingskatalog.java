package com.company;

import java.time.LocalDate;

public class Tilmeldingskatalog {
    String LejrID;
    boolean UgeRegel;
    LocalDate Startdato;
    LocalDate Slutdato;
    Person Deltagere[];

    public Tilmeldingskatalog () {
        LejrID = "";
        UgeRegel = false;
        Startdato = LocalDate.now();
        Slutdato = LocalDate.now();
        Deltagere = new Person[10];

        for (int idx = 0; idx < Deltagere.length; idx++)
        {
            Deltagere[idx] = null;
        }
    }

    public Tilmeldingskatalog(String lejrID,
                              boolean ugeRegel,
                              LocalDate stardato,
                              LocalDate slutdato) {

        LejrID = lejrID;
        UgeRegel = ugeRegel;
        Startdato = stardato;
        Slutdato = slutdato;
        Deltagere = new Person [10];

        for (int index = 0; index < Deltagere.length; index++)
        {
            Deltagere[index] = null;
        }
    }

    public String toString() {
        String result =
                    "LejrID: " + LejrID
                + ", Ugeregel: " + UgeRegel
                + ", Startdato: " + Startdato
                + ", Slutdato: " + Slutdato;
        for(int idx = 0; idx < Deltagere.length; idx++) {
            if (Deltagere[idx] != null){
                result = result + Deltagere[idx].toString() + "\n";
            }
        }
        return result;
    }
}
