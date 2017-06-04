package com.example.utsav.expensedivide;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.firebase.client.Firebase;


public class Add_People extends AppCompatActivity {
    private LinearLayout parentLinearLayout;
    private Button saveDataFireBase;
    private Firebase mRef;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_people);
        parentLinearLayout = (LinearLayout) findViewById(R.id.parent_linear_layout);

        //Save data in firebase -----------------------------------------------------------

        saveDataFireBase = (Button)findViewById(R.id.addOnePeople);
        mRef = new Firebase("https://expensedivide.firebaseio.com/");
        Firebase.setAndroidContext(this);

    }
    public void onAddField(View v) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.field, null);
        // Add the new row before the add field button.
        parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount() - 1);
    }

    public void onDelete(View v) {
        parentLinearLayout.removeView((View) v.getParent());
    }

    //When the + button is clicked the data are saved into the database
    public void onAdd(View v){
        Firebase mrefChild = mRef.child("Name: ");
        mrefChild.setValue("Utsav Bhattarai");



    }

}
