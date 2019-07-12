package com.example.toasty;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new Dialog(this);


    }

    public void errorToasty(View view) {
        Toasty.error(this, "Error Message", Toasty.LENGTH_LONG, true).show();

    }

    public void infoToasty(View view) {
        Toasty.info(this, "Information Message", Toasty.LENGTH_LONG, true).show();
    }

    public void warningToasty(View view) {
        Toasty.warning(this, "Warning Message", Toasty.LENGTH_LONG, true).show();
    }

    public void successToasty(View view) {
        Toasty.success(this, "Success Message", Toasty.LENGTH_LONG, true).show();
    }

    ///Starting......................................
    ///Method For Pop_Up Window and its Function
    public void Next_Page(View view) {

        TextView close;
        Button follow;
        dialog.setContentView(R.layout.pop_up);
        close = dialog.findViewById(R.id.txtClose);
        follow = dialog.findViewById(R.id.butFollow);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
    ///Ending......................................

}
