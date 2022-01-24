package co.civilguruji.Jawaharlal.Fragment.SubFragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;
import android.webkit.WebView;
import android.widget.TextView;

import co.civilguruji.Jawaharlal.ApiRespose.SetChannelVideo;
import Jawaharlal.R;
import co.civilguruji.Jawaharlal.Utils.ApplicationConstant;

public class CoursesDetailFragment extends Fragment {

    SetChannelVideo operator;
    TextView tittle;
    WebView webview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_detail_courses, container, false);


        GetId(v);

        return v;

    }

    private void GetId(View v) {

        tittle=v.findViewById(R.id.tittle);
        webview=v.findViewById(R.id.webview);


        SharedPreferences myPreferences =  getActivity().getSharedPreferences(ApplicationConstant.INSTANCE.prefNamePref, getActivity().MODE_PRIVATE);
        String responseApi = myPreferences.getString(ApplicationConstant.INSTANCE.content_response, "");

      //  Gson gson = new Gson();
     //   operator = gson.fromJson(responseApi, SetChannelVideo.class);

        tittle.setText("  "+responseApi);



        String htmlAsString = responseApi.toString().trim();  // used by WebView


        webview.loadDataWithBaseURL(null, htmlAsString, "text/html", "utf-8", null);




    }
}