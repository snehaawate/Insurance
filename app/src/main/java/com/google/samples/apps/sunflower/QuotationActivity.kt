package com.google.samples.apps.sunflower


import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.show_quotation_for_checkout.*
import com.google.samples.apps.sunflower.R
import kotlinx.android.synthetic.main.property_purchase_form.*

import org.jetbrains.anko.sdk27.coroutines.onClick




class QuotationActivity : AppCompatActivity() {

    val PREFS_FILENAME = "com.mba.product_customer_details.prefs"
    var prefs: SharedPreferences? = null
    val PRODUCT_NAME = "product_name"
    val PROPERTY_PREMIUM_AMOUNT = "property_premium_amount"
    val PROPERTY_COVER_TYPE = "property_cover_type"


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        prefs = this.getSharedPreferences(PREFS_FILENAME, 0)

        val productName = prefs!!.getString(PRODUCT_NAME,"")
        val premiumAmount = prefs!!.getString(PROPERTY_PREMIUM_AMOUNT,"")
        val coverType = prefs!!.getString(PROPERTY_COVER_TYPE,"")


        setContentView(R.layout.show_quotation_for_checkout)

        this@QuotationActivity.policy_option_name.setText("Policy Option" + ": " + productName)
        this@QuotationActivity.cover_option_type.setText("Cover" + ": " + coverType)
        this@QuotationActivity.premium_amount.setText("Premium" + ": " + premiumAmount)

          val lastString = "0.01*{C1700004}"
          val lastStringPosition: Int = lastString.indexOf("}")
          var firstStringPosition: Int = lastString.indexOf("{")
          firstStringPosition += 1
          val subSequence = lastString.subSequence(firstStringPosition, lastStringPosition )

        proceed_to_payment_button.onClick {

            /* val editor = prefs!!.edit()
             editor.putInt(PRODUCT_NAME, color)
             editor.apply()
            val editor = prefs!!.edit()
            editor.putString(PROPERTY_DETAILS, this@PropertyPurchaseFormActivity.property_purchase_form_input_text_2.text.toString())
            editor.putString(PROPERTY_PREMIUM_AMOUNT, this@PropertyPurchaseFormActivity.property_purchase_form_input_text_3.text.toString())
            editor.putString(PROPERTY_COVER_TYPE, this@PropertyPurchaseFormActivity.property_purchase_form_input_layout_3.hint.toString())
            editor.apply()*/

            val intent = Intent (this@QuotationActivity, PaymentActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}