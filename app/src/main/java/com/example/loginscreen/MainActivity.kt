package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.loginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Listener {

    lateinit var mainViewModel : MainViewModel
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.viewModel = mainViewModel
        mainViewModel.listener = this

    }

    override fun onSuccess() {
       Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
    }

    override fun onFailure() {
        Toast.makeText(this,"Failure",Toast.LENGTH_LONG).show()
        Log.i(TAG, "Failure : ")
    }
    companion object{
        private val TAG = "MainActivity"
    }
}