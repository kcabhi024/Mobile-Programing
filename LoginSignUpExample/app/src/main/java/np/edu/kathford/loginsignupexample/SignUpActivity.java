package np.edu.kathford.loginsignupexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {


    private EditText fullNameEditText, mobileNumberEditText,passwordEditText,cPasswordEditText;

    private RadioGroup genderRadioGroup;
    private Spinner nationalitySpinner;
    private CheckBox checkBox ;
    private Button buttonSignup;

    private  String fullName, mobileNumber, password,cPassword;
    private  String gender;
    private  String nationality;

    private  Boolean isTermsChecked = false ;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_signup);

        fullNameEditText = findViewById(R.id.fullNameEditText);
        mobileNumberEditText =findViewById(R.id.mobileNumberEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        cPasswordEditText =findViewById(R.id.cPasswordEditText);
        genderRadioGroup =findViewById(R.id.genderRadioGroup);
        nationalitySpinner = findViewById(R.id.nationalitySpinner);
        checkBox =findViewById(R.id.checkBox);
        buttonSignup =findViewById(R.id.buttonSignup);




        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fullName = fullNameEditText.getText().toString().trim();
                mobileNumber =mobileNumberEditText.getText().toString().trim();
                password = passwordEditText.getText().toString().trim();
                cPassword =cPasswordEditText.getText().toString().trim();


                if(!fullName.isEmpty() && !mobileNumber.isEmpty() && !password.isEmpty()
                && !cPassword.isEmpty() && !gender.isEmpty() && !nationality.isEmpty() && isTermsChecked){

                }
            }
        });

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {

                if(R.id.maleRadioButton == checkedId){
                    gender = "Male";
                } else if (R.id.femaleRadioButton == checkedId) {
                    gender ="Female";
                }else {
                    gender ="Others";
                }
            }
        });
        nationalitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
