package com.example.toasty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
