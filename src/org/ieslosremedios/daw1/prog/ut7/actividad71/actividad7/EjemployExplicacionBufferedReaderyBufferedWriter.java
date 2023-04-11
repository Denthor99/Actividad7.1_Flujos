package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad7;
import java.io.*;
public class EjemployExplicacionBufferedReaderyBufferedWriter {
    public static void main(String[] args) throws IOException{
        /**
         * Jerarquía de clases (BufferedWriter)
         * java.lang.Object
         *  java.io.Writer
         *      java.io.BufferedWriter
         *
         * Se utiliza para escribir un conjunto de caracteres en un archivo de manera más eficiente, ya que emplea un buffer
         * interno. Tendremos que implementar fileWriter
         * */
        try {
            FileWriter escribir=new FileWriter("C:\\Users\\usuario\\Desktop\\textoBuffer.txt");
            BufferedWriter buffler=new BufferedWriter(escribir);
            buffler.write("En la primera linea de batalla, un batallon de infanteria");
            buffler.newLine();
            buffler.write("En la segunda linea de batalla, un avion volcado");
            buffler.flush();
            buffler.close();
        }finally {
            System.out.println("Programa finalizado");
        }

        /**
         * Jerarquía de clases (BufferedReader)
         * java.lang.Object
         *  java.io.Reader
         *      java.io.BufferedReader
         * Clase de java que nos permite leer texto de un flujjo de entrada de caracteres, empleando el correspondiente
         * buffer interno para realizar esta operación de forma más eficiente
         * */
        try {
            BufferedReader lectorr=new BufferedReader(new FileReader("C:\\Users\\usuario\\Desktop\\textoBuffer.txt"));
            String line=lectorr.readLine();
            while (line!=null){
                System.out.println(line);
                line= lectorr.readLine();
            }
            lectorr.close();
        }finally {
            System.out.println("Programa Finalizado");
        }
    }
}
