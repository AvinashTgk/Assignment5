package com.example.avina.assignment5;

/**
 * Created by avina on 2/22/2017.
 */

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;




public class CameraMap2Activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap map2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        map2 = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng kansas = new LatLng(39, -94);
        map2.addMarker(new MarkerOptions().position(kansas).title("Marker in Kansas"));
        map2.moveCamera(CameraUpdateFactory.newLatLng(kansas));
    }
}