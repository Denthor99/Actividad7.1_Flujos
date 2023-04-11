package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad7;
import java.io.*;
public class EjemployExplicacionFileReaderyFileWriter {
    public static void main(String[] args) throws IOException{
        /**
         * Jerarquía de clases (FileWriter)
         * java.lang.Object
         *  java.io.Writer
         *      java.io.OutputStreamWriter
         *          java.io.FileWriter
         *
         * Esta clase de java se usa principalmente para escribir un conjunto de caracteres en un archivo. Hereda de la
         * clase abstracta "Writer". Cuando creamos un objeto de esta clase, debemos indicar un archivo. Si no existe se crea
         * , y si existe se añade al final del documento de texto. Si a la hora de añadir un documento, añadimos el valor booleano
         * "true", nos escribe al final del documento. Con false lo reescribimos
         * */
        try {
            FileWriter escribeChivo=new FileWriter("C:\\Users\\usuario\\Desktop\\textoNuevo.txt",true);
            escribeChivo.write("Buenas que tal");
            escribeChivo.close();
        }finally {
            System.out.println("Programa finalizado");
        }

        /**
         * Jerarquía de Clases (FileReader)
         * java.lang.Object
         *  java.io.Reader
         *      java.io.InputStreamReader
         *          java.io.FileReader
         *
         * Clase de java que lee los caracteres de un fichero
         *  */
        try {
            FileReader lector = new FileReader("C:\\Users\\usuario\\Desktop\\textoNuevo.txt");
            int caracterIndex;
            while ((caracterIndex = lector.read()) != -1) {
                System.out.print((char) caracterIndex);
            }
            lector.close();
        }finally {
            System.out.println();
            System.out.println("Programa Finalizado");
        }
    }
}
