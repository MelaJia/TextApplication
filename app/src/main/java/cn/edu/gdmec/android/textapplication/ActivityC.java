package cn.edu.gdmec.android.textapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Button mbtn3 = (Button) findViewById(R.id.btn3);
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                EditText editText  = (EditText) findViewById(R.id.tv_edit);
                //获取edittext的值
                String val = editText.getText().toString();
                //将edittext的值添加到intent中
                data.putExtra("hello",val);
                //调用setResult方法，将intent对象data传回activity
                setResult(Activity.RESULT_OK,data);
                finish();
            }
        });
    }

}
