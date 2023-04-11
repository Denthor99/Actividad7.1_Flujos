package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad7;
import java.io.*;
public class EjemployExplicacionCharArrayWriteryReader {
    public static void main(String[] args) throws IOException{
        /**
         * Jerarquía de clases (CharArrayWriter)
         * java.lang.Object
         *  java.io.Writer
         *      java.io.CharArrayWriter
         *
         * Clase de java empleada para escribir caracteres en un array de caracteres en memoria. Esta secuencia de
         * caracteres se almacena en un buffer en memoria
         * */
        CharArrayWriter escribirChars = null;
        try {
            escribirChars = new CharArrayWriter();
            char[] caracteres={'B','U','r','n'};
            escribirChars.write(caracteres);
            char[] resultado=escribirChars.toCharArray();
            System.out.println(resultado);
        }finally {
            if (escribirChars!=null){
                escribirChars.close();
            }
            System.out.println("Programa finalizado");
        }

        /**
         * Jerarquía de clases (CharArrayReader)
         * java.lang.Object
         *  java.io.Reader
         *      java.io.CharArrayReader
         *
         * Clase de java usada para leer data de un array de caractares en un flujo de entrada
         * */

        CharArrayReader leerArrayChars=null;
        try {
            char[] caracteres={'B','U','r','n'};
            leerArrayChars = new CharArrayReader(caracteres);
            int caracterIndex;
            while ((caracterIndex = leerArrayChars.read())!=-1){
                System.out.print((char) caracterIndex);
            }
        }finally {
            if (leerArrayChars!=null){
                leerArrayChars.close();
            }
            System.out.println();
            System.out.println("Programa finalizado");
        }
    }
}
