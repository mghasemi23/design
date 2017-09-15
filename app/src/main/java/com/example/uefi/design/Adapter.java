package com.example.uefi.design;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.like.LikeButton;
import com.like.OnLikeListener;
import com.makeramen.roundedimageview.RoundedTransformationBuilder;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.util.List;

/**
 * Created by uefi on 8/29/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.holder> {
    Context context;
    List<Charity> charityList;
    private Hamal hamal;
    private OnItemClick handler;


    public void setListener(Hamal hamal){
        this.hamal=hamal;
    }

    public Adapter(List<Charity> charities,OnItemClick handler){
        charityList=charities;
        this.handler = handler;
    }

    @Override
    public Adapter.holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row,parent,false);
        holder Hold = new holder(itemView);
        return Hold;
    }


    @Override
    public void onBindViewHolder(final Adapter.holder holder, int position) {
                final Charity charity = charityList.get(position);
                holder.Name.setText(charity.getName());
                holder.song.setText(charity.getShortdescription());
                    if (charity.isFav() == true)  holder.likeButton.setLiked(true);
                holder.likeButton.setOnLikeListener(new OnLikeListener() {
                    @Override
                    public void liked(LikeButton likeButton) {
                        charity.setFav(true);
                    }

                    @Override
                    public void unLiked(LikeButton likeButton) {
                        charity.setFav(false);
                    }
                });


              holder.cv.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      handler.onItemClicked(charity);
                  }
              });
        Transformation transformation = new RoundedTransformationBuilder()
                .borderColor(Color.BLACK)
                .borderWidthDp(2)
                .cornerRadiusDp(15 )
                .oval(false)
                .build();
        Picasso.with(holder.itemView.getContext()).load(charity.getPhotoid()).transform(transformation).into(holder.Photo);
    }

    @Override
    public int getItemCount() {
        return charityList.size();
    }



    public class holder extends RecyclerView.ViewHolder  implements View.OnClickListener{

            CardView cv;
            TextView Name;
            TextView song;
            ImageView Photo;
            LikeButton likeButton;
          //  RatingBar ratingBar;
            holder(View itemView) {
                super(itemView);
                cv = (CardView) itemView.findViewById(R.id.cv);
                Name = (TextView) itemView.findViewById(R.id.nameofcharity);
                song = (TextView) itemView.findViewById(R.id.nameof_song);
                Photo = (ImageView) itemView.findViewById(R.id.imageView);
                likeButton = (LikeButton) itemView.findViewById(R.id.heart);
               // ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
            }

        @Override
        public void onClick(View v) {
           Log.i("tapped " , "my time now");
        }
    }

    public interface OnItemClick{
        void onItemClicked(Charity charity);
    }



}
