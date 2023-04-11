package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;
import java.io.*;
public class EjemployExplicacionDataOutputStream {
    /**
     * Jerarquía de clases
     * java.lang.Object
     *  java.io.OutputStream
     *      java.io.FilterOutputStream
     *          java.io.DataOutputStream
     * Este clase de java nos permitirá escribir datos de tipo primitivo, indepedientemente de la máquina
     * A la hora de abrir el fichero, se nos mostrarán datos erroneos (sobretodo datos númericos)
     *  */
    public static void main(String[] args) throws IOException{
    DataOutputStream salida=null;
    try {
        salida = new DataOutputStream(new FileOutputStream("C:/Users/usuario/Desktop/salida.txt"));
        salida.writeChars("Betis");
        salida.writeChar('\n');
        salida.writeUTF("Hola, mundo!");
        salida.writeChar('\n');
        salida.writeInt((int)123);
    }catch (FileNotFoundException fi){
        System.out.println(fi.getMessage());
    }finally {
        if (salida!=null){
            salida.close();
        }
        System.out.println("Programa finalizado");
    }
    }
}
