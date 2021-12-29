 package com.nabeel.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
    private TextView zakat;
    private EditText Amount;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zakat = (TextView) findViewById(R.id.zakat);
        Amount = (EditText) findViewById(R.id.Amount);
        calculate = (Button) findViewById(R.id.claculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float total_amount = Float.parseFloat(Amount.getText().toString());

                float calculate_zakat = total_amount/40;

                zakat.setText(Float.toString(calculate_zakat));

            }

        });
    }
}
