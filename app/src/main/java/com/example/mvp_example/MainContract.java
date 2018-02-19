package com.example.mvp_example;

/**
 * Created by pusya on 19.02.18.
 */

public interface MainContract {
    interface View {
        void showText(String message);
    }

    interface Presenter {
        void onButtonWasClicked();
        void onDestroy();
    }

    interface Repository {
        String loadMessage();
    }
}
