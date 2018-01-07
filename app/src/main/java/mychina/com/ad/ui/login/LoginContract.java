package mychina.com.ad.ui.login;

/**
 * Created by 张晓辉 on 2018/1/1.
 */

public interface LoginContract {
    interface View {
        void loginSuccess();

        void loginFailed();

        void loginInfoEmpty();

        void loginInfoError();
    }

    interface Presenter {
        void login(String acount, String pass);
    }
}