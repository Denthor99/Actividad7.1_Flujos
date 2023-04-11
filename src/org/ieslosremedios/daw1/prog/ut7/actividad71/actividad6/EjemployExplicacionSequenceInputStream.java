package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;

import java.io.*;

public class EjemployExplicacionSequenceInputStream {
    public static void main(String[] args) throws IOException {
        /**
         * Jerarquía de clases
         * java.lang.Object
         *  java.io.InputStream
         *      java.io.SequenceInputStream
         * Clase de java que nos permite la concatenación de varios flujos de entrada en uno solo de forma secuencial
         *
         * */
        SequenceInputStream secuen=null;
        try {
            FileInputStream entrada1 = new FileInputStream("C:/Users/usuario/Desktop/entrada1.txt");
            FileInputStream entrada2 = new FileInputStream("C:/Users/usuario/Desktop/salida2.txt");
            secuen = new SequenceInputStream(entrada1, entrada2);
            BufferedInputStream bufferedInput = new BufferedInputStream(secuen);
            int caractIndex;
            while ((caractIndex = bufferedInput.read())!=-1){
                System.out.print((char)caractIndex);
            }
            bufferedInput.close();
        }finally {
            if (secuen!=null){
                secuen.close();
            }
            System.out.println("Programa finalizado");
        }
    }
}
