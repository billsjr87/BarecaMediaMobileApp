package com.coordinator.bareca

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
      @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val mainWebView: WebView = findViewById(R.id.mainPage)

            mainWebView.loadUrl("https://www.barecamedia.com")
            mainWebView.settings.javaScriptEnabled = true
      }
}