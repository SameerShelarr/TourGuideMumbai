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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_list_view, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.nationalpark, "Sanjay Gandhi National Park","Boriwali East, Mumbai."));
        places.add(new Place(R.drawable.mindspace, "Mindspace BMC Garden","Goregaon West, Mumbai."));
        places.add(new Place(R.drawable.kamalaneharu, "Kamla Nehru Park","Malabar Hill, Mumbai."));
        places.add(new Place(R.drawable.jijamataudyan, "Jijamata Udyan","Near Byculla Railway Station, Mumbai."));
        places.add(new Place(R.drawable.hanginggarden, "Hanging Garden","Malabar Hill, Mumbai."));
        places.add(new Place(R.drawable.chhotakashmir, "Chhota Kashmir","Arey Colony, Goregoan East, Mumbai."));
        places.add(new Place(R.drawable.hiranandanigarden, "Hiranandani Garden","Powai, Mumbai."));

        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), places);
        ListView mainListView = rootView.findViewById(R.id.listView);
        mainListView.setAdapter(placesAdapter);
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    Intent intent = new Intent(getContext(), NationalPark.class);
                    startActivity(intent);
                } else if (position == 1){
                    Intent intent = new Intent(getContext(), Mindspace.class);
                    startActivity(intent);
                } else if (position == 2){
                    Intent intent = new Intent(getContext(), KamalaNehruPark.class);
                    startActivity(intent);
                } else if (position == 3){
                    Intent intent = new Intent(getContext(), JijaMataUdyan.class);
                    startActivity(intent);
                } else if (position == 4){
                    Intent intent = new Intent(getContext(), HangingGarden.class);
                    startActivity(intent);
                } else if (position == 5){
                    Intent intent = new Intent(getContext(), ChhotaKashmir.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getContext(), HiranandaniGarden.class);
                    startActivity(intent);
                }
            }
        });

        return rootView;

    }

}
