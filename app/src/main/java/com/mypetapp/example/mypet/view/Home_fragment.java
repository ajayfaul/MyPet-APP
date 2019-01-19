package com.mypetapp.example.mypet.view;

<<<<<<< HEAD
<<<<<<< HEAD
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
=======
import android.content.Intent;
>>>>>>> master
=======
>>>>>>> parent of 47fb095... fitur klik
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
<<<<<<< HEAD
import android.widget.Button;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.mypetapp.example.mypet.R;

=======
>>>>>>> parent of 47fb095... fitur klik

import com.mypetapp.example.mypet.R;

public class Home_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmen_home, null);

<<<<<<< HEAD
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



    //Untuk membuat event klik dari butter knife gunakan @OnCLick(R.id.namaidview) terus kasih void klik()
    @OnClick(R.id.imgSeting)
    public void Klik(){
        Intent i=new Intent(getContext(),settingActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.notificon)
    public void KlikT(){
        Intent i=new Intent(getContext(),notifActivity.class);
        startActivity(i);
    }
=======
import android.widget.ImageButton;

import com.mypetapp.example.mypet.R;

public class Home_fragment extends Fragment{

    Intent intent;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_home, null);

        intent = new Intent(getActivity(), SettingsActivity.class);
        final ImageButton btnSetting = (ImageButton) view.findViewById(R.id.setting);

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });


        return view;
    }

}
>>>>>>> master

    @OnClick(R.id.imgpetgroming)
    public void Klik2(){
        Intent i=new Intent(getContext(),petgroomingActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.imgadoption)
    public void Klik3(){
        Intent i=new Intent(getContext(),adoptionActivity.class);
        startActivity(i);
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
        /**
         * @param uri
         */
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
=======
>>>>>>> parent of 47fb095... fitur klik
    }
}

