package com.example.asus.classroommanage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ASUS on 2018/4/29.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        final EditText account_num = (EditText) findViewById(R.id.num);
        final EditText password = (EditText) findViewById(R.id.pass);
        final CheckBox is_stu = (CheckBox) findViewById(R.id.check_stu);
        final CheckBox is_man = (CheckBox) findViewById(R.id.check_man);
        final Button login_but = (Button) findViewById(R.id.log_in);

        login_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = 0;
                if (account_num.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "学工号不能为空",Toast.LENGTH_SHORT).show();
                } else if (password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "密码不能为空",Toast.LENGTH_SHORT).show();
                } else if (is_stu.isChecked()) {
                    temp = 0;
                    Intent intent1 = new Intent(LoginActivity.this, MainActivity.class);
                    Bundle bundle1 = new Bundle();
                    bundle1.putInt("type", temp);
                    intent1.putExtras(bundle1);
                    startActivity(intent1);
                } else if (is_man.isChecked()) {
                    temp = 1;
                    Intent intent2 = new Intent(LoginActivity.this, MainActivity.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("type", temp);
                    intent2.putExtras(bundle2);
                    startActivity(intent2);
                }
            }
        });
    }
}
