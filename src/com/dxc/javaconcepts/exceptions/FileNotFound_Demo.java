package com.dxc.javaconcepts.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound_Demo {

    public static void main(String args[])
    {
        try{
            File file=new File("C://filename.txt");
            FileReader fileReader=new FileReader(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
    }
}
