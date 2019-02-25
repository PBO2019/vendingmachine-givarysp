/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesinkopi;

/**
 *
 * @author GIVARY
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> kopi = new ArrayList<String>();
        ArrayList<String> topping = new ArrayList<String>();

        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());
        robusta.setTopping("Gula");
        topping.add(robusta.getTopping());
        
        MesinKopi arabica = new MesinKopi();
        arabica.setJenisKopi("Arabica");
        arabica.setJumlahStokKopi(10);
        kopi.add(arabica.getJenisKopi());
        arabica.setTopping("Susu");
        topping.add(arabica.getTopping());
        
        MesinKopi flores = new MesinKopi();
        flores.setJenisKopi("Flores");
        flores.setJumlahStokKopi(5);
        kopi.add(flores.getJenisKopi()); 
        flores.setTopping("Cream");
        topping.add(flores.getTopping());
        
	for(int i = 0; i < kopi.size(); i++){
            int j = i+1;
            System.out.println("Menu kopi adalah "+j+". "+kopi.get(i));                    
        }
        
        for(int i = 0; i < kopi.size(); i++){
            int j = i+1;
            System.out.println("Menu topping adalah "+j+". "+topping.get(i));                    
        }
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih = ");
        int pilihanKopi = keyboard.nextInt() -1;
        System.out.println("Masukan topping yang mau dipilih = ");
        int pilihanTopping = keyboard.nextInt() -1;
        System.out.println("Pesanan anda adalah kopi "+kopi.get(pilihanKopi)+" dengan topping "+topping.get(pilihanTopping));
    }
}
