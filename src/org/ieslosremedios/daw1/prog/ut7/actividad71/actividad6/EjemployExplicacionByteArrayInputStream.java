package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;
import java.io.*;
public class EjemployExplicacionByteArrayInputStream {
    public static void main(String[] args)throws IOException {
        /**
         * Jerarquía de clases
         * java.lang.Object
         *  java.io.InputStream
         *      java.io.ByteArrayInputStream
         *
         * Clase de java que nos permite leer bytes de un array de bytes en memoria. Al ser un array extraido del buffer,
         * no lo extraemos de un archivo de texto, por lo que será una lectura muy rápida y eficiente
         * */
    ByteArrayInputStream bite=null;
    try {
        byte[] arrayBi = {65, 67, 66, 74};
        bite = new ByteArrayInputStream(arrayBi);
        int index;
        while ((index = bite.read()) != -1) {
            System.out.print((char) index);
        }
    }catch (ArrayIndexOutOfBoundsException ar){
        System.out.println(ar);
    }finally {
        if (bite!=null){
            bite.close();
        }
        System.out.println();
        System.out.println("Programa finalizado");
    }
    }
}
