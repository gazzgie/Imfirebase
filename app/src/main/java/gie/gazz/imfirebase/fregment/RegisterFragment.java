package gie.gazz.imfirebase.fregment;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import gie.gazz.imfirebase.R;

/**
 * Created by Gazzgie on 6/2/2561.
 */

public class RegisterFragment extends android.support.v4.app.Fragment{


    private String nameString ,emailString,passwordString;
    private FirebaseAuth firebaseAuth;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        firebaseAuth = FirebaseAuth.getInstance();
        saveValueTofirebase();

    }

    @Nullable
    private void saveValueTofirebase()
    {


        ImageView imageView1=getView().findViewById(R.id.txtRegister);

        imageView1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                firebaseAuth.createUserWithEmailAndPassword(emailString,passwordString).addOnCompleteListener(new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(getActivity(),"Register Success",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getActivity(),"No Register !!!",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });

    }



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fregment_register,container,false);
        return view;
    }

}
