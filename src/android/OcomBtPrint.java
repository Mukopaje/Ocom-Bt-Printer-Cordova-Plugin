package cordova.plugin.ocom.btprint;

import android.content.Context;
import android.content.Intent;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zj.com.cn.bluetooth.sdk.OcomBtPrintActivity;
 
/**
 * This class echoes a string called from JavaScript.
 */
public class OcomBtPrint extends CordovaPlugin {
 
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Context context = cordova.getActivity().getApplicationContext();
        if(action.equals("isAvailable")) {
            this.openNewActivity(context,args);
            return true;
        }
        return false;
    }
 
    private void openNewActivity(Context context,JSONArray args)  throws JSONException {
        Intent intent = new Intent(context, OcomBtPrintActivity.class);
        this.cordova.getActivity().startActivity(intent);
    }
}