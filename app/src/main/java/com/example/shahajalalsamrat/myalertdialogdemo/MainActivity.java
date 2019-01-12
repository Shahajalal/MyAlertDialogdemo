package com.example.shahajalalsamrat.myalertdialogdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private AlertDialog.Builder alertdialogbuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.buttonid);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        alertdialogbuilder=new AlertDialog.Builder(this);

        alertdialogbuilder.setTitle(R.string.title_name);

        alertdialogbuilder.setMessage(R.string.alertMessage);

        alertdialogbuilder.setIcon(R.drawable.calculatorpic);
        alertdialogbuilder.setCancelable(false);

        alertdialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertdialogbuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog=alertdialogbuilder.create();
        alertDialog.show();

    }
}
