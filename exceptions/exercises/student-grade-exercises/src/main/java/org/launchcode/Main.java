package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(2,2));
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(HashMap.Entry<String,String> entry : studentFiles.entrySet()){
            int point = 0;
            point = CheckFileExtension(entry.getValue());
            System.out.println(entry.getKey()+":"+point+"points");
        }
    }

    public static double Divide(int x, int y)
    {
        // Write code here!
        double div=0;
        try{
            div = x/y;
        }catch(ArithmeticException arithmeticException){
            System.out.println("Error due to:"+ arithmeticException.getMessage());
            arithmeticException.printStackTrace();
        }
        return div;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        int points = 0;
        if(fileName == null || fileName.isEmpty()) {
                points = -1;
                try {
                     throw new NoFileException("No File has been uploaded");
                }catch(NoFileException e){
                    e.printStackTrace();
                }

        }else if(fileName.endsWith(".java")){
                points = 1;
        }else{
            points = 0;
        }

        return points;
    }
}