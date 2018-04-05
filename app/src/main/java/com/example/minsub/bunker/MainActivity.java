package com.example.minsub.bunker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true); // 자바스크립트 실행
        webView.getSettings().setSupportZoom(true); // 확대, 축소 기능 사용할 수 있도록 설정
        webView.getSettings().setBuiltInZoomControls(true); // 안드로이드 줌 아이콘 사용 가능
        //webView.getSettings().setUseWideViewPort(false);
        //webView.getSettings().setSupportMultipleWindows(false); // 여러개의 윈도우를 사용할 수 있도록 설정
        //webView.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND); // 플러그인을 사용할 수 있도록 설정

        webView.loadUrl("http://www.bunkerhouse.co.kr/front/");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
