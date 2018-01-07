package mychina.com.ad.app;

import android.app.Application;

import com.tencent.ilivesdk.ILiveSDK;
import com.tencent.ilivesdk.core.ILiveLog;
import com.tencent.livesdk.ILVLiveConfig;
import com.tencent.livesdk.ILVLiveManager;
import com.tencent.qalsdk.sdk.MsfSdkUtils;

import mychina.com.ad.engine.MessageObservable;


public class AdouApplication extends Application {
   static  AdouApplication app;
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        initLiveSdk();

    }

    private void initLiveSdk() {
        if(MsfSdkUtils.isMainProcess(this)){    // 仅在主线程初始化
            // 初始化LiveSDK
            ILiveLog.setLogLevel(ILiveLog.TILVBLogLevel.DEBUG);
            ILiveSDK.getInstance().initSdk(this, 1400059239, 21019);
            ILVLiveManager.getInstance().init(new ILVLiveConfig()
                    .setLiveMsgListener(MessageObservable.getInstance()));
        }
    }

    public  static AdouApplication getApp(){
        return app;
    }


}
