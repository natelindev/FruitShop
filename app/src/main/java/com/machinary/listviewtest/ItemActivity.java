package com.machinary.listviewtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;


public class ItemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        Intent intent = getIntent();
        String fruitName = intent.getStringExtra("extra_name");
        Double fruitPrice = intent.getDoubleExtra("extra_price", 0D);
        ImageView imageView = (ImageView)findViewById(R.id.item_image);
        switch(fruitName){
            case "Apple":
                imageView.setImageResource(R.drawable.apple_hd);
                break;
            case "Orange":
                imageView.setImageResource(R.drawable.orange_hd);
                break;
            case "Grape":
                imageView.setImageResource(R.drawable.grape_hd);
                break;
            case "Cherry":
                imageView.setImageResource(R.drawable.cherry_hd);
                break;
            case "Pineapple":
                imageView.setImageResource(R.drawable.pineapple_hd);
                break;
            case "Mango":
                imageView.setImageResource(R.drawable.mango_hd);
                break;
            case "Strawberry":
                imageView.setImageResource(R.drawable.strawberry_hd);
                break;
            case "Watermelon":
                imageView.setImageResource(R.drawable.watermelon_hd);
                break;
            case "Banana":
                imageView.setImageResource(R.drawable.banana_hd);
                break;
            case "Pear":
                imageView.setImageResource(R.drawable.pear_hd);
                break;
            default:
                break;
        }
        TextView price = (TextView)findViewById(R.id.item_price);
        price.setText("$"+fruitPrice);
        TextView details = (TextView)findViewById(R.id.item_details);
        if(fruitPrice > 1)
            details.setText("These "+fruitName+"s"+" are"+" a little Expensive." +'\n'+
                    "But they are worth the price!" );
        else
            details.setText("These "+fruitName+"s"+" are"+" very cheap!" );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
