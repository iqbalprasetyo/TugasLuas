package id.blits.LUAS;


public class mainmenu {
    public static void main(String[] args) 
    {
        System.out.println("LUAS PERSEGI");
        persegi hitung = new persegi();
        hitung.sisi= 5;
        hitung.HitungPersegi();
        System.out.println();
        
        System.out.println("\nLUAS LINGKARAN");
        lingkaran hasil = new lingkaran();
        hasil.r= 5;
        //hasil.phi=3.14;
        hasil.HitungLingkaran();
        System.out.println();
        
        System.out.println("\nLUAS SEGITIGA");
        segitiga segi = new segitiga();
        segi.alas = 6;
        segi.tinggi = 8;
        segi.HitungSegitiga();
        System.out.println();
        
        System.out.println("\nLUAS TRAPESIUM");
        trapesium trape = new trapesium();
        trape.jumlahSisiSejajar = 7;
        trape.tinggi = 4;
        trape.HitungTrapesium();
        System.out.println();
    }
    
}
