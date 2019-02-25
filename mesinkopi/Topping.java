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
public class Topping {
    private String jenisTopping;
    private  int jumlahStokTopping;
    
    public void setJenisTopping(String jenisTopping){
        this.jenisTopping = jenisTopping;
    }
    
    public void setJumlahStokTopping(int jumlahStokTopping){
        this.jumlahStokTopping = jumlahStokTopping;
    }
    
    public String getJenisTopping(){
        return jenisTopping;
    }
    
    public int jumlahStokTopping(){
        return jumlahStokTopping;
    }
}