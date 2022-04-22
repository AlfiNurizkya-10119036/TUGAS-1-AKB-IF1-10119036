package com.example.tugas_1_akb_if1_10119036;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//nim : 10119036
//nama : Alfi Nurizkya
//kelas : IF1
//tanggal pengerjaan : 04-22-2022
public class RegisterActivity extends AppCompatActivity {
    private Button btnLogin1, btnRegister1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        btnLogin1 = findViewById(R.id.btn_login1);
        btnRegister1 = findViewById(R.id.btn_register1);

        btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnLogin1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
