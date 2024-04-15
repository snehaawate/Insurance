package com.google.samples.apps.sunflower

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import androidx.databinding.DataBindingUtil.setContentView
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textfield.TextInputEditText
import com.google.samples.apps.sunflower.QuotationActivity
import kotlinx.android.synthetic.main.kyc_form.*
import kotlinx.android.synthetic.main.property_purchase_form.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.sdk27.coroutines.textChangedListener

class kyc_form_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kyc_form)


        kyc_form_save_and_continue_button.onClick {

            val intent = Intent (this@kyc_form_activity, QuotationActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}