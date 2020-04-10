package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    private WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myweb=(WebView)findViewById(R.id.webview);
        WebSettings webSettings = myweb.getSettings();
        myweb.loadUrl("https://google.com/covid19-map/?hl=en");
        webSettings.setJavaScriptEnabled(true);

    }
    public class myWebClient extends WebViewClient {
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        public boolean ShouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;

        }
    }
        @Override
        public void  onBackPressed(){
        if(myweb.canGoBack()){
         myweb.goBack();

        }
            else{
                super.onBackPressed();
            }
        }


        }

    
