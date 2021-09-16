/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Igra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(5-0+1)+0;
        System.out.println("Программа загадала число от 0 до 5. Отгадай:");
        
        Scanner scan = new Scanner(System.in);
        int usernum = scan.nextInt();
        if (num == usernum) {
            System.out.println("Ура!!! Ты угадал!");
        }else{
            System.out.println("Ты проиграл! Задуманное число: " + num);
        }
        // TODO code application logic here
    }
    
}
