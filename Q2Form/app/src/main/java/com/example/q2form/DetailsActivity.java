package com.example.q2form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    String name,address,dob,email,contact;
    TextView userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        userInfo=findViewById(R.id.user_info);
        name=getIntent().getStringExtra(MainActivity.NAME);
        address=getIntent().getStringExtra(MainActivity.ADDRESS);
        dob=getIntent().getStringExtra(MainActivity.DOB);
        email=getIntent().getStringExtra(MainActivity.EMAIL);
        contact=getIntent().getStringExtra(MainActivity.CONTACT);

        String userInfoString = "Name: " + name + "\n"
                + "Address: " + address + "\n"
                + "Date of Birth: " + dob + "\n"
                + "Email: " + email + "\n"
                + "Contact: " + contact + "\n";

        userInfo.setText(userInfoString);





    }
}