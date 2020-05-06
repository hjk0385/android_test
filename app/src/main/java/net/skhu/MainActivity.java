package net.skhu;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = (Button) findViewById(R.id.button3) ;
        button3.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View view) {
        if(view.getId()==R.id.button3){
            Intent intent=new Intent(this, Exam3Activity.class);
            startActivity(intent);
        }
    }
}