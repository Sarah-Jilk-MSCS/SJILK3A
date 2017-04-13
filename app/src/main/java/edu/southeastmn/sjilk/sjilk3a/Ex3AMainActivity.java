package edu.southeastmn.sjilk.sjilk3a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//imports for Buttons & EditText Controls
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class Ex3AMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3_amain);
        // ---------- whileButton event handler ----------
        Button whileButton = (Button) findViewById(R.id.whileButton);

        whileButton.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v) {
                do_whileButton_onClick(v);
            }
        });

        // ---------- doWhileButton event handler ----------
        Button doWhileButton = (Button) findViewById(R.id.doWhileButton);

        doWhileButton.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v) {
                do_doWhileButton_onClick(v);
            }
        });

        // ---------- forButton event handler ----------
        Button forButton = (Button) findViewById(R.id.forButton);

        forButton.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v) {
                do_forButton_onClick(v);
            }
        });
    }
    protected void do_whileButton_onClick(View v) {
        // Get references to EditText boxes
        EditText loopMaxEditText = (EditText) findViewById(R.id.loopMaxEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.loopResultEditText);

        // Get user's input
        int max = Integer.parseInt(loopMaxEditText.getText().toString());

        //Display result
        Loops loops = new Loops(max);
        loopResultEditText.setText(loops.whileLoop());
    }

    protected void do_doWhileButton_onClick(View v) {
        // Get references to EditText boxes
        EditText loopMaxEditText = (EditText) findViewById(R.id.loopMaxEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.loopResultEditText);

        // Get user's input
        int max = Integer.parseInt(loopMaxEditText.getText().toString());

        //Display result
        Loops loops = new Loops(max);
        loopResultEditText.setText(loops.doWhileLoop());
    }

    protected void do_forButton_onClick(View v) {
        // Get references to EditText boxes
        EditText loopMaxEditText = (EditText) findViewById(R.id.loopMaxEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.loopResultEditText);

        // Get user's input
        int max = Integer.parseInt(loopMaxEditText.getText().toString());

        //Display result
        Loops loops = new Loops(max);
        loopResultEditText.setText(loops.forLoop());
    }

}
