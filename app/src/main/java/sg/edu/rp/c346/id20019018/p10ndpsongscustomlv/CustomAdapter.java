package sg.edu.rp.c346.id20019018.p10ndpsongscustomlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Song> SongList;

    public CustomAdapter(Context context, int resource, ArrayList<Song> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        SongList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvSinger = rowView.findViewById(R.id.textViewSinger);
        TextView tvSong = rowView.findViewById(R.id.textViewSong);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);

        // Obtain the Android Version information based on the position
        Song currentVersion = SongList.get(position);

        // Set values to the TextView to display the corresponding information
        tvSong.setText(currentVersion.getTitle());
        tvSinger.setText(currentVersion.getSingers());
        tvYear.setText(currentVersion.getYear() + "");

        ImageView star1 = rowView.findViewById(R.id.star1);
        ImageView star2 = rowView.findViewById(R.id.star2);
        ImageView star3 = rowView.findViewById(R.id.star3);
        ImageView star4 = rowView.findViewById(R.id.star4);
        ImageView star5 = rowView.findViewById(R.id.star5);

        int noStars = currentVersion.getStars();
        if(noStars == 1)
        {
            star1.setImageResource(R.drawable.yellowstar);
            star2.setImageResource(R.drawable.blackstar);
            star3.setImageResource(R.drawable.blackstar);
            star4.setImageResource(R.drawable.blackstar);
            star5.setImageResource(R.drawable.blackstar);
        }
        else if(noStars == 2)
        {
            star1.setImageResource(R.drawable.yellowstar);
            star2.setImageResource(R.drawable.yellowstar);
            star3.setImageResource(R.drawable.blackstar);
            star4.setImageResource(R.drawable.blackstar);
            star5.setImageResource(R.drawable.blackstar);
        }
        else if(noStars == 3)
        {
            star1.setImageResource(R.drawable.yellowstar);
            star2.setImageResource(R.drawable.yellowstar);
            star3.setImageResource(R.drawable.yellowstar);
            star4.setImageResource(R.drawable.blackstar);
            star5.setImageResource(R.drawable.blackstar);
        }
        else if(noStars == 4)
        {
            star1.setImageResource(R.drawable.yellowstar);
            star2.setImageResource(R.drawable.yellowstar);
            star3.setImageResource(R.drawable.yellowstar);
            star4.setImageResource(R.drawable.yellowstar);
            star5.setImageResource(R.drawable.blackstar);
        }
        else if(noStars == 5)
        {
            star1.setImageResource(R.drawable.yellowstar);
            star2.setImageResource(R.drawable.yellowstar);
            star3.setImageResource(R.drawable.yellowstar);
            star4.setImageResource(R.drawable.yellowstar);
            star5.setImageResource(R.drawable.yellowstar);
        }


        return rowView;
    }

}
