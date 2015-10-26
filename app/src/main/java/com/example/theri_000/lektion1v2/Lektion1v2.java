package com.example.theri_000.lektion1v2;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Theri_000 on 26-10-2015.
 */
public class Lektion1v2 extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        System.out.println("Works");
    }
}
