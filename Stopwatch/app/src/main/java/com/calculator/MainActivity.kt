package com.calculator

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // WebView Initialization
        val webView: WebView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient() // Load within the app
        webView.settings.javaScriptEnabled = true // Enable JavaScript

        // Load the HTML file from assets
        webView.loadUrl("file:///android_asset/index.html")
    }
}
