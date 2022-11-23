package com.project.ticketbook;

import com.project.ticketbook.LoginUtils.*;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData_(LoginUtils.users);
    }

    void initData_(LoginUtils.User users[]){
        users[0] = new User("abc.def@xyz.com","abcdefgh","12-23-12");
        users[1] = new User("ghii@xyz.com","abcdefgg","12-23-12");
        users[2] = new User("sc@xyz.com","12345678","12-23-12");
        users[3] = new User("mouse@xyz.com","12345677","12-23-12");
        users[4] = new User("music@xyz.com","GuitarsAreGuitars","12-23-12");
    }
}