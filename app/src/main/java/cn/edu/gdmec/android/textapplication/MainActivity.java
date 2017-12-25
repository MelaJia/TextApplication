package cn.edu.gdmec.android.textapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mbtn1 = (Button) findViewById(R.id.btn1);
        Button mbtn2 = (Button) findViewById(R.id.btn2);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityB.class);
                startActivity(intent);
            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityC.class);
                startActivityForResult(intent,100);
            }

        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //判断requestCode是不是在startActivityForResult()方法设置的requestCode,并且是等于RESULT_OK
        if (requestCode == 100 && requestCode == Activity.RESULT_OK){
            //获取ac通过putExra方法存储的值
            String val = data.getExtras().getString("hello");
            TextView textView = (TextView) findViewById(R.id.tv_display);
            textView.setText("来自activityC的值:"+val);
        }
    }
}
