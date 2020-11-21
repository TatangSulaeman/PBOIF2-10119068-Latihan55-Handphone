/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.handphone.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Handphone
 * 
 */

public class Main {
    public static void main(String[]args){
        
        Android andro = new Android("Samsung", "Android","Grand",3000000);
        Blackberry bb = new Blackberry("BlackB", "RIM","Curve",2000000);
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8","Lumia",1000000);
        
        
        andro.setKeyStore("234ibfd3840fo");
        bb.setPinBB("BHS249");
        wp.setWpKeyStore("UUUQIJWORJ");
        
        String outputText =
                "Manufaktur : "+ andro.manufacture + "\n" +
                "OS : "+ andro.operatingSystem + "\n" +
                "Model : "+ andro.model + "\n" +
                "Harga : "+ andro.harga + "\n" +
                "Android Keystore : "+ andro.getKeyStore() + "\n" +
                "\n" +
                "Manufaktur : "+ bb.manufacture + "\n" +
                "OS : "+ bb.operatingSystem + "\n" +
                "Model : "+ bb.model + "\n" +
                "Harga : "+ bb.harga + "\n" +
                "PIN : "+ bb.getPinBB() + "\n" +
                "\n" +
                "Manufaktur : "+ wp.manufacture + "\n" +
                "OS : "+ wp.operatingSystem + "\n" +
                "Model : "+ wp.model + "\n" +
                "Harga : "+ wp.harga + "\n" +
                "WP Key store : "+ wp.getWpKeyStore() + "\n";
        
        System.out.println(outputText);
    }
}
