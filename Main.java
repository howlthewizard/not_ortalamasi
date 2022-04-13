
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alper
 */
public class Main {
    public static void main(String[] args) {
        float mat;
        float fizik;
        float kimya;
        float turkce;
        float tarih;
        float muzik;
        float ortalama;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matemik not ortalamanızı giriniz:");
        mat = input.nextFloat();
        System.out.print("Fizik not ortalamanızı giriniz:");
        fizik = input.nextFloat();
        System.out.print("Kimya not ortalamanızı giriniz:");
        kimya = input.nextFloat();
        System.out.print("Türkçe not ortalamanızı giriniz:");
        turkce = input.nextFloat();
        System.out.print("Tarih not ortalamanızı giriniz:");
        tarih = input.nextFloat();
        System.out.print("Müzik not ortalamanızı giriniz:");
        muzik = input.nextFloat();
        
        ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6f;
        
        System.out.println("Ortalama:"+ortalama);
        
        String gecmeKalma = ortalama>60 ? "Geçti":"Kaldı";
        
        System.out.println(gecmeKalma);
    }
}
