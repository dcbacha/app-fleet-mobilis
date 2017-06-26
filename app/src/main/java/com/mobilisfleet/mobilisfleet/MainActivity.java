package com.mobilisfleet.mobilisfleet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  WebView myWebView = (WebView) findViewById(R.id.webview);
      //  WebSettings webSettings = myWebView.getSettings();
      //  webSettings.setJavaScriptEnabled(true);
      //  myWebView.loadUrl("https://mobilis.eco.br");

     //   WebView webview = new WebView(this);
     //   setContentView(webview);
     //   webview.loadUrl("https://mobilis.eco.br");

       // Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://mobilis.eco.br"));
       // startActivity(browserIntent);

        Uri uri = Uri.parse("https://mobilis.eco.br");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
