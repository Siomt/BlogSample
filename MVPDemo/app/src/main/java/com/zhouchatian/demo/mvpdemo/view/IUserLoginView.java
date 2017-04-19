package com.zhouchatian.demo.mvpdemo.view;


import com.zhouchatian.demo.mvpdemo.bean.User;

/**
 * Created by  Mr.Robot on 2017/4/19.
 * GitHub:https://github.com/TheSadFrog
 */

public interface IUserLoginView {

    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
