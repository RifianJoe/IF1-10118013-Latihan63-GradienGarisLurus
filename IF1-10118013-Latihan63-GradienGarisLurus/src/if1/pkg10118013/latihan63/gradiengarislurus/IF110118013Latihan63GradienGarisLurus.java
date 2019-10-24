/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan63.gradiengarislurus;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 * Deskripsi Program : Menghitung Gradiem Garis Lurus
 */
public class IF110118013Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
	System.out.printf("Garis yang melalui titik (%d, %d) dan (%d, %d) \nmemiliki gradien sebesar %d", koordinat1.getX1(), koordinat1.getY1(), koordinat1.getX2(), koordinat1.getY2(), koordinat1.hitungGradien());
	Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
	System.out.printf("\nGaris yang melalui titik (%d, %d) dan (%d, %d) \nmemiliki gradien sebesar %d\n", koordinat2.getX1(), koordinat2.getY1(), koordinat2.getX2(), koordinat2.getY2(), koordinat2.hitungGradien());
    }
    
}
