package com.example.practice22;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UI 요소 초기화
        textView = findViewById(R.id.textView);
        eText = findViewById(R.id.editText);

        // WindowInsetsListener 추가 (findViewById(R.id.main) 확인 필요)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // 버튼 클릭 시 실행될 메서드
    public void onClicked(View v) {
        String str = eText.getText().toString();
        textView.setText(str);
    }
}
