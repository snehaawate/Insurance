package com.google.samples.apps.sunflower

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.annotation.Nullable;



import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
               // message.setText(R.string.title_home)
//                toolbar.title = "Songs"
                val productFragment = ProductFragment()
                openFragment(productFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
               // message.setText(R.string.title_dashboard)
                val quotesFragment = QuotesFragment()
                openFragment(quotesFragment)
                return@OnNavigationItemSelectedListener true
            }
            /*R.id.navigation_notifications -> {
               // message.setText(R.string.title_notifications)
                val claimsFragment = ClaimsFragment()
                openFragment(claimsFragment)
                return@OnNavigationItemSelectedListener true
            }*/
        }
        false
       /* val productFragment = ProductFragment()
        openFragment(productFragment)
        return@OnNavigationItemSelectedListener true*/
    }

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productFragment = ProductFragment()
        openFragment(productFragment)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        if (savedInstanceState == null) {

        }
    }
    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
