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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_list_view, container,false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.bookmarket, "Book Street","Flora Fountain, Fort, Mumbai."));
        places.add(new Place(R.drawable.chorbazar, "Chor Bazaar","Mohammad Ali Road, South Mumbai."));
        places.add(new Place(R.drawable.colabacauseway, "Colaba Causeway","Colaba Causeway, South Mumbai."));
        places.add(new Place(R.drawable.crawfordmarket, "Crawford Market","Fort, Mumbai."));
        places.add(new Place(R.drawable.dadarflower, "Dadar Flower Market","Tulsi Pipe Road, Dadar Station, Mumbai."));
        places.add(new Place(R.drawable.dharavileather, "Dharavi Leather Market","Sion-Bandra Link Road, Dharavi, Sion, Mumbai."));
        places.add(new Place(R.drawable.fassionstreet, "Fashion Street","MG Road, Mumbai."));
        places.add(new Place(R.drawable.kalaghodaart, "Kala Ghoda Art Plaza","MG Road, Fort, Mumbai."));
        places.add(new Place(R.drawable.linkroad, "Linking Road","Linking Road, Bandra West, Mumbai."));
        places.add(new Place(R.drawable.sassoondock, "Sassoon Docks Fish Market","Azad Nagar, Colaba, Mumbai."));
        places.add(new Place(R.drawable.zaveribazar, "Zaveri Bazaar","Dana Bandar, Mandvi, Mumbai."));

        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), places);
        ListView mainListView = rootView.findViewById(R.id.listView);
        mainListView.setAdapter(placesAdapter);
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    Intent intent = new Intent(getContext(), BookStreet.class);
                    startActivity(intent);
                } else if (position == 1){
                    Intent intent = new Intent(getContext(), ChorBazar.class);
                    startActivity(intent);
                } else if (position == 2){
                    Intent intent = new Intent(getContext(), ColabaCauseway.class);
                    startActivity(intent);
                } else if (position == 3){
                    Intent intent = new Intent(getContext(), CrawfordMarket.class);
                    startActivity(intent);
                } else if (position == 4){
                    Intent intent = new Intent(getContext(), DadarFlowerMarket.class);
                    startActivity(intent);
                } else if (position == 5){
                    Intent intent = new Intent(getContext(), DharaviLeatherMarket.class);
                    startActivity(intent);
                } else if (position == 6){
                    Intent intent = new Intent(getContext(), FasionStreet.class);
                    startActivity(intent);
                } else if (position == 7){
                    Intent intent = new Intent(getContext(), KalaGhodaArt.class);
                    startActivity(intent);
                } else if (position == 8){
                    Intent intent = new Intent(getContext(), LinkingRoad.class);
                    startActivity(intent);
                } else if (position == 9){
                    Intent intent = new Intent(getContext(), SassoonDocks.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getContext(), ZaveriBazar.class);
                    startActivity(intent);
                }
            }
        });

        return rootView;

    }

}
