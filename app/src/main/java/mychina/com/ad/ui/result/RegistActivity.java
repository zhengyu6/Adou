package mychina.com.ad.ui.result;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mychina.com.ad.R;
import mychina.com.ad.utils.ToastUtils;

/**
 * Created by 张晓辉 on 2018/1/1.
 */

public class RegistActivity extends AppCompatActivity implements ResultContract.View, View.OnClickListener {
    private EditText et_regist_acount;
    private EditText et_regist_pass;
    private EditText et_regist_confirm;
    private TextView info;
    private Button regist;
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        initView();
        initToolbar();
    }

    private void initToolbar() {
        toolbar.setTitle("注册");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        et_regist_acount = (EditText) findViewById(R.id.et_regist_acount);
        et_regist_pass = (EditText) findViewById(R.id.et_regist_pass);
        et_regist_confirm = (EditText) findViewById(R.id.et_regist_confirm);
        regist = (Button) findViewById(R.id.bt_regist);
        info = (TextView) findViewById(R.id.tv_info);
        regist.setOnClickListener(this);
        info.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_regist:


                break;
            case R.id.tv_info:
                break;
            default:
                break;
        }
    }

    @Override
    public void registSuccess() {

    }

    @Override
    public void registError() {

    }

    @Override
    public void registInfoEmpty() {
        ToastUtils.show("用户名密码为空");
    }

    @Override
    public void registInfoError() {
        ToastUtils.show("用户名密码长度不足8位");

    }

    @Override
    public void registConfirmPassError() {
        ToastUtils.show("两次密码输入不一致");

    }
}
