package com.hfad.foodorderapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
    Button button1, button2, button3, button4, button5, button6, button7, button8;
    String choices ="";
    Double price =0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
    }

    public void purchase(View view){
        if(view == findViewById(R.id.button1))
        {
            choices = choices+"Nasi Goreng"+"\n";
            price = price+3.20;
        }

        else if(view == findViewById(R.id.button2))
        {
            choices = choices+"Nasi Lemak"+"\n";
            price = price+3.00;
        }

        else if(view == findViewById(R.id.button3))
        {
            choices = choices+"Mee Goreng"+"\n";
            price = price+3.50;
        }

        else if(view == findViewById(R.id.button4))
        {
            choices = choices+"Curry Puffs"+"\n";
            price = price+1.60;
        }

        else if(view == findViewById(R.id.button5))
        {
            choices = choices+"Mineral Water"+"\n";
            price = price+2.00;
        }

        else if(view == findViewById(R.id.button6))
        {
            choices = choices+"Sirap Limau"+"\n";
            price = price+2.50;
        }

        else if(view == findViewById(R.id.button7))
        {
            choices = choices+"Lime Juice"+"\n";
            price = price+2.30;
        }

        else if(view == findViewById(R.id.button8))
        {
            choices = choices+"Teh Tarik"+"\n";
            price = price+3.00;
        }

    }

    public void order(View view){
        Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price", price);
        i.putExtras(bundle);
        startActivity(i);


    }

}



