package site.wilgo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste01 {
    public static void main(String[] args) throws IOException {

        File file = new File ("arquivo.txt"); // posso passar também um path absoluto

        try{
            System.out.println("Arquivo criado: " +file.createNewFile());  // return boolean
            System.out.println("Path: " +file.getPath());
            System.out.println("Path Absolute: " +file.getAbsolutePath());
            System.out.println("Is a Directory: " +file.isDirectory());
            System.out.println("Is a File: " +file.isFile());
            System.out.println("Last Modificated: " + new Date(file.lastModified()));


        }catch (IOException e){
            e.printStackTrace();
        }

        if(file.exists()){
            System.out.println("Arquivo deletado: " +file.delete());    // return boolean
        }

    }
}
