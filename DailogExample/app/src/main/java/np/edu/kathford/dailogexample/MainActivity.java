package np.edu.kathford.dailogexample;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button logoutButton;
    private  Button customDialogButton;
    private Button dialogFragmentButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoutButton = findViewById(R.id.logoutButton);
        customDialogButton =findViewById(R.id.customDialogButton);
        dialogFragmentButton =findViewById(R.id.dialogFragmentButton);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutDialog();
            }
        });

        dialogFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogoutDialogFragment logoutDialogFragment = new LogoutDialogFragment();
                logoutDialogFragment.show(getSupportFragmentManager(),
                        "LogoutDialogFragment");

            }
        });

        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog();
            }
        });
    }
         private  void logoutDialog(){
             AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

             builder.setTitle("Logout");
             builder.setMessage("Are you sure want to logout");
             builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     Toast.makeText(MainActivity.this , "Ok button click vayo hai",
                             Toast.LENGTH_LONG).show();
                 }
             });
             builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     Toast.makeText(MainActivity.this ,"Cancel button click vayo hai",
                             Toast.LENGTH_SHORT).show();
                 }
             });
             AlertDialog alertDialog = builder.create();
             alertDialog.show();

         }
         private  void customDialog(){

             AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
             View view = getLayoutInflater().inflate(R.layout.
                     dialog_simpleintrest, null);

             EditText principalEditText = view.findViewById(R.id.principalEditText);
             EditText timeEditText = view.findViewById(R.id.timeEditText);
             EditText rateEditText = view.findViewById(R.id.rateEditText);
             Button calculateButton = view.findViewById(R.id.calculateButton);
             TextView resultTextview = view.findViewById(R.id.resultTextview);

             calculateButton.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     double principal = Double.parseDouble(principalEditText.getText().toString().trim());
                     double rate = Double.parseDouble(rateEditText.getText().toString().trim());
                     int time = Integer.parseInt(timeEditText.getText().toString().trim());

                     double simpleInterest = (principal*rate*time)/100;
                     resultTextview.setText("The Simple Interest is  :" + simpleInterest);
                 }
             });
             builder.setView(view);
             AlertDialog alertDialog = builder.create();
             alertDialog.show();
         }




}
