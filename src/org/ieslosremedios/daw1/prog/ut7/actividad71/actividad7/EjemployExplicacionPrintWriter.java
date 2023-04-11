package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad7;
import java.io.*;
public class EjemployExplicacionPrintWriter {
    public static void main(String[] args) throws IOException{
        /**
         * Jerarquía de clases
         * java.lang.Object
         *  java.io.Writer
         *      java.io.PrintWriter
         * Clase de java que nos permite escribir dato en un stream de caracteres. También nos permite introducir formato
         * */
        PrintWriter printear = null;
        try {
            printear = new PrintWriter("C:\\Users\\usuario\\Desktop\\textoPrintWriter.txt");
            printear.println("Primera linea");
            printear.println("Segunda linea");
            printear.println("Tercera linea");
        }finally {
            if (printear!=null){
                printear.close();
            }
            System.out.println("Programa Finalizado");
        }
    }
}
