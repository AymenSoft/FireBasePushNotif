package com.businessologieplus.firebasepushnotif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "MainActivity";

    Button btnTocken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTocken=(Button)findViewById(R.id.btn_tocken);
        btnTocken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tocken = FirebaseInstanceId.getInstance().getToken();
                Log.e(Tag, tocken);
                Toast.makeText(MainActivity.this, tocken, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
