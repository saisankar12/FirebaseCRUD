package com.example.firebasecrud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText i_name,i_mail,i_pass,i_phone;
    Spinner i_college,i_branch;
    CheckBox i_android,i_java,i_python;
    RadioGroup i_gender;
    RadioButton i_male,i_female;

    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i_name=findViewById(R.id.s_name);
        i_mail=findViewById(R.id.s_mail);
        i_pass=findViewById(R.id.s_pass);
        i_phone=findViewById(R.id.s_phone);

        i_college=findViewById(R.id.s_college);
        i_branch=findViewById(R.id.s_branch);

        i_android=findViewById(R.id.android);
        i_java=findViewById(R.id.java);
        i_python=findViewById(R.id.python);

        i_gender=findViewById(R.id.gender);
        i_male=findViewById(R.id.male_gender);
        i_female=findViewById(R.id.female_gender);

        save=findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
