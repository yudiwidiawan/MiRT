package bif14.mirt;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

import bif14.mirt.object.Warga;

public class TambahWarga extends AppCompatActivity implements View.OnClickListener{


    private DatabaseReference mDBRef;
    private EditText edtNik, edtNamaKK, edtAlamat, edtNoHp;
    private Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_warga);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Firebase.setAndroidContext(this);
        mDBRef = FirebaseDatabase.getInstance().getReference();

        edtNik = (EditText) findViewById(R.id.edtNik);
        edtNamaKK = (EditText) findViewById(R.id.edtNamaKK);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtNoHp = (EditText) findViewById(R.id.edtNoHp);

        Button btnSimpan = (Button) findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = mDBRef.child("warga").push().getKey();
                String nik = edtNik.getText().toString();
                String nama = edtNamaKK.getText().toString();
                String alamat = edtAlamat.getText().toString();
                String nohp = edtNoHp.getText().toString();

                Warga warga = new Warga(nik, nama, alamat, nohp);
                Map<String, Object> wargaVal = warga.toMap();
                Map<String, Object> wargaUpdates = new HashMap<>();
                wargaUpdates.put("/warga/"+key, wargaVal);
                mDBRef.updateChildren(wargaUpdates);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
        }
    }
}
