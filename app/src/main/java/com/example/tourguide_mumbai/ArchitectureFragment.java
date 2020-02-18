package com.example.tourguide_mumbai;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArchitectureFragment extends Fragment {

    public ArchitectureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_list_view, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.gateway, "Gateway Of India","Apollo Bandar, Colaba, Mumbai."));
        places.add(new Place(R.drawable.cst, "CST Station","Fort, Mumbai."));
        places.add(new Place(R.drawable.hajiali, "Haji Ali Dargah","Dargah Road, Mumbai."));
        places.add(new Place(R.drawable.mountmarry, "Mount Mary Church","Mt Mary Rd, Bandra West, Mumbai."));
        places.add(new Place(R.drawable.nationalgallary, "National Gallery Of Modern Arts","Mahatma Gandhi Road, Fort, Mumbai."));
        places.add(new Place(R.drawable.pagoda, "Global Vipassana Pagoda","Global Pagoda Road, Gorai, Borivali West, Mumbai"));
        places.add(new Place(R.drawable.sealink, "Bandra-Worli Sea Link","Mahim Bay, Mumbai."));

        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(),places);
        ListView mainListView = rootView.findViewById(R.id.listView);
        mainListView.setAdapter(placesAdapter);
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    Intent intent = new Intent(getContext(), GateWayOfIndia.class);
                    startActivity(intent);
                } else if (position == 1){
                    Intent intent = new Intent(getContext(), CSTStation.class);
                    startActivity(intent);
                } else if (position == 2){
                    Intent intent = new Intent(getContext(), HajiAliDargah.class);
                    startActivity(intent);
                } else if (position == 3){
                    Intent intent = new Intent(getContext(), MountMaryChurch.class);
                    startActivity(intent);
                } else if (position == 4){
                    Intent intent = new Intent(getContext(), NationalGallary.class);
                    startActivity(intent);
                } else if (position == 5){
                    Intent intent = new Intent(getContext(), Pagoda.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getContext(), SeaLink.class);
                    startActivity(intent);
                }
            }
        });

        return mainListView;
    }

}
