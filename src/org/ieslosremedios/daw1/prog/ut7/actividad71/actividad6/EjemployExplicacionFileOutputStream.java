package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;
import java.io.*;
public class EjemployExplicacionFileOutputStream {
    public static void main(String[] args) throws IOException {
        /**
         * Esta clase de Java se encuentra dentro del paquete java.io.OutputStream, y su funcionamiento consiste en
         * enviar bytes a un archivo de texto que se encuentra en el sistema de archivos del equipo. Se usa de la mano de
         * la clase FileInputStream
         * */
        FileOutputStream salida=null;
        File archivo;
        try {
            archivo=new File("C:/Users/1DAW_2223_04/Desktop/salida.txt");
            salida=new FileOutputStream(archivo);
            String texto="Hola si que tal me llamo daniel tu que tal estas?";
            char[] caracterTexto=texto.toCharArray();
            //salida.close();
            for (int i = 0; i < caracterTexto.length; i++) {
                salida.write(caracterTexto[i]);
            }
        }
        catch (FileNotFoundException erp){
            erp.printStackTrace();
            erp.getMessage();
        }
        catch (IOException ex){
            ex.printStackTrace();
            ex.getMessage();
        }
        finally {
            if (salida!=null) {
                salida.close();
            }
            System.out.println("Completado");
        }
    }
}