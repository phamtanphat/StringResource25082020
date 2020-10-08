package com.example.stringresource25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEdtAccount,mEdtPassword;
    Button mBtnLogin;
    TextView mTvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtAccount = findViewById(R.id.edittextTaikhoan);
        mEdtPassword = findViewById(R.id.edittextMatkhau);
        mBtnLogin = findViewById(R.id.buttonDangnhap);
        mTvInfo = findViewById(R.id.textviewThongtin);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = mEdtAccount.getText().toString();
                String password = mEdtPassword.getText().toString();

                String textOutputAccount = getResources().getString(R.string.text_output_account);
                String textOutputPassword = getResources().getString(R.string.text_output_password);
                mTvInfo.setText(String.format("%s : %s \n%s : %s",textOutputAccount,account, textOutputPassword ,password));
            }
        });
    }
}