package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;
import java.io.*;
public class EjemployExplicacionPrintStream {
    public static void main(String[] args) throws IOException {
        /**
         * Jerarquía de Clases
         * java.lang.Object
         *  java.io.OutputStream
         *      java.io.FilterOutputStream
         *          java.io.PrintStream
         *
         * Este clase nos permite la impresión de datos a un flujo de datos determinada. Podemos imprimir tanto por
         * pantalla como en un archivo  de texto
         * */
       PrintStream empremir1=null;
       PrintStream empremir2=null;
       try {
           empremir1 = new PrintStream(System.out);
           empremir1.println("Buenas que tal?");
           empremir2 = new PrintStream("C:/Users/usuario/Desktop/salida2.txt");
           empremir2.println("Muy bonita la republica perteneciente al consulado");
       }catch (FileNotFoundException fil){
           System.out.println(fil.getMessage());
       }finally {
           if (empremir1!=null){
               empremir1.close();
           }
           if (empremir2!=null){
               empremir2.close();
           }
           System.out.println("Programa finalizado");
       }

    }
}
