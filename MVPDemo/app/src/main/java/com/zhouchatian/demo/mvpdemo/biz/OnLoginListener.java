package com.zhouchatian.demo.mvpdemo.biz;


import com.zhouchatian.demo.mvpdemo.bean.User;

/**
 * Created by  Mr.Robot on 2017/4/19.
 * GitHub:https://github.com/TheSadFrog
 */

public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFailed();

}
