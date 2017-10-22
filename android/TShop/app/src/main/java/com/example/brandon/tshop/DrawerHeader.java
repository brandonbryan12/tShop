package com.example.brandon.tshop;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.brandon.tshop.R;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

@NonReusable
@Layout(R.layout.drawer_header)
public class DrawerHeader {

    @View(R.id.logoImageView)
    private ImageView logoImage;

    @Resolve
    private void onResolved() {
        //nameTxt.setText("Janishar Ali");
        //emailTxt.setText("janishar.ali@gmail.com");
    }
}