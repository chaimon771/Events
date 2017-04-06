package edu.haim.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText etShout;
    private Button btnShout;

    //3rd listener option at the Class level
    View.OnClickListener shoutListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            System.out.println("This text Will be written on Android Monitor");

            Toast.makeText(MainActivity.this, etShout.getText().toString().toUpperCase(), Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etShout = (EditText) findViewById(R.id.etShout);
        btnShout = (Button) findViewById(R.id.btnShout);


        btnShout.setOnClickListener(shoutListener);

        /*
        //1st option: Anonimeus class for one time use - genereted via compiler
        btnShout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "Hello, Events", Toast.LENGTH_SHORT).show();
            }
        });
        */

   /*
        //2nd option: another listener option
        btnShout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
         Toast.makeText(MainActivity.this, "Hello, Events", Toast.LENGTH_SHORT).show();
    }

    */

    }
}
