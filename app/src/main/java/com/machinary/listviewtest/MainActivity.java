package com.machinary.listviewtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
                R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,"Entering "+fruit.getName()+"...",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,ItemActivity.class);
                intent.putExtra("extra_name",fruit.getName());
                intent.putExtra("extra_price",fruit.getPrice());
                startActivity(intent);
            }
        });
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple",R.drawable.apple_pic,2.99);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana",R.drawable.banana_pic,1.29);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange",R.drawable.orange_pic,0.99);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon",R.drawable.watermelon_pic,0.59);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear",R.drawable.pear_pic,1.19);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape",R.drawable.grape_pic,1.39);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple",R.drawable.pineapple_pic,1.89);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry",R.drawable.strawberry_pic,2.59);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry",R.drawable.cherry_pic,2.79);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango",R.drawable.mango_pic,2.19);
        fruitList.add(mango);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
