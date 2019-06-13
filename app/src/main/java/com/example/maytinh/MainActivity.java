package com.example.maytinh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnac,btncong,btntru,btnnhan,btnchia,btnthoat;
    EditText txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnac=(Button)findViewById(R.id.btnac);
        txt1=(EditText)findViewById(R.id.txt1);
        txt2=(EditText)findViewById(R.id.txt2);
        txt3=(EditText)findViewById(R.id.txt3);
        btntru=(Button)findViewById(R.id.btntru);
        btnnhan=(Button)findViewById(R.id.btnnhan);
        btnthoat=(Button)findViewById(R.id.btnthoat);
        btnchia=(Button)findViewById(R.id.btnchia);
        btncong=(Button)findViewById(R.id.btncong);
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sa=txt1.getText()+"";

                String sb=txt2.getText().toString();

                int a=Integer.parseInt(sa);

                int b=Integer.parseInt(sb);

                txt3.setText(a+" - "+b +" = "+(a-b));


            }
        });
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sa=txt1.getText()+"";

                String sb=txt2.getText().toString();

                int a=Integer.parseInt(sa);

                int b=Integer.parseInt(sb);

                txt3.setText(a+" * "+b +" = "+(a*b));


            }
        });
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sa=txt1.getText()+"";

                String sb=txt2.getText().toString();

                int a=Integer.parseInt(sa);

                int b=Integer.parseInt(sb);

                txt3.setText(a+" / "+b +" = "+(a/b));

            }
        });
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sa=txt1.getText()+"";

                String sb=txt2.getText().toString();

                int a=Integer.parseInt(sa);

                int b=Integer.parseInt(sb);

                txt3.setText(a+" + "+b +" = "+(a+b));


            }
        });
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        });

    }
}
