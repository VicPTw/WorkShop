package com.ns.greg.demo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient


class WebViewActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webView = findViewById(R.id.webview)

        webView!!.settings.javaScriptEnabled = true
        webView!!.settings.domStorageEnabled = true
        webView!!.settings.setSupportMultipleWindows(true)
        webView!!.settings.javaScriptCanOpenWindowsAutomatically = true

        webView!!.webViewClient = WebViewClient()
        webView!!.webChromeClient = WebChromeClient()

        webView!!.loadUrl("http://ski01p1910.southeastasia.cloudapp.azure.com:7070/Webhook/")
    }

}