package com.magic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rilixtech.widget.countrycodepicker.Country;
import com.rilixtech.widget.countrycodepicker.CountryCodePicker;

public class Register extends AppCompatActivity {
    CountryCodePicker countryCodePicker ;
    TextView textView1, textView2;
    Button button;
    EditText editText1,editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        textView1 = findViewById(R.id.code);
        editText1 = findViewById(R.id.register_Fullname);
        editText2 = findViewById(R.id.register_phone);
        editText3 = findViewById(R.id.register_Password);
        button = findViewById(R.id.register_submit);
        countryCodePicker = findViewById(R.id.ccp1);

        countryCodePicker.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected(Country selectedCountry) {
                textView1.setText(selectedCountry.getPhoneCode());
                String  countryCode = textView1.getText().toString();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView1.getText().toString().isEmpty()){
                    Toast.makeText(Register.this, "Please select country", Toast.LENGTH_SHORT).show();
                    textView1.setError("Country code is needed");
                }
                String string = countryCodePicker.getSelectedCountryCode();
                Toast.makeText(Register.this, string, Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void goToLogin(View view) {
        Intent intent = new Intent(Register.this, Login.class);
        startActivity(intent);
    }
}