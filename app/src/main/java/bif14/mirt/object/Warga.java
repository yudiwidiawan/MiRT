package bif14.mirt.object;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by debi on 27/12/17.
 */

public class Warga {
    private String nik;
    private String namaKK;
    private String alamat;
    private String noHp;

    public Warga() {
    }

    public Warga(String nik, String namaKK, String alamat, String noHp) {
        this.nik = nik;
        this.namaKK = namaKK;
        this.alamat = alamat;
        this.noHp = noHp;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNamaKK() {
        return namaKK;
    }

    public void setNamaKK(String namaKK) {
        this.namaKK = namaKK;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("nik", nik);
        result.put("namaKK", namaKK);
        result.put("alamat", alamat);
        result.put("noHp", noHp);
        return result;

    }
}
