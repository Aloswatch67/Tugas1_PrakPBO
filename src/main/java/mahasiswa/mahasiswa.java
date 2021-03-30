/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author edlan
 */
import java.util.Scanner;
public class mahasiswa 
{
    static String nama, nim, usia;
    static float uts, uas;
    static Scanner sc = new Scanner(System.in);
    
    /*public mahasiswa()
    {
        isidata();
    }*/
    
    /**
     *
     */
    public void isidata()
    {
        System.out.println("|----Isi Data----|");
        System.out.println("Nama       : "); 
        mahasiswa.nama = sc.nextLine();
        System.out.println("NIM        : "); 
        mahasiswa.nim = sc.nextLine();
        System.out.println("Usia       : "); 
        mahasiswa.usia = sc.nextLine();
        System.out.println("Nilai UTS  : "); 
        mahasiswa.uts = sc.nextFloat();
        System.out.println("Nilai UAS  : "); 
        mahasiswa.uas = sc.nextFloat(); 
    }
    
    public void lihatdata()
    {
        var out = "Perkenalkan, nama saya " + mahasiswa.nama + ". NIM : " + mahasiswa.nim + ".";
        var varusia = "Usia = " + mahasiswa.usia;
        var na = "Nilai akhir : " + hitungRataRata(mahasiswa.uts, mahasiswa.uas);
        System.out.println(out);
        System.out.println(varusia);
        System.out.println(na);
    }
    
    private float hitungRataRata(float A, float B)
    {
        return (A+B)/2;
    }
}
