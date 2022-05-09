package com.kaouidef.myiterableapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.iterable.iterableapi.IterableApi
import com.iterable.iterableapi.IterableConfig
import org.json.JSONObject


var API_KEY = "349dcc9373c74c6699c5d1204a271695"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val config = IterableConfig.Builder().setAllowedProtocols(arrayOf("http","tel","custom")).build()
        IterableApi.initialize(this, API_KEY, config);

        findViewById<Button>(R.id.submitButton).setOnClickListener {
            val email = findViewById<EditText>(R.id.emailInput).text
            val firstName = findViewById<EditText>(R.id.nameInput).text
            val datafields = JSONObject()

            datafields.put("firstName", firstName)
            datafields.put("isRegisteredUser", true)
            datafields.put("SA_User_Test_Key", "completed")

            IterableApi.getInstance().setEmail(email.toString())
            IterableApi.getInstance().updateUser(datafields)
        }

        findViewById<Button>(R.id.sendButton).setOnClickListener {
            val datafields = JSONObject()
            val customEvent = JSONObject()

            customEvent.put("platform", "android")
            customEvent.put("isTestEvent", true)
            customEvent.put("url", "https://iterable.com/sa-test/Kamel")
            customEvent.put("secret_code_key", "Code_123")
            datafields.put("dataFields", customEvent)
            IterableApi.getInstance().track(
                "mobileSATestEvent",
                datafields
            )
            IterableApi.getInstance().inAppManager.setAutoDisplayPaused(true)
        }
    }
}