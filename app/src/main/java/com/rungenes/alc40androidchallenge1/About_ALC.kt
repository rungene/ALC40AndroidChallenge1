package com.rungenes.alc40androidchallenge1

import android.net.http.SslError
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class About_ALC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about__alc)
        val myWebView = WebView(this)
        setContentView(myWebView)

        supportActionBar!!.title="About ALC"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
/*
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.loadsImagesAutomatically = true
        myWebView.loadUrl("https://andela.com/alc/")*/

        myWebView.webViewClient = object : WebViewClient() {

            override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
                handler.proceed()

            }

        }
        myWebView.settings.javaScriptEnabled=true
        myWebView.loadUrl("https://andela.com/alc/")


    }
}

