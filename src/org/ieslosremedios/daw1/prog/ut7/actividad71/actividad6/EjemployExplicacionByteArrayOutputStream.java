package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;

import java.io.*;

public class EjemployExplicacionByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
        /**
         * Jerarquía de clases
         * java.lang.Object
         *  java.io.OutputStream
         *      java.io.ByteArrayOutputStream
         *
         * Clase que implementa una salida de secuencia de bytes en un array de bytes
         * */
        ByteArrayOutputStream arrayBytes=null;
        try {
            arrayBytes = new ByteArrayOutputStream();
            arrayBytes.write(65);
            arrayBytes.write("Buenas".getBytes());
            arrayBytes.write(69);
            byte[] arrayl=arrayBytes.toByteArray();
            for (byte e:
                 arrayl) {
                System.out.print(e+" ");
            }
        }finally {
            if(arrayBytes!=null){
                arrayBytes.close();
            }
            System.out.println();
            System.out.println("Programa Finalizado");
        }
    }
}
