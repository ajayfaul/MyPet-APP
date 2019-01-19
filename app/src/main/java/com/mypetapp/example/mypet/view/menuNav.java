package com.mypetapp.example.mypet.view;


import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.view.View;


import com.mypetapp.example.mypet.R;

public class menuNav extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_nav);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
       loadFragment(new Home_fragment());

//       onclick view

//        ImageView showRide = (ImageView) findViewById(R.id.settingicon);
//
//        showRide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(menuNav.this, Home_fragment.class));
//            }
//        });

    }




    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {

                case R.id.navigation_home:
                    loadFragment(new Home_fragment());
                    return true;

                case R.id.navigation_histori:
                    loadFragment(new histori_fragment());
                    return true;

                case R.id.navigation_profil:
                    loadFragment(new profil_fragment());
                    return true;


            }
            return false;
        }
    };

    void loadFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction();
        ft.replace(R.id.Fragment, fragment);
        ft.commit();

    }


    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
