package com.magic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.magic.myapplication.Models.userModel;
import com.magic.myapplication.Retrofit.APIClient;
import com.magic.myapplication.Retrofit.APIInterface;
import com.rilixtech.widget.countrycodepicker.Country;
import com.rilixtech.widget.countrycodepicker.CountryCodePicker;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText1, editText2;
    CountryCodePicker countryCodePicker;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        apiInterface = APIClient.getAPIClient().create(APIInterface.class);

        setContentView(R.layout.activity_login);
        button = findViewById(R.id.login_submit);
        textView = findViewById(R.id.login_code);
        editText1 = findViewById(R.id.login_phone);
        editText2= findViewById(R.id.loin_password);
        countryCodePicker = findViewById(R.id.login_ccp);
        countryCodePicker.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected(Country selectedCountry) {
                textView.setText(selectedCountry.getPhoneCode());
            }
        });

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                String s = countryCodePicker.getSelectedCountryCode();
//                if (textView.getText().toString().isEmpty()){
//                    Toast.makeText(Login.this, "Please select country code", Toast.LENGTH_SHORT).show();
//                    editText1.setError("Country code required");
//                }
//                else {
//                    //Toast.makeText(Login.this, s+" "+editText1.getText().toString(), Toast.LENGTH_SHORT).show();
//                    String number = s+editText1.getText().toString();
//                    String pass = editText2.getText().toString();
//
//
//                    Call<userModel> userModelCall = apiInterface.loginUser(number,pass);
//                    userModelCall.enqueue(new Callback<userModel>() {
//                        @Override
//                        public void onResponse(Call<userModel> call, Response<userModel> response) {
//                            if (response.body() != null){
//                                userModel model = response.body();
//                                if (model.isSuccess()){
//                                    Toast.makeText(Login.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
//                                    Intent intent = new Intent(Login.this, MainActivity.class);
//                                    startActivity(intent);
//                                }
//                                else {
//                                    Toast.makeText(Login.this, "User not found "+model.getMessage(), Toast.LENGTH_SHORT).show();
//                                }
//                            }
//
//                        }
//
//                        @Override
//                        public void onFailure(Call<userModel> call, Throwable t) {
//                            Toast.makeText(Login.this, "Error, Cannot connect", Toast.LENGTH_SHORT).show();
//                        }
//                    });
//                }
//            }
//        });

    }

    public void goToRegister(View view) {
        Intent intent = new Intent(Login.this, Register.class);
        startActivity(intent);
    }

    public void Tap(View view) {

        Toast.makeText(Login.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login.this, MainActivity.class);
                            startActivity(intent);


//        String s = countryCodePicker.getSelectedCountryCode();
//        if (textView.getText().toString().isEmpty()){
//            Toast.makeText(Login.this, "Please select country code", Toast.LENGTH_SHORT).show();
//            editText1.setError("Country code required");
//        }
//        else {
//            //Toast.makeText(Login.this, s+" "+editText1.getText().toString(), Toast.LENGTH_SHORT).show();
//            String number = s+editText1.getText().toString();
//            String pass = editText2.getText().toString();
//
//
//            Call<userModel> userModelCall = apiInterface.loginUser(number,pass);
//            userModelCall.enqueue(new Callback<userModel>() {
//                @Override
//                public void onResponse(Call<userModel> call, Response<userModel> response) {
//                    if (response.body() != null){
//                        userModel model = response.body();
//                        if (model.isSuccess()){
//                            Toast.makeText(Login.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(Login.this, MainActivity.class);
//                            startActivity(intent);
//                        }
//                        else {
//                            Toast.makeText(Login.this, "User not found "+model.getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//                    }
//
//                }
//
//                @Override
//                public void onFailure(Call<userModel> call, Throwable t) {
//                    Toast.makeText(Login.this, "Error, Cannot connect", Toast.LENGTH_SHORT).show();
//                }
//            });
//        }
    }


}