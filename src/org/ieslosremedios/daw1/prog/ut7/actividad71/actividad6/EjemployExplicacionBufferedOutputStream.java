package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;
import java.io.*;
public class EjemployExplicacionBufferedOutputStream {
    public static void main(String[] args) throws IOException{
        /**
         * Jerarquia
         * java.lang.Object
         *  java.io.OutputStream
         *      java.io.FilterOutputStream
         *          java.io.BufferedOutputStream
         *
         * Parecido al ejemplo anterior, con la diferencia que usar un "buffer" en el flujo de salida, mucho más eficiente
         * a la hora de la escritura de un OutputStream. Su funcionamiento consiste en ir acumulando la información en una instancia
         * de la memoria y enviarla de golpe, en vez de introducirla poco a poco en ese espacio de memoria. Cuando nos referimos a buffer nos
         * referimos a una zona de memoria temporal.
         * *
         */
        FileOutputStream archivoFueraFlujo=null;
        BufferedOutputStream bufereado=null;
        try {
            archivoFueraFlujo = new FileOutputStream("C:/Users/1DAW_2223_04/Desktop/accion.txt");
            bufereado=new BufferedOutputStream(archivoFueraFlujo);
            bufereado.write((byte)'P');
            bufereado.write((byte)'r');
            bufereado.write((byte)'e');
            bufereado.write((byte)'e');
            bufereado.write((byte)'p');
            bufereado.write((byte)'a');
            bufereado.write((byte)'r');
            bufereado.write((byte)'a');
            bufereado.write((byte)'t');
            bufereado.write((byte)'e');
        }
        catch (FileNotFoundException filerp){
            System.out.println(filerp.getMessage());
        }
        finally {
            if(bufereado!=null){
                bufereado.close();
            }
            if(archivoFueraFlujo!=null) {
                archivoFueraFlujo.close();
            }
            System.out.println("Programa finalizado");
        }
    }
}
