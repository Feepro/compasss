package com.example.compasss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import tech.httptoolkit.android.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun startVpn() {
        Log.i("MainActivity", "Starting VPN")

        startService(Intent(this, ProxyVpnService::class.java).apply {
            action = START_VPN_ACTION
            //putExtra(PROXY_CONFIG_EXTRA, currentProxyConfig)
            //putExtra(UNINTERCEPTED_APPS_EXTRA, app.uninterceptedApps.toTypedArray())
            //putExtra(INTERCEPTED_PORTS_EXTRA, app.interceptedPorts.toIntArray())
        })
    }
}