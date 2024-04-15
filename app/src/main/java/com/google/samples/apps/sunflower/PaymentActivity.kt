package com.google.samples.apps.sunflower




import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.show_quotation_for_checkout.*
import com.google.samples.apps.sunflower.R
/*import kotlinx.android.synthetic.main.property_purchase_form.**/
import app.ephod.pentecost.library.paystack.PaymentView


import android.widget.Button

class PaymentActivity: AppCompatActivity() {

    val PREFS_FILENAME = "com.mba.product_customer_details.prefs"
    var prefs: SharedPreferences? = null
    val PRODUCT_NAME = "product_name"
    val PROPERTY_PREMIUM_AMOUNT = "property_premium_amount"
    val PROPERTY_COVER_TYPE = "property_cover_type"
    private lateinit var button: Button
    private lateinit var paymentView: PaymentView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        prefs = this.getSharedPreferences(PREFS_FILENAME, 0)

        val productName = prefs!!.getString(PRODUCT_NAME,"")
        val premiumAmount = prefs!!.getString(PROPERTY_PREMIUM_AMOUNT,"")
        val coverType = prefs!!.getString(PROPERTY_COVER_TYPE,"")


        setContentView(R.layout.payment_layout)

      //  setContentView(R.layout.constraint_layout_test)

        /* this@QuotationActivity.policy_option_name.setText("Policy Option" + ": " + productName)
         this@QuotationActivity.cover_option_type.setText("Cover" + ": " + coverType)
         this@QuotationActivity.premium_amount.setText("Premium" + ": " + premiumAmount)*/
        this.paymentView = findViewById(R.id.paymentView) as PaymentView

        paymentView.setPentecostTheme("black|white")

    }

}