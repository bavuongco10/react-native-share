package cl.json.social;

import android.content.ActivityNotFoundException;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/**
 * Created by disenodosbbcl on 23-07-16.
 */
public class ZaloShare extends SingleShareIntent {

    private static final String PACKAGE = "com.zing.zalo";
    private static final String DEFAULT_WEB_LINK = "https://developers.zalo.me/docs/social/share";

    public FacebookShare(ReactApplicationContext reactContext) {
        super(reactContext);

    }
    @Override
    public void open(ReadableMap options) throws ActivityNotFoundException {
        super.open(options);
        //  MORE DATA
        this.openIntentChooser();
    }
    @Override
    protected String getPackage() {
        return PACKAGE;
    }

    @Override
    protected String getDefaultWebLink() {
        return DEFAULT_WEB_LINK;
    }

    @Override
    protected String getPlayStoreLink() {
        return null;
    }
}