package com.example.mvpimplementation.Presenter;

import android.view.View;

import com.example.mvpimplementation.Model.User;

public class MainActivityPresenter {

    private User user;
    private View view;

    public MainActivityPresenter(View view)
    {
        this.view = view;
        user = new User();
    }

    public void updateFullName(String fullname)
    {
        user.setFullname(fullname);
        view.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email)
    {
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }

    public interface View{

        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }

}
