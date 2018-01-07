package mychina.com.ad.ui.result;

/**
 * Created by 张晓辉 on 2018/1/1.
 */

public interface ResultContract {
    interface  View{
        void registSuccess();
        void registError();
        void registInfoEmpty();
        void registInfoError();
        void registConfirmPassError();
    }
    interface Presenter{
        void regist(String acount, String pass, String confirmPass);
    }
}
