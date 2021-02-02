/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

/**
 *
 * @author MOKLET-2
 */
    public class kelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // object
    namasiswa hai = new namasiswa();
    
    // pengisian atribut
    String pelajar =  "Anya";
    int nilai =  80;

    //menjalankan  method
    hai.cetaknilai();

    //menentukan  lulus 
    if(nilai >= 75){
    System.out.println("selamat  anda  lulus");
    }
    else if(nilai < 74){
    System.out.println("Anda  harus  belajar  lebih  giat  lagi");
    }

    }
    

        
}    
    
    

