package com.example.sergi.megumin;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link explotion.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class explotion extends Fragment {

    private OnFragmentInteractionListener mListener;

    //Objetos del fragment
    ImageButton imageButton;
    MediaPlayer mp;

    //Objetos utiles
    Activity currentActivity;
    Context currentContext;

    public explotion() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_explotion, container, false);

        //Obtenemos los datos de la activity que inicio el fragment
        System.out.println("Obteniendo datos de la activity");
        currentActivity = getActivity();
        currentContext = currentActivity.getApplicationContext();

        //inicializacion de objetos del fragment
        System.out.println("Inicializando parametros del fragment");
        imageButton = (ImageButton) v.findViewById(R.id.imageButton);
        mp = MediaPlayer.create(currentContext,R.raw.explosion);

        //Seteo de funciones del layout
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp.isPlaying()) {
                    System.out.println("Reproduciendo media");
                    mp.start();
                }else{
                    System.out.println("Deteniendo media");
                    mp.pause();
                }
            }
        });

        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
