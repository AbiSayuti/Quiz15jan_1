package com.abisayuti.quiz15jan_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etinput;
    Button btnsumbit;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etinput = (EditText) findViewById(R.id.etinput);
        btnsumbit = (Button) findViewById(R.id.btnSumbit);
        txtHasil = (TextView) findViewById(R.id.txthasil);

        btnsumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = etinput.getText().toString();

                if (number.isEmpty()){
                    etinput.setError("Jangan kosong");

                }else {
                    if (number.equalsIgnoreCase("0")) {
                        txtHasil.setText("null");
                    }else if (number.equalsIgnoreCase("1")) {
                        txtHasil.setText("not null");
                    } else if (number.equalsIgnoreCase("2")) {
                        txtHasil.setText("not null");
                    }  else if (number.equalsIgnoreCase("3")) {
                        txtHasil.setText("not null");
                    } else if (number.equalsIgnoreCase("3")) {
                        txtHasil.setText("not null");
                    }  else if (number.equalsIgnoreCase("4")) {
                        txtHasil.setText("not null");
                    }  else if (number.equalsIgnoreCase("5")) {
                        txtHasil.setText("not null");
                    }  else if (number.equalsIgnoreCase("6")) {
                        txtHasil.setText("not null");
                    } else if (number.equalsIgnoreCase("7")) {
                        txtHasil.setText("not null");
                    }  else if (number.equalsIgnoreCase("8")) {
                        txtHasil.setText("not null");
                    }  else if (number.equalsIgnoreCase("9")) {
                        txtHasil.setText("not null");
                    }  else {
                        txtHasil.setText("Silahkan masukkan nomor 1-9");
                    }

                }





            }

        });



    }
}
