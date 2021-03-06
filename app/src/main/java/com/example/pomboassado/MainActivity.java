package com.example.pomboassado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void run(View view){
        String ramdomize1 = "MEU CHAPA.";
        String ramdomize2 = "BROW.";
        String ramdomize3 = "SANGUE BOM.";
        String ramdomize4 = "MEU QUERIDO.";
        String ramdomize5 = "DOIDÃO.";
        String ramdomize6 = "MEU BROTHER.";
        String ramdomize7 = "IRMÃOZINHO.";
        String ramdomize8 = "QUERIDÃO.";
        String ramdomize9 = "OXI.";
        String ramdomize10 = "MEU PARÇA.";

        ArrayList<String> expression = new ArrayList<>();
        expression.add(ramdomize1);
        expression.add(ramdomize2);
        expression.add(ramdomize3);
        expression.add(ramdomize4);
        expression.add(ramdomize5);
        expression.add(ramdomize6);
        expression.add(ramdomize7);
        expression.add(ramdomize8);
        expression.add(ramdomize9);
        expression.add(ramdomize10);

        String[] array = expression.toArray(new String[expression.size()]);

        int randomize = new Random().nextInt(10);

        TextView resultText = findViewById(R.id.result);
        TextView meat = findViewById(R.id.meat);
        TextView beer = findViewById(R.id.beer);

        String meatValue = meat.getText().toString();
        String beerValue = beer.getText().toString();


        float meatINT = Float.parseFloat(String.valueOf(meatValue));
        float beerINT = Float.parseFloat(String.valueOf(beerValue));


        if (meatINT < beerINT)
        {
            resultText.setText("LEVE A CARNE, "+ array[randomize]);
        } else if (meatINT > beerINT)
        {
            resultText.setText("LEVE A CERVEJA, "+ array[randomize]);
        } else if (meatINT == beerINT)
        {
            resultText.setText("LEVE O QUE QUISER! "+ array[randomize]);
        }



    }
}