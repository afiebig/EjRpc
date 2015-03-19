package rpcdigital.slidingmenu.model;

import android.app.Fragment;
import android.media.session.MediaController;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.example.android.navigationdrawerexample.R;

public class AudioVisualesFragment extends Fragment{

    public AudioVisualesFragment(){}


    private VideoView mVideoView;
    private MediaController mController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_audio_visuales, container, false);
        mVideoView = (VideoView) mVideoView.findViewById(R.id.videoViewav);
        mVideoView.setVideoPath("android.resource://res/drawable/"+R.drawable.video1);
        mVideoView.start();
        return rootView;
    }


}
