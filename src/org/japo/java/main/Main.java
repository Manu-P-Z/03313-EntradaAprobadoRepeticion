/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        final int NOTA_MIN_APR = 5;
        final int NOTA_MAX_APR = 10;
        final String APR = "APROBADO";
        final String SUS = "SUSPENDIDO";

        //Variables
        double notaEx = 0;
        boolean datoApt;
        String estNota = "a";

        //Bucle
        do {
            try {

                System.out.print("Introduzca nota examen ...: ");
                notaEx = SCN.nextDouble();
                datoApt = true;
                if (notaEx >= NOTA_MIN_APR) {
                    estNota = APR;
                    if (notaEx > NOTA_MAX_APR) {
                        System.out.println
        ("El alumno le ha comprado un jamon al profesor");
                    }

                } else {
                    if (notaEx < NOTA_MIN_APR) {
                        System.out.println
        ("El alumno no ha hecho caso a los enunciados");
                    }
                    estNota = SUS;
                }
                
            } catch (Exception e) {
                datoApt = false;
            } finally {
                SCN.nextLine();
            }

        } while (datoApt == false);
        System.out.printf(Locale.ENGLISH, "%s %s %s %.2f%n", "El alumno ha",
                estNota, "con ...:", notaEx);
    }

}
//notaEx <= NOTA_MAX_APR && 
