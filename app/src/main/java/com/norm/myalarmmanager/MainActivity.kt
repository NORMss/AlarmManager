package com.norm.myalarmmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.norm.myalarmmanager.databinding.ContentMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ContentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ContentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}