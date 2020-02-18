package com.example.tourguide_mumbai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Place> {


    public PlacesAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_list_view_item, parent, false);
        }

        Place currentPlace = getItem(position);

        ImageView listItemImageView = listItemView.findViewById(R.id.list_image_view);
        if (currentPlace != null) {
            listItemImageView.setImageResource(currentPlace.getImageResourceId());
        }

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        if (currentPlace != null) {
            titleTextView.setText(currentPlace.getPlaceName());
        }

        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);
        if (currentPlace != null) {
            addressTextView.setText(currentPlace.getPlaceAddress());
        }

        return listItemView;
    }
}
