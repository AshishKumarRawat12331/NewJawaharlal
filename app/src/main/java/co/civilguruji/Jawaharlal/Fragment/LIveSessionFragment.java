package co.civilguruji.Jawaharlal.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import Jawaharlal.R;

public class LIveSessionFragment extends Fragment  {

    LinearLayout course,enrolled;
    View v1,v2;
    TextView Course_tv,Enrolled_tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
///   commingsoon.jpg
        View v= inflater.inflate(R.layout.fragment_live_session, container, false);

       // Getid(v);

        return v;


    }


}