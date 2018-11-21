package com.agksoft.scanner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.agksoft.scanner.custom_views.EditTextExtended;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        final EditTextExtended editTextUPC = findViewById(R.id.editTextUPC);
        final EditTextExtended editTextSellingPrice = findViewById(R.id.editTextSellingPrice);
        final EditTextExtended editTextCost = findViewById(R.id.editTextCost);
        final EditTextExtended editTextDepartment = findViewById(R.id.editTextDepartment);
        final EditTextExtended editTextPriceGroup = findViewById(R.id.editTextPriceGroup);
        final EditTextExtended editTextDescription = findViewById(R.id.editTextDescription);
        final EditTextExtended editTextCRV = findViewById(R.id.editTextCRV);
        final EditTextExtended editTextUPCType = findViewById(R.id.editTextUPCType);
        Button buttonSave = (Button) findViewById(R.id.buttonSave);
        Button buttonCancel = (Button) findViewById(R.id.buttonCancel);

        buttonSave.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextUPC.validateLong();
                editTextUPC.getError();
                Item item = new Item(
                        editTextUPC.getText().toString(),
                        Double.valueOf(editTextSellingPrice.getText().toString()),
                        Double.valueOf(editTextCost.getText().toString()),
                        Integer.valueOf(editTextDepartment.getText().toString()),
                        Double.valueOf(editTextPriceGroup.getText().toString()),
                        editTextDescription.getText().toString(),
                        Double.valueOf(editTextCRV.getText().toString()),
                        Integer.valueOf(editTextUPCType.getText().toString()));

                System.out.println(item.toString());
            }
        }));

        setSupportActionBar(toolbar);
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
