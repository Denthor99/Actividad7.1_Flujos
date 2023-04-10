package org.ieslosremedios.daw1.prog.ut7.actividad71.actividad6;
import java.io.*;
public class EjemployExplicacionFileInputStream {
    public static void main(String[] args) throws IOException{
        FileInputStream filer=null;
        try {
            filer = new FileInputStream("C:/Users/1DAW_2223_04/Desktop/salida.txt");
            int leer=filer.read();
            while(leer!=-1){
                System.out.print((char)leer);
                leer=filer.read();
            }
            System.out.println();
        }catch (FileNotFoundException exe){
            System.out.println(exe.getMessage());
        }finally{
            if (filer!=null){
                filer.close();
            }
            System.out.println("Programa finalizado");
        }
    }
}
