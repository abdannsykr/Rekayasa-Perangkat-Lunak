/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datalatihan;

public class DataLatihan {
    private String Nama;
    private boolean JenisLatihan;
    private int WaktuLatihan;
    
    public DataLatihan(String Nama, boolean JenisLatihan, int WaktuLatihan){
        this.Nama = Nama;
        this.JenisLatihan = JenisLatihan;
        this.WaktuLatihan = WaktuLatihan;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public boolean getJenisLatihan(){
        return JenisLatihan;
    }
    
    public void setJenisLatihan(boolean JenisLatihan){
        this.JenisLatihan = JenisLatihan;
    }
    
    public int getWaktuLatihan(){
        return WaktuLatihan;
    }
    
    public void setWaktuLatihan(int WaktuLatihan){
        this.WaktuLatihan = WaktuLatihan;
    }
  
}
