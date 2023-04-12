package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad7;
import java.io.*;
public class EjemployExplicacionStringWriteryReader {
    public static void main(String[] args) throws IOException{
        /**
         * Jerarquía de clases (StringWriter)
         * java.lang.Object
         *  java.io.Writer
         *      java.io.StringWriter
         *
         * Esta clase de java nos permite escribir datos en un buffer de cadena (String)
         * */
        StringWriter escribeCadenas = null;
        String ejemplo="";
        try {
            escribeCadenas = new StringWriter();
            ejemplo = "Java es un lenguaje de programación";
            escribeCadenas.write(ejemplo);

        }finally {
            if (escribeCadenas!=null){
                escribeCadenas.close();
            }
            System.out.println("Programa Finalizado");
        }

        /**
         * Jerarquía de clases (StringReader)
         * java.lang.Object
         *  java.io.Reader
         *      java.io.StringReader
         *
         * Clase de java empleado para leer datos (caracteres) originarios de cadenas

         * */
        StringReader leerCadena = null;
        try {
            leerCadena = new StringReader(ejemplo);
            char[] arrayChar = new char[ejemplo.length()];
            leerCadena.read(arrayChar);
            System.out.println(arrayChar);
        }finally {
            if (leerCadena!=null){
                leerCadena.close();
            }
            System.out.println("Programa Finalizado");
        }
    }
}
