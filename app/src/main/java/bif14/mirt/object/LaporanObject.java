package bif14.mirt.object;

/**
 * Created by makan on 08/10/2017.
 */

public class LaporanObject {
    private String judul;
    private String status;

    public LaporanObject() {
    }

    public LaporanObject(String judul, String status) {
        this.judul = judul;
        this.status = status;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
