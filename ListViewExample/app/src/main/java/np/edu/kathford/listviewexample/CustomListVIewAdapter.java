package np.edu.kathford.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomListVIewAdapter extends ArrayAdapter<MovieModel>{
    private Context context;
    private  ArrayList<MovieModel> movieList;
    public  CustomListVIewAdapter(Context context, ArrayList<MovieModel>movieList)
    {
        super(context,0,movieList);
        this.context =context;
        this.movieList =movieList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_movie,parent,false);

            ImageView poster = convertView.findViewById(R.id.poster);
            TextView name =convertView.findViewById(R.id.name);
            TextView duration =convertView.findViewById(R.id.duration);
            TextView description =convertView.findViewById(R.id.description);

            MovieModel movieModel =movieList.get(position);
            name.setText(movieModel.getName());
            duration.setText(movieModel.getDuration());
            description.setText(movieModel.getDescription());
            Picasso.get().load(movieModel.getPoster()).into(poster);
        }
        return convertView;

    }
}
