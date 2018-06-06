package com.example.asus.classroommanage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

/**
 * Created by ASUS on 2018/4/29.
 */

public class PassActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pass_change);
        final EditText newPass = (EditText) findViewById(R.id.new_pass);
        final EditText conPass = (EditText) findViewById(R.id.confirm_pass);
        final Button changeBut = (Button) findViewById(R.id.change_but);
        final Button cancelBut = (Button) findViewById(R.id.cancel_but);
        final SharedPreferences sharedPreF = this.getSharedPreferences("MY_PREFERENCE", Context.MODE_PRIVATE);
//        final String prePass = sharedPreF.getString("password", "");
//        final String PreHint = sharedPreF.getString("hint", "");
        final File file= new File("/data/data/"+getPackageName().toString()+"/shared_prefs","Activity.xml");
//        if (file.exists()) {
//            file.delete();
//        }
//        final SharedPreferences.Editor editor = sharedPreF.edit();

        changeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newPass.getText().toString().equals("")) {
                    Toast.makeText(PassActivity.this, "Password can not be empty", Toast.LENGTH_SHORT).show();
                } else if (newPass.getText().toString().equals(conPass.getText().toString())) {
                    String pass = newPass.getText().toString();
                    if (file.exists()) {
                        file.delete();
                    }
                    final SharedPreferences.Editor editor = sharedPreF.edit();
                    editor.putString("password", pass);
                    editor.commit();
                    Intent intent = new Intent(PassActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(PassActivity.this, "Password miss-match", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancelBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PassActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
