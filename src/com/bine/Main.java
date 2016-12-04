package com.bine;
import javax.swing.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        String input = new String();
        OutputStream outStream = null;
        String dateiname = "Test.txt";
        File file = new File(dateiname);
        FileWriter fw =
                    new FileWriter(dateiname, file.exists());

        try {
            outStream = new FileOutputStream(file);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("Gib was ein: ");
            int count =0;
            while( count <5){

            input = br.readLine();
            fw.write(input);
            fw.append("\r\n");
            count ++;
                System.out.println("Du hast " + input + " eingegeben." + count);
            }
            fw.write(input);
            fw.append("\r\n");

            JOptionPane.showMessageDialog(null, input);

        } catch (IOException e) {
            e.printStackTrace();
            if(fw != null) {
                fw.flush();
                fw.close() ;
            }
        }
        finally{
            if(fw != null) {
                fw.flush();
                fw.close() ;
            }
            System.out.println("Du hast " + input + " eingegeben.");
            System.exit( 0 );
        }
    }
    public static String sagCiao(){
        String ciao="Ciao";
        return ciao;
    }
}


/**
 * }

 allprojects {
 repositories {
 maven {
 url 'https://github.com/bine-summ-summ/testVWSE.git'
 }
 credentials {
 username bine-summ-summ
 password einzelTRaining86
 }
 }
 }

 *
 * */