package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by albar on 21/11/2017.
 */

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();

    /**
     * Called if INstanceID token is updated. This may occur if the security of
     * the previous toke had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrive the token.
     */
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(LOG_TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    /**
     * Persist token to third-party servers.
     *
     * Modify this method to associate the users's FCM instaceID token with tany srever side account
     * maintained by your aapplication.
     *
     * @param token The new token.
     */
    private void sendRegistrationToServer(String token){
        // This method is blank, but if you were to build a server that stores users token
        // information, this is where you'd send the token to the server
    }
}
