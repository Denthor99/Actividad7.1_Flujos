package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;

import java.io.*;

public class EjemployExplicacionBufferedInputStream {
    public static void main(String[] args) throws IOException {
        /**
         * Jerarquía de Clases
         * java.lang.Object
         *  java.io.InputStream
         *      java.ioFilterInputStream
         *          java.io.BufferedInputStream
         * Esta clase se usa para leer el contenido de flujo de entrada, empleando un buffer interno que nos proporciona
         * un mejor rendimiento de lectura
         * */
        FileInputStream filer=null;
        BufferedInputStream bufle=null;
        try {
            filer = new FileInputStream("C:/Users/usuario/Desktop/salida3.txt");
            bufle=new BufferedInputStream(filer);
            int caracterIndex=0;
            while((caracterIndex=bufle.read())!=-1){
                System.out.print((char)caracterIndex);
            }
        }catch (FileNotFoundException fle){
            System.out.println(fle.getMessage());
        }finally {
            if (bufle!=null){
                bufle.close();
            }
            if (filer!=null){
                filer.close();
            }
            System.out.println();
            System.out.println("Programa finalizado");
        }
    }
}
