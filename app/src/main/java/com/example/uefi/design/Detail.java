package com.example.uefi.design;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

public class Detail extends AppCompatActivity {
    private SliderLayout mDemoSlider;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        mDemoSlider = (SliderLayout)findViewById(R.id.slider);
        textView =(TextView) findViewById(R.id.textView3);


        Charity dame = (Charity) getIntent().getSerializableExtra("charity");

        TextSliderView textSliderView = new TextSliderView(this);
        textSliderView.image(dame.getPhotoid()) .setScaleType(BaseSliderView.ScaleType.Fit);
        TextSliderView textSliderView2 = new TextSliderView(this);
        textSliderView2.image(R.drawable.blolb).setScaleType(BaseSliderView.ScaleType.Fit);
        Toolbar   toolbar = (Toolbar) findViewById(R.id.toolbar6);
        toolbar.setTitle(" " +dame.getName());

        textView.setText(getResources().getString(R.string.large_text));

        mDemoSlider.addSlider(textSliderView2);
        mDemoSlider.addSlider(textSliderView);
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        setSupportActionBar(toolbar);
       // getSupportActionBar().setDisplayShowTitleEnabled(true);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
     /*   toolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        }); */
    }
}
