package id.ac.uniska;

import javax.swing.*;

public class DataType {
    public static void main(String[] args) {

        String namaDepan        = "Muhammad";
        String namaTengah       = "";
        String namaBelakang     = "Fauzi";
        int usia                = 21;
        int targetTahunKuliah   = 4;
        double ipk              = 3.9;
        char nilaiAbjad         = 'A';
        boolean tampan          = true;

        System.out.println("Nama Depan :" + namaDepan );
        System.out.println("Nama Tengah :" + namaTengah);
        System.out.println("Nama Belakang :" + namaBelakang);
        System.out.println("Usia : " + usia );
        System.out.println("Terget Kuliah : " + targetTahunKuliah+ "tahun");
        System.out.println("IPK :" + ipk);
        System.out.println("Nilai PBO : " + nilaiAbjad);
        System.out.println("Tampan " + tampan );

        JOptionPane.showMessageDialog(null, "Halo" + " " + namaDepan+ " " + namaTengah+ " " + namaBelakang,
                "Tampilan", JOptionPane.WARNING_MESSAGE );

    }
}
