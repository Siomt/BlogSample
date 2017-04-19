package com.zhouchatian.demo.mvpdemo.presenter;

import android.os.Handler;

import com.zhouchatian.demo.mvpdemo.bean.User;
import com.zhouchatian.demo.mvpdemo.biz.IUserBiz;
import com.zhouchatian.demo.mvpdemo.biz.OnLoginListener;
import com.zhouchatian.demo.mvpdemo.biz.UserBiz;
import com.zhouchatian.demo.mvpdemo.view.IUserLoginView;


/**
 * Created by  Mr.Robot on 2017/4/19.
 * GitHub:https://github.com/TheSadFrog
 */

public class UserLoginPresenter {

    private IUserBiz userBiz;
    private IUserLoginView userLoginView;
    private Handler mHandler = new Handler();

    public UserLoginPresenter(IUserLoginView userLoginView){
        this.userLoginView = userLoginView;
        this.userBiz = new UserBiz();
    }

    public void login(){

        userLoginView.showLoading();
        userBiz.login(userLoginView.getUserName(), userLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(User user) {

            }

            @Override
            public void loginFailed() {

            }
        });
    }
    public void clear(){
        userLoginView.clearUserName();
        userLoginView.clearPassword();
    }
}
