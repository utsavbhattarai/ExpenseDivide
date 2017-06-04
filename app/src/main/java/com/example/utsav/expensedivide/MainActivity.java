package com.example.utsav.expensedivide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button add_people;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //responds
        OnClickButtonListener();

    }


    // When Add People is pressed the activity changes to another activity
    public void OnClickButtonListener(){
        add_people = (Button)findViewById(R.id.add_people);
        add_people.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Add_People");
                        startActivity(intent);
                    }
                }
        );
    }
}
