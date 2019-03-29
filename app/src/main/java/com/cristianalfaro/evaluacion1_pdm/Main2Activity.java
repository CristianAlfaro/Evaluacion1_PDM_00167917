package com.cristianalfaro.evaluacion1_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv01, tv02, tv03, tv04, tv05, tv06, tv07, tv08, tv09, user, email, total;
    private Button share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv01 = findViewById(R.id.pv_01);
        tv02 = findViewById(R.id.pv_02);
        tv03 = findViewById(R.id.pv_03);
        tv04 = findViewById(R.id.pv_04);
        tv05 = findViewById(R.id.pv_05);
        tv06 = findViewById(R.id.pv_06);
        tv07 = findViewById(R.id.pv_07);
        tv08 = findViewById(R.id.pv_08);
        tv09 = findViewById(R.id.pv_09);
        user = findViewById(R.id.tv_user);
        email = findViewById(R.id.tv_email);
        total = findViewById(R.id.tv_total);
        share = findViewById(R.id.btn_share);
        Intent sIntent = getIntent();
        if(sIntent != null){
            tv01.setText(sIntent.getStringExtra("p01"));
            tv02.setText(sIntent.getStringExtra("p02"));
            tv03.setText(sIntent.getStringExtra("p03"));
            tv04.setText(sIntent.getStringExtra("p04"));
            tv05.setText(sIntent.getStringExtra("p05"));
            tv06.setText(sIntent.getStringExtra("p06"));
            tv07.setText(sIntent.getStringExtra("p07"));
            tv08.setText(sIntent.getStringExtra("p08"));
            tv09.setText(sIntent.getStringExtra("p09"));
            user.setText(sIntent.getStringExtra("user"));
            email.setText(sIntent.getStringExtra("email"));
            total.setText(sIntent.getStringExtra("total"));

        }

        share.setOnClickListener(v -> {
            String username = user.getText().toString();
            String useremail = email.getText().toString();
            String tot = total.getText().toString();
            String Datos = "cliente "+username+" con correo " + useremail + " compro la siguiente cantidad de productos "+ tot;
            Intent mIntent = new Intent();
            mIntent.setType("text/plain");
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.putExtra(Intent.EXTRA_TEXT, Datos);
            startActivity(mIntent);
        });
    }
}
