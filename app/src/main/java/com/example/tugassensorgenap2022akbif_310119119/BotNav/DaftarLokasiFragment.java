package com.example.tugassensorgenap2022akbif_310119119.BotNav;

//Nama  : Muhammad Hadyan Nur Adabi
//NIM   : 10119119
//Kelas : IF-3

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugassensorgenap2022akbif_310119119.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class DaftarLokasiFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        @Override
        public void onMapReady(@NonNull GoogleMap googleMap) {
            // LOKASI 1
            LatLng ketoprak = new LatLng(-6.863111364805326, 107.5279432890689);
            googleMap.addMarker(new MarkerOptions().position(ketoprak).title("Lokasi 1: Ketoprak Om Deden"));

            // LOKASI 2
            LatLng buburayam = new LatLng(-6.86192366996826, 107.52996567466408);
            googleMap.addMarker(new MarkerOptions().position(buburayam).title("Lokasi 2: Bubur Ayam"));

            // LOKASI 3
            LatLng seblak = new LatLng(-6.863063431010456, 107.52848509529427);
            googleMap.addMarker(new MarkerOptions().position(seblak).title("Lokasi 3: Seblak Rindu"));

            // LOKASI 4
            LatLng bakery = new LatLng(-6.862892999640809, 107.52150062302356);
            googleMap.addMarker(new MarkerOptions().position(bakery).title("Lokasi 4: R&R Bakery"));

            // LOKASI 5
            LatLng rotibakar = new LatLng(-6.861694652275213, 107.51948896626146);
            googleMap.addMarker(new MarkerOptions().position(rotibakar).title("Lokasi 5: Roti Bakar Milenial"));

            // Zoom
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bakery, 16));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_daftar_lokasi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.maps);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}

