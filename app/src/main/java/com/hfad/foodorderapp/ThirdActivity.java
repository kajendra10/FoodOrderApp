package com.hfad.foodorderapp;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {

    TextView orders, listView, priceView;
    String list_choice;
    Double price_inr, price_usd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpage);
        orders = (TextView) findViewById(R.id.orders);
        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);


        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_inr = bundle.getDouble("price");

        price_usd = price_inr / 4.170;

        listView.setText(list_choice);
        priceView.setText("RM"+ price_inr.toString());

    }
}