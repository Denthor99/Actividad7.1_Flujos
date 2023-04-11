package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;
import java.io.*;
public class EjemployExplicacionPipedOutputInputStream {
    public static void main(String[] args) throws IOException{
        /**
         * Jerarquía de Clases
         * java.lang.Object
         *  java.io.OutputStream
         *      java.io.PipedOutputStream
         *
         * Esta clase de java nos permite crear una "tuberia", que nos permitira transferir los datos de una parte del
         * programa a otro
         *
         * */

        PipedOutputStream pipeado=null;
        PipedInputStream pepeado=null;
        try {
            pipeado = new PipedOutputStream();
            pepeado = new PipedInputStream(pipeado);
            String cadena = "eiyouuuuu";
            pipeado.write(cadena.getBytes());
            pipeado.flush();
            System.out.println(cadena);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }finally {
            if (pipeado!=null){
                pipeado.close();
            }
            if(pepeado!=null){
                pepeado.close();
            }
            System.out.println("Programa Finalizado");
        }
    }
}
