package com.example;
import java.util.Scanner;
import java.lang.Math;
///вариант 1
public class t1 {
    public static double radius(String[] S){
        int X = Integer.parseInt(S[0]);
        int Y = Integer.parseInt(S[1]);
        int Z = Integer.parseInt(S[2]);
        double r = Math.sqrt(X*X + Y*Y + Z*Z);
        return r;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int absDist = 0;
        while(true) {
            System.out.print("Введите координаты волка через пробел(ширина, долгота, высота): ");
            String[] coordWolf = scan.nextLine().split(" ");

            System.out.print("Введите координаты овцы через пробел: ");
            String[] coordSheep = scan.nextLine().split(" ");
            double rW = radius(coordWolf);
            double rS = radius(coordSheep);
            absDist = (int) Math.abs(rW - rS);

            if (absDist != 0){
                break;
            }
        }
        System.out.print("Введите здоровье волка (<=20): ");
        int hWolf = scan.nextInt();
        Wolf wolf = new Wolf(hWolf);

        System.out.println("Введите здоровье овцы (<=8): ");
        int hSheep = scan.nextInt();
        int sec = 0;
        while(hSheep >= 0){
            sec++;
            hSheep =  hSheep - wolf.attack(absDist);
        }
        System.out.println("нужно столько секунд: " + sec);
    }
}
