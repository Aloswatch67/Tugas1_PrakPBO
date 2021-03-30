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
public class main 
{
    static String nama, nim, usia;
    static float uts, uas;
    
    public static void main(String[] args)
    {
        int repeat = 1, pilihan;
        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.isidata();
        
        while (repeat == 1)
        {
            System.out.println("\n|----Opsi----|");
            System.out.println("1. Lihat Data");
            System.out.println("2. Ubah Data");
            System.out.println("3. keluar");
            System.out.println("Silahkan pilih (1, 2, 3): ");
            pilihan = mahasiswa.sc.nextInt();
            System.out.println("\n");
            mahasiswa.sc.nextLine();
            
            switch(pilihan)
            {
                case 1 -> 
                {
                    mahasiswa.lihatdata();
                }
                    
                case 2 -> 
                {
                    mahasiswa.isidata();
                }
                    
                case 3 -> 
                {
                    repeat = 0;
                    System.exit(repeat);
                }
            }
        }
    }
}
