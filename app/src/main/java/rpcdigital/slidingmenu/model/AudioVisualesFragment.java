package rpcdigital.slidingmenu.model;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.navigationdrawerexample.R;

public class AudioVisualesFragment extends Fragment{

    public AudioVisualesFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_audio_visuales, container, false);

        return rootView;
    }


}
