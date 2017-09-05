package com.example.uefi.design;


import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class detaiLFragment extends Fragment {
    private ImageView imageViewbar;
    private TextView textView;
    View v;
   public static String name ;
    public static int photoId;
    public static String shortdescription;

    public detaiLFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_detai_l, container, false);
        imageViewbar = (ImageView) v.findViewById(R.id.app_bar_image);
        textView = (TextView) v.findViewById(R.id.notaid);
        //  imageViewbar.setImageResource(R.drawable.char2);
//        Picasso.with(getActivity()).load(photoId).into(imageViewbar);
        textView.setText(name);

        return v;
}

    @Override
    public void onAttach(Context context) {
      //  super.onAttach(context);
        Log.e("test2 " , ""+name);
         super.onAttach(context);
    }

    public  void getitem (Charity charity){
            photoId=charity.getPhotoid();
         name = charity.getName();
        Log.e("test1 " , ""+name);
       // textView.setText(charity.getName());

    }

}
