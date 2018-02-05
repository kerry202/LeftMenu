package com.ico.yk.mydemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements  AllInterface.OnMenuSlideListener{

    private LeftMenuFragment mMenuFragment;
    LeftDrawerLayout mLeftDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView menu_icon = (ImageView) findViewById(R.id.menu_icon);
        ImageView search_icon = (ImageView) findViewById(R.id.search_icon);

        mLeftDrawerLayout = (LeftDrawerLayout) findViewById(R.id.id_drawerlayout);
        FragmentManager fm = getSupportFragmentManager();
        mMenuFragment = (LeftMenuFragment) fm.findFragmentById(R.id.id_container_menu);
        mLeftDrawerLayout.setOnMenuSlideListener(this);
        if (mMenuFragment == null) {
            fm.beginTransaction().add(R.id.id_container_menu, mMenuFragment = new LeftMenuFragment()).commit();
        }


        search_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
            }
        });
        menu_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu();
            }
        });
    }


    public void openMenu() {
        mLeftDrawerLayout.openDrawer();
    }

    public void closeMenu() {
        mLeftDrawerLayout.closeDrawer();
    }


//        openMenu();
//        closeMenu();

    @Override
    public void onMenuSlide(float offset) {

    }
}
