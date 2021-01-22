package com.asfartz.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.asfartz.aboutme.databinding.ActivityAboutMeBinding

class AboutMeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutMeBinding
    private val myPersonalName: MyName = MyName("Andrei Sfartz", "Andy")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* without Data Binding */
        // setContentView(R.layout.activity_about_me)
        // findViewById<Button>(R.id.doneButton).setOnClickListener {
        //     addNickName(it)
        // }

        /* with Data Binding */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_me)
        binding.myName = myPersonalName


        binding.doneButton.setOnClickListener {
            addNickName(it) }

    }

    private fun addNickName(view: View) {

        /* without Data Binding */
        // val nicknameEditText = findViewById<EditText>(R.id.nickname_edittext)
        // val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
        // nicknameTextView.text = nicknameEditText.text
        // nicknameEditText.visibility = View.GONE
        // view.visibility = View.GONE
        // nicknameTextView.visibility = View.VISIBLE

        /* with Data Binding */

        binding.apply {
            nicknameText.text = nicknameEdittext.text   // without DataBinding the  data class
            myPersonalName?.nickname = nicknameEdittext.text.toString() // with dataBinding the data class

            // In order to refresh the UI with the new data, we need to invalidate all binding expressions
            // so that they get recreated with the correct data. In this case, the text is the data.
            invalidateAll()
            nicknameEdittext.visibility = View.GONE
            view.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }

        //Hide keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}