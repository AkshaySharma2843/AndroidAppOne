package com.c.androidappone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText username;
    private EditText password;
    private Button click;
    String useMobileNo ="96171528430";
    String userPassword = "akshay";
    private Button unclicku;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        //initClick();
    }

   /* private void initClick() {
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fromUserMobile = username.getText().toString();
                String fromPassword = password.getText().toString();
                if(fromUserMobile.equals(useMobileNo)&&fromPassword.equals(userPassword)){
                    Toast.makeText(MainActivity.this,"User Verified",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid User", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
*/
    private void initViews() {
    username = findViewById(R.id.et_email);
    password = findViewById(R.id.et_password);
    click = findViewById(R.id.btn_click);
    textView = findViewById(R.id.textView);
    click.setOnClickListener(this);
    unclicku = findViewById(R.id.btn_unClick);
    unclicku.setOnClickListener(this);
    textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_click:
                String fromUserMobile = username.getText().toString();
                String fromPassword = password.getText().toString();
                if(fromUserMobile.equals(useMobileNo)&&fromPassword.equals(userPassword)){
                    Toast.makeText(MainActivity.this,"User Verified",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid User", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_unClick:
                Toast.makeText(this, "UnClicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView:
                Toast.makeText(this, "Please Login", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
