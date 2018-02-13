package gie.gazz.imfirebase.fregment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import gie.gazz.imfirebase.R;

import static gie.gazz.imfirebase.R.id.txtRegister;

/**
 * Created by Gazzgie on 6/2/2561.
 */

public class MainFragment extends android.support.v4.app.Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fregment_main,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        registerCntroller();
    }

    private void registerCntroller() {
        TextView textView = getView().findViewById(R.id.txtRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.abcd,new RegisterFragment()).addToBackStack(null).commit();
            }
        });
    }

}

