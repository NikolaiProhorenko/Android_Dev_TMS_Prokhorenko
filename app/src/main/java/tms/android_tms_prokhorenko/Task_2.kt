package tms.android_tms_prokhorenko

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

open class Task_2 :AppCompatActivity() {
    private lateinit var btnAct: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAct = findViewById(R.id.btnAct)

        btnAct.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            collection()
        }

    }

    fun collection() {
        val color = listOf("Black", "White", "Green", "Yellow") // don't may add
        val colorAdd = mutableListOf("Black", "White", "Green", "Yellow") // may add
        colorAdd.add("Pink")
        colorAdd.removeAt(2)

        Log.d("TEST_ANDROID", "$color")
        Log.d("TEST_ANDROID", "$color")
        Log.d("TEST_ANDROID", "$colorAdd")
        Log.d("TEST_ANDROID", "${colorAdd.add("Blue")}")
        Log.d("TEST_ANDROID", "$colorAdd")

        val numbersMap = mapOf("Key1" to 1, "Key2" to 2, "Key3" to 3, "Key4" to 4) // don't may add
        val numbersMapAdd = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3) //  may add
        Log.d("TEST_ANDROID", "$numbersMap")
        Log.d("TEST_ANDROID", "$numbersMapAdd")
        Log.d("TEST_ANDROID", "${numbersMapAdd.put("key5", 5)}")
        Log.d("TEST_ANDROID", "$numbersMapAdd")

        val numbers = setOf("One", "Two", "Three", "Four") // don't may add
        val numbersAdd = mutableSetOf("One", "Two", "Three", "Four") // may add
        Log.d("TEST_ANDROID", "$numbers")
        Log.d("TEST_ANDROID", "${numbersAdd.add("Five")}")
        Log.d("TEST_ANDROID", "$numbersAdd")
    }
}