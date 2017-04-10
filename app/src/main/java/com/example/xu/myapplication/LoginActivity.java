package com.example.xu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText usernameEditText, passwordEditText;
    private Button username_clearButton, pwd_clearButton;
    private Button pwd_eyeButton;
    private Button uLoginButton, LoginerrorButton;
    private Button uRegisterButton;
    private TextWatcher username_watcher;
    private TextWatcher password_watcher;
    boolean ischecked;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        initWatcher();

        usernameEditText = (EditText) findViewById(R.id.username);
        passwordEditText = (EditText) findViewById(R.id.password);
        username_clearButton = (Button) findViewById(R.id.bt_username_clear);
        pwd_clearButton = (Button) findViewById(R.id.bt_pwd_clear);
        pwd_eyeButton = (Button) findViewById(R.id.bt_pwd_eye);
        username_clearButton.setOnClickListener(this);
        pwd_clearButton.setOnClickListener(this);
        pwd_eyeButton.setOnClickListener(this);

        usernameEditText.addTextChangedListener(username_watcher);
        passwordEditText.addTextChangedListener(password_watcher);
        uLoginButton = (Button) findViewById(R.id.login);
        LoginerrorButton = (Button) findViewById(R.id.login_error);
        uRegisterButton = (Button) findViewById(R.id.register);
        uLoginButton.setOnClickListener(this);
        LoginerrorButton.setOnClickListener(this);
        uRegisterButton.setOnClickListener(this);

    }

    private void initWatcher(){
        username_watcher = new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            public void beforeTextChanged(CharSequence s, int start, int count,int after) {}
            public void afterTextChanged(Editable s) {

                if(s.toString().length()>0){
                    username_clearButton.setVisibility(View.VISIBLE);
                }else{
                    username_clearButton.setVisibility(View.INVISIBLE);
                }
            }
        };

        password_watcher = new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            public void beforeTextChanged(CharSequence s, int start, int count,int after) {}
            public void afterTextChanged(Editable s) {

                if(s.toString().length()>0){
                    pwd_eyeButton.setVisibility(View.VISIBLE);
                    pwd_clearButton.setVisibility(View.VISIBLE);
                }else{
                    pwd_eyeButton.setVisibility(View.INVISIBLE);
                    pwd_clearButton.setVisibility(View.INVISIBLE);
                }
            }
        };
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_username_clear:
                usernameEditText.setText("");
                break;
            case R.id.bt_pwd_clear:
                passwordEditText.setText("");
                break;
            case R.id.bt_pwd_eye:
                if(ischecked){  //显示密码
                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    passwordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{    //隐藏密码
                    passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passwordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }   //每次显示或者关闭时，密码显示编辑的线统一在最后
                passwordEditText.setSelection(passwordEditText.length());
                break;
            case R.id.login:
                Intent intent = new Intent();
                intent.setClass(LoginActivity.this,PositionActivity.class);
                startActivity(intent);

                /*
                if(usernameEditText.getText().toString().equals("xu")&&passwordEditText.getText().toString().equals("123")){
                    Toast.makeText(getApplicationContext(),"登录成功",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getApplicationContext(),"登录失败",Toast.LENGTH_LONG).show();
                }*/
                break;
            case R.id.login_error:
                break;
            case R.id.register:
                break;

        }

    }


}
