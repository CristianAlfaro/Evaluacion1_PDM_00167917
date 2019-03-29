package com.cristianalfaro.evaluacion1_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout ly01, ly02, ly03, ly04, ly05, ly06, ly07, ly08, ly09;
    private TextView tv01, tv02, tv03, tv04, tv05, tv06, tv07, tv08, tv09;
    private EditText username, useremail;
    private Button btn_enviar;
    private int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv01 = findViewById(R.id.p_01);
        tv02 = findViewById(R.id.p_02);
        tv03 = findViewById(R.id.p_03);
        tv04 = findViewById(R.id.p_04);
        tv05 = findViewById(R.id.p_05);
        tv06 = findViewById(R.id.p_06);
        tv07 = findViewById(R.id.p_07);
        tv08 = findViewById(R.id.p_08);
        tv09 = findViewById(R.id.p_09);

        ly01 = findViewById(R.id.ly_01);
        ly02 = findViewById(R.id.ly_02);
        ly03 = findViewById(R.id.ly_03);
        ly04 = findViewById(R.id.ly_04);
        ly05 = findViewById(R.id.ly_05);
        ly06 = findViewById(R.id.ly_06);
        ly07 = findViewById(R.id.ly_07);
        ly08 = findViewById(R.id.ly_08);
        ly09 = findViewById(R.id.ly_09);

        username = findViewById(R.id.ed_user);
        useremail = findViewById(R.id.ed_email);

        btn_enviar = findViewById(R.id.btn_enviar);

        //BOTON 1

        ly01.setOnClickListener(v-> {
            int n = Integer.parseInt(tv01.getText().toString());
            total ++;
            n++;
            tv01.setText(Integer.toString(n));
        });

        //BOTON 2

        ly02.setOnClickListener(v-> {
            int n = Integer.parseInt(tv02.getText().toString());
            total ++;
            n++;
            tv02.setText(Integer.toString(n));
        });

        //BOTON 3

        ly03.setOnClickListener(v-> {
            int n = Integer.parseInt(tv03.getText().toString());
            total ++;
            n++;
            tv03.setText(Integer.toString(n));
        });

        //BOTON 4

        ly04.setOnClickListener(v-> {
            int n = Integer.parseInt(tv04.getText().toString());
            total ++;
            n++;
            tv04.setText(Integer.toString(n));
        });

        //BOTON 5

        ly05.setOnClickListener(v-> {
            int n = Integer.parseInt(tv05.getText().toString());
            total ++;
            n++;
            tv05.setText(Integer.toString(n));
        });

        //BOTON 6

        ly06.setOnClickListener(v-> {
            int n = Integer.parseInt(tv06.getText().toString());
            total ++;
            n++;
            tv06.setText(Integer.toString(n));
        });

        //BOTON 7

        ly07.setOnClickListener(v-> {
            int n = Integer.parseInt(tv07.getText().toString());
            total ++;
            n++;
            tv07.setText(Integer.toString(n));
        });

        //BOTON 8

        ly08.setOnClickListener(v-> {
            int n = Integer.parseInt(tv08.getText().toString());
            total ++;
            n++;
            tv08.setText(Integer.toString(n));
        });

        //BOTON 9

        ly09.setOnClickListener(v-> {
            int n = Integer.parseInt(tv09.getText().toString());
            total ++;
            n++;
            tv09.setText(Integer.toString(n));
        });

        btn_enviar.setOnClickListener(v -> {
            String user = username.getText().toString();
            String email = useremail.getText().toString();
            String p01 = tv01.getText().toString();
            String p02 = tv02.getText().toString();
            String p03 = tv03.getText().toString();
            String p04 = tv04.getText().toString();
            String p05 = tv05.getText().toString();
            String p06 = tv06.getText().toString();
            String p07 = tv07.getText().toString();
            String p08 = tv08.getText().toString();
            String p09 = tv09.getText().toString();
            String tot = Integer.toString(total);
            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra("user", user);
            mIntent.putExtra("email", email);
            mIntent.putExtra("p01", p01);
            mIntent.putExtra("p02", p02);
            mIntent.putExtra("p03", p03);
            mIntent.putExtra("p04", p04);
            mIntent.putExtra("p05", p05);
            mIntent.putExtra("p06", p06);
            mIntent.putExtra("p07", p07);
            mIntent.putExtra("p08", p08);
            mIntent.putExtra("p09", p09);
            mIntent.putExtra("total", tot);
            startActivity(mIntent);

        });

    }
}
