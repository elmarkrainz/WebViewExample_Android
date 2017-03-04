package at.fhj.ims.webviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

           myWebView = (WebView) findViewById(R.id.webViewAdv);
        myWebView.loadUrl("file:///android_asset/index.html");


        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.addJavascriptInterface(new JsInterface(this), "Androidfunction");
    }
}
