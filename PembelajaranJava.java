/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelajaran.java;
import java.util.Scanner;
/**
 *
 * @author Zabrina
 */
public class PembelajaranJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 7;
        if (number < 10) {
            System.out.println("I Love Programing");
        }
        else if (number < 30){
            System.out.println("I Love Programming 2nd");
        }
        else{
            System.out.println("I Still Love Programming");
        }
        
        //cheatsheet = simplify = one line condition
        int time = 30;
        
        String result = (number < 18) ?
                "Good Morning" : " Good Night";
        System.out.println(result);
        
        // Switch Case
        System.out.print("Masukkan angka: ");
        Scanner input = new Scanner(System.in);
        String hasil = input.nextLine();
        
        switch (hasil){
            case "1":
                System.out.println("aku cinta kamu");
                break;
            case "2":
                System.out.println("aku cinta dia");
                break;
            default:
                System.out.println("No Option!");
                break;
        }
         //Switch similar like If
        System.out.print("Masukkan kata: ");
        Scanner inputan = new Scanner(System.in);
        String words = inputan.nextLine();
        
        //case 1
        if(words.equals("1")){
            System.out.println("aku cinta kamu");
        }
        //case 2
        else if(words.equals("2")){
            System.out.println("aku cinta dia");
        }
        //default
        else{
            System.out.println("No Option!");
        }
        // SIMPLY TASK
        System.out.print("Masukkan input: ");
        Scanner angka = new Scanner(System.in);
        int number = angka.nextInt();
        
        if(number < 10){
            System.out.println("Under 10!");
        }
        else if(number <= 31){
            System.out.println("Above 10 and Under 30");
        }
        else{
            System.out.println("Above 31!");
        }
        //LOOPING
        //using for
        int max = 10;
        for (int i = 0; i < max; i++){
            System.out.println(i);
        }
         //using foreach
        int arr[] = {3, 1, 2, 5, 4};
        
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        String letters[] = {"Hello", "Depok", "Zabrina", "Is", "Adorable"};
        
        for (String letter : letters) {
            System.out.println(letter);
        }
         //using While Do
        int maks = 10;
        int i = 0;
        while (i < maks){
            System.out.println("Hello Depok!");
            i++;
        }
        //using Do While
        int maxx = 10;
        int x = 0;
        do{
            System.out.println("Hello Jakarta!");
            x++;
        }while (x < maxx);
    }
}


    
    

