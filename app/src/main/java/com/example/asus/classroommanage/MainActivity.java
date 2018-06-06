package com.example.asus.classroommanage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Bundle bundle1 = this.getIntent().getExtras();

        final Button view_class_stu = (Button) findViewById(R.id.view_class_stu);
        final Button view_appoint_stu = (Button) findViewById(R.id.view_appoint_stu);
        final Button pass_change_stu = (Button) findViewById(R.id.pass_change_stu);
        final Button pass_change_man = (Button) findViewById(R.id.pass_change_man);
        final Button view_class_man = (Button) findViewById(R.id.view_class_man);
        final Button view_require_man = (Button) findViewById(R.id.view_require_man);

        if (bundle1.getInt("type") == 0) {
            view_class_stu.setVisibility(View.VISIBLE);
            view_appoint_stu.setVisibility(View.VISIBLE);
            pass_change_stu.setVisibility(View.VISIBLE);
            view_class_man.setVisibility(View.INVISIBLE);
            view_require_man.setVisibility(View.INVISIBLE);
            pass_change_man.setVisibility(View.INVISIBLE);
        } else {
            view_class_stu.setVisibility(View.INVISIBLE);
            view_appoint_stu.setVisibility(View.INVISIBLE);
            pass_change_stu.setVisibility(View.INVISIBLE);
            view_class_man.setVisibility(View.VISIBLE);
            view_require_man.setVisibility(View.VISIBLE);
            pass_change_man.setVisibility(View.VISIBLE);
        }

        final Bundle bundle2 = new Bundle();
        bundle2.putInt("type", bundle1.getInt("type"));


        view_class_stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, );
                intent.putExtras(bundle2);
                startActivityForResult(intent, 1);
            }
        });

        view_appoint_stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, );
                intent.putExtras(bundle2);
                startActivityForResult(intent, 1);
            }
        });

        pass_change_stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, );
                intent.putExtras(bundle2);
                startActivityForResult(intent, 1);
            }
        });

        view_class_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, );
                intent.putExtras(bundle2);
                startActivityForResult(intent, 1);
            }
        });

        view_require_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, );
                intent.putExtras(bundle2);
                startActivityForResult(intent, 1);
            }
        });

        pass_change_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, );
                intent.putExtras(bundle2);
                startActivityForResult(intent, 1);
            }
        });
    }
}
