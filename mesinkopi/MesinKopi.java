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
public class MesinKopi {
    private String jenisKopi;
    private String topping;
    private int jumlahStokKopi;
    
    public void setJenisKopi(String jenisKopi){
        this.jenisKopi = jenisKopi;
    }
    
    public void setTopping(String topping){
        this.topping = topping;
    }
    
    public void setJumlahStokKopi(int jumlahStokKopi){
        this.jumlahStokKopi = jumlahStokKopi;
    }
    
    public String getJenisKopi(){
        return jenisKopi;
    }
    
    public String getTopping(){
        return topping;
    }
    
    public int getJumlahStokKopi(){
        return jumlahStokKopi;
    }   
}