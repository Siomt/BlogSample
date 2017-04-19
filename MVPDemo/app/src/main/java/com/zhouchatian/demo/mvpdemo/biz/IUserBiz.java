package com.zhouchatian.demo.mvpdemo.biz;

/**
 * Created by  Mr.Robot on 2017/4/19.
 * GitHub:https://github.com/TheSadFrog
 */

public interface IUserBiz {
    public void login(String username, String password, OnLoginListener loginListener);
}
