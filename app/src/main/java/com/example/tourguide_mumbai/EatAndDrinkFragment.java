package com.example.tourguide_mumbai;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatAndDrinkFragment extends Fragment {


    public EatAndDrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_list_view, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.arth, "Arth - Restaurant & Lounge","Bandra West, Mumbai."));
        places.add(new Place(R.drawable.aswaad, "Aaswad","Gokhale Road (North), Dadar West, Mumbai."));
        places.add(new Place(R.drawable.dakshinayan, "Dakshinayan Restaurant","Jukarwadi, Juhu, Mumbai."));
        places.add(new Place(R.drawable.gajalee, "Gajalee","Hanuman Road, Vile Parle East, Mumbai."));
        places.add(new Place(R.drawable.zaferbhais, "Jaffer Bhai’s Delhi Darbar","1st Marine Street Opp. Metro Gol Masjid, Mumbai."));
        places.add(new Place(R.drawable.shamiyana, "Shamiana","Apollo Bandar, Colaba, Mumbai."));
        places.add(new Place(R.drawable.thackers, "Shree Thaker Bhojanalay","Kalbadevi Road, Mumbai."));
        places.add(new Place(R.drawable.bombaycanteen, "The Bombay Canteen","Near Radio Mirchi Office, Lower Parel, Mumbai."));
        places.add(new Place(R.drawable.toasttonic, "Toast and Tonic","Bandra Kurla Complex, Bandra-East, Mumbai."));
        places.add(new Place(R.drawable.trishna, "Trishna","Kala Ghoda, Fort, Mumbai."));

        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), places);
        ListView mainListView = rootView.findViewById(R.id.listView);
        mainListView.setAdapter(placesAdapter);
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    Intent intent = new Intent(getContext(), Arth.class);
                    startActivity(intent);
                } else if (position == 1){
                    Intent intent = new Intent(getContext(), Aaswad.class);
                    startActivity(intent);
                } else if (position == 2){
                    Intent intent = new Intent(getContext(), Dakshinayan.class);
                    startActivity(intent);
                } else if (position == 3){
                    Intent intent = new Intent(getContext(), Gajalee.class);
                    startActivity(intent);
                } else if (position == 4){
                    Intent intent = new Intent(getContext(), DelhiDarbar.class);
                    startActivity(intent);
                } else if (position == 5){
                    Intent intent = new Intent(getContext(), Shamiana.class);
                    startActivity(intent);
                } else if (position == 6){
                    Intent intent = new Intent(getContext(), ThakerBhojanalay.class);
                    startActivity(intent);
                } else if (position == 7){
                    Intent intent = new Intent(getContext(), BombayCanteen.class);
                    startActivity(intent);
                } else if (position == 8){
                    Intent intent = new Intent(getContext(), ToastAndTonic.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getContext(), Trishna.class);
                    startActivity(intent);
                }
            }
        });

        return rootView;

    }

}
