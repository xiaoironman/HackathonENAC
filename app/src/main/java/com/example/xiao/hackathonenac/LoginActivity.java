package com.example.xiao.hackathonenac;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by RayanO on 15/05/2017.
 */

public class LoginActivity extends MainActivity{


    private EditText nameText, phoneNumberText;
    private LinearLayout loginBtnLoader;

    /*private void initUIViews() {
        // Initialize UserName Views
        nameText = (EditText) findViewById(R.id.login_name);

        // Initialize Password Views
        phoneNumberText = (EditText) findViewById(R.id.login_phone_number);

        // Initialize Login Btn Loader
        loginBtnLoader = (LinearLayout) findViewById(R.id.login_btn_loader);
    }*/

    public void onLoginButtonClick(View view) {
        // Check if Location Settings are enabled, if yes then attempt
        // DriverLogin
        checkForLocationSettings();
    }


}
