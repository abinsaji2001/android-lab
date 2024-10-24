package com.example.text;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView et3,et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        et1=(EditText)findViewById(R.id.editTextText);
        et2=(EditText) findViewById(R.id.editTextText2);

    }
    public void submit(View view) {
        et3=(TextView) findViewById(R.id.t1);
        et4=(TextView) findViewById(R.id.t2);
        double num2 =Double.parseDouble(et1.getText().toString());
        double num3 =Double.parseDouble(et2.getText().toString());

        et3.setText(""+num2);
        et4.setText(""+num3);





    }

    public void cancel(View view) {
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");

    }
}