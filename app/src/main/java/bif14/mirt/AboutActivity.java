package bif14.mirt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutActivity extends AppCompatActivity {

    String [] menuAbout = {"Syarat & Ketentuan", "Tentang Kami", "Kontak"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menuAbout);

        ListView listView = (ListView) findViewById(R.id.lvAbout);
        listView.setAdapter(adapter);
    }
}
