package com.example.q2form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,address,dob,email,contact;
    Button submit;

    public static String NAME="NAME";
    public static String ADDRESS="ADDRESS";
    public static String DOB="DOB";
    public static String EMAIL="EMAIL";
    public static String CONTACT="CONTACT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseViews();


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra(NAME,name.getText().toString());
                intent.putExtra(ADDRESS,address.getText().toString());
                intent.putExtra(DOB,dob.getText().toString());
                intent.putExtra(EMAIL,email.getText().toString());
                intent.putExtra(CONTACT,contact.getText().toString());

                startActivity(intent);
            }
        });
    }

    private void initialiseViews() {
        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        dob=findViewById(R.id.dob);
        email=findViewById(R.id.email);
        contact=findViewById(R.id.contact);
        submit=findViewById(R.id.submit);
    }
}