package com.dalvikmx.bridgepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        AbstractSandwich openSandwich = new Sandwich("Jamon", "Queso", new OpenSandwich());
        openSandwich.make();

        AbstractSandwich closedSandwich = new Sandwich("Jamon", "Queso", new ClosedSandwich());
        closedSandwich.make();

    }
}
