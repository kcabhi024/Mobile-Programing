package np.edu.kathford.dailogexample;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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


}
