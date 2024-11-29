package datalatihan;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerLatihan {
    private ArrayList<ModelLatihan> arrayData; 
    private DefaultTableModel tableList;

    public ControllerLatihan() {
        arrayData = new ArrayList<ModelLatihan>();
        
        String[] columnNames = {"Nama", "Jenis Latihan", "Waktu Latihan (menit)"};
        tableList = new DefaultTableModel(columnNames, 0);
    }

    public void insertData(String nama, boolean jenisLatihan, int waktuLatihan) {
        ModelLatihan lth = new ModelLatihan(nama, jenisLatihan, waktuLatihan); 
        arrayData.add(lth); 

        String jenis = jenisLatihan ? "Jenis 1" : "Jenis 2";
        tableList.addRow(new Object[]{nama, jenis, waktuLatihan}); 
    }

    public DefaultTableModel getTableList() {
        return tableList; 
    }

    public ArrayList<ModelLatihan> getData() {
        return arrayData; 
    }

    // Kelas ModelLatihan
    private static class ModelLatihan {
        private String Nama;
        private boolean JenisLatihan;
        private int WaktuLatihan;

        // Konstruktor untuk ModelLatihan
        public ModelLatihan(String nama, boolean jenisLatihan, int waktuLatihan) {
            this.Nama = nama;
            this.JenisLatihan = jenisLatihan;
            this.WaktuLatihan = waktuLatihan;
        }

        public String getNama() {
            return Nama;
        }

        public boolean isJenisLatihan() {
            return JenisLatihan;
        }

        public int getWaktuLatihan() {
            return WaktuLatihan;
        }
    }
}
