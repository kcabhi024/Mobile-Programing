package np.edu.kathford.listviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MovieGridViewActicity extends AppCompatActivity {

private GridView gridView;

private String[] numbers = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView =findViewById(R.id.gridView);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
          this, android.R.layout.simple_list_item_1,numbers
        );

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String number = numbers[position];
                Toast.makeText(MovieGridViewActicity.this,number,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
