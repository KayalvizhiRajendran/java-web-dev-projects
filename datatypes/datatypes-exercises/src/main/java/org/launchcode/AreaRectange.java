package org.launchcode;
import java.util.Scanner;
public class AreaRectange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length  = input.nextInt();
        System.out.println("Enter the width : ");
        int width = input.nextInt();
        System.out.println("the area of their rectangle is :"+ length*width);

    }
}
