package com.example.kasir

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Membuat tampilan teks sederhana tanpa file XML
        val textView = TextView(this)
        textView.text = "Aplikasi Kasir Stroller Berhasil Dibuka!"
        textView.textSize = 24f
        textView.setPadding(50, 50, 50, 50)
        
        setContentView(textView)
    }
}
