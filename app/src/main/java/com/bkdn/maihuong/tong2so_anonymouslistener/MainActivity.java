package com.bkdn.maihuong.tong2so_anonymouslistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvso1, tvso2, tvkq;
    Button btn_tong;
    EditText edt1,edt2;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.etA);
        edt2 = (EditText) findViewById(R.id.etB);
        tvkq = (TextView) findViewById(R.id.tv_kq);

        Button btn_tong = (Button) findViewById(R.id.btn_tong);
        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());
                int kq = a + b;
                tvkq.setText(kq + "");
            }

        });

    }

}
