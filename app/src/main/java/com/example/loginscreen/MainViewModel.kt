package com.example.loginscreen

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var TAG = "MainActivity"

     var name :String? = null
     var password : String? = null
      var listener : Listener? = null

     fun onClickButton(view : View){
               if(name.isNullOrEmpty() && password.isNullOrEmpty()){
                   Log.i(TAG, "NAME : $name")
                   Log.i(TAG, "Password: $password")
                    listener?.onFailure()
                   return
               }
          listener?.onSuccess()
     }


}