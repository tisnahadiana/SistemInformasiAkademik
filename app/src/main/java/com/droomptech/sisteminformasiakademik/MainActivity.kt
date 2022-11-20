package com.droomptech.sisteminformasiakademik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droomptech.sisteminformasiakademik.Adapter.ViewPagerAdapter
import com.droomptech.sisteminformasiakademik.databinding.ActivityMainBinding
import com.droomptech.sisteminformasiakademik.fragment.HomeFragment
import com.droomptech.sisteminformasiakademik.fragment.UserFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTab()
    }

    private fun setupTab() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(UserFragment(), "User")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.ic_user)
    }
}