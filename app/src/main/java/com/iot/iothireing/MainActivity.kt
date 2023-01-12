@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

package com.iot.iothireing

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    private var model: MainViewModel? = null

    private lateinit var ed1: EditText
    private lateinit var ed2: EditText
    private lateinit var ed3: EditText
    private lateinit var ed4: EditText
    private lateinit var ed5: EditText
    private lateinit var imageView: ImageView


    var fk = false

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        model = ViewModelProvider(this)[MainViewModel::class.java]

        ed1 = findViewById(R.id.editText1)
        ed2 = findViewById(R.id.editText2)
        ed3 = findViewById(R.id.editText3)
        ed4 = findViewById(R.id.editText4)
        ed5 = findViewById(R.id.editText5)
        imageView = findViewById(R.id.imageView)

        imageView.setOnClickListener {
            finish()
        }

        ed1.setText(model!!.text1)
        ed1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (fk) {
                    model!!.text1 = s.toString()
                    fk = !fk
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })

        ed1.setText(model!!.text1)
        ed1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (fk) {
                    model!!.text1 = s.toString()
                    fk = !fk
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })

        ed2.setText(model!!.text2)
        ed2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (fk) {
                    model!!.text2 = s.toString()
                    fk = !fk
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })

        ed3.setText(model!!.text3)
        ed3.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (fk) {
                    model!!.text3 = s.toString()
                    fk = !fk
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })

        ed4.setText(model!!.text4)
        ed4.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (fk) {
                    model!!.text4 = s.toString()
                    fk = !fk
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })

        ed5.setText(model!!.text5)
        ed5.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (fk) {
                    model!!.text5 = s.toString()
                    fk = !fk
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })


    }


//    override fun onConfigurationChanged(newConfig: Configuration) {
//        super.onConfigurationChanged(newConfig)
//
//        // Checks the orientation of the screen
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            Toast.makeText(this, "Failed to update the session,landscape", Toast.LENGTH_SHORT).show()
//            clearData()
//        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
//            Toast.makeText(this, " Failed to update the session, portrait", Toast.LENGTH_SHORT).show()
//        }
//    }

    private fun clearData() {
//        model?.text1 = "0"
        model?.text2 = "0"
        model?.text3 = "0"
        model?.text4 = "0"
        model?.text5 = "0"

//        ed1.setText(model?.text1)
        ed2.setText(model?.text2)
        ed3.setText(model?.text3)
        ed4.setText(model?.text4)
        ed5.setText(model?.text5)
    }
}