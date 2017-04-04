package com.businessologieplus.firebasepushnotif;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String Tag = "MyFirebaseIDService";

    @Override
    public void onTokenRefresh() {
        String refreshedTocken = FirebaseInstanceId.getInstance().getToken();
        Log.e(Tag, refreshedTocken);
    }
}
