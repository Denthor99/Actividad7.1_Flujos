package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;
import java.io.*;
public class EjemployExplicacionDataInputStream {
    public static void main(String[] args) throws IOException {
        /**
         * Jerarquía de clases
         * java.lang.Object
         *  java.io.InputStream
         *      java.io.FilterInputStream
         *          java.io.DataInputStream
         *
         * Clase usada para leer datos de un flujo de entrada y convertirlos en diferentes tipos primitivos
         * */
        FileInputStream entradaFile=null;
        DataInputStream entradaData=null;
        try {
            entradaFile = new FileInputStream("C:/Users/usuario/Desktop/entrada1.txt");
            entradaData = new DataInputStream(entradaFile);
            int edad = entradaData.readInt();
            double altura = entradaData.readDouble();
            boolean camionero = entradaData.readBoolean();
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
            System.out.println("Camionero? " + camionero);
        }catch (FileNotFoundException dfe){
            System.out.println(dfe.getMessage());
        }finally {
            if (entradaData!=null){
                entradaData.close();
            }
            if (entradaFile!=null){
                entradaFile.close();
            }
            System.out.println("Programa Finalizado");
        }
    }
}
