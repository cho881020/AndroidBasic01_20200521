package kr.co.tjoeun.androidbasic01_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.androidbasic01_20200521.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

//  이벤트 처리 코드 모아두는 곳
    void setupEvents() {

        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                FirstActivity로 이동.


            }
        });

    }

//    화면에 나와야할 데이터 세팅 코드 모아두는 곳
    void setValues() {

    }

}
