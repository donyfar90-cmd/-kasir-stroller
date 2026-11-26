package com.example.kasir

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Gunakan TextView sederhana agar tidak butuh file layout XML
        val textView = TextView(this)
        textView.text = "Aplikasi Kasir Stroller Berhasil Dibuka!"
        textView.textSize = 24f
        textView.setPadding(50, 50, 50, 50)
        
        // Tampilkan ke layar
        setContentView(textView)
    }
}
