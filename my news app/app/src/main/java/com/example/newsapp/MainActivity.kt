package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.fragment.SectionPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var mSectionPagerAdapter: SectionPagerAdapter? = null

    private lateinit var vpNews: ViewPager2
    private lateinit var tabs: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //untuk build toolbar
        setSupportActionBar(findViewById(R.id.toolbar))

        vpNews = findViewById(R.id.vp_news)
        tabs = findViewById(R.id.tabs)

        val vpNews: ViewPager2 = findViewById(R.id.vp_news)

        val tabs: TabLayout = findViewById(R.id.tabs)

        // inisiasi value di variable  mSectionPagerAdapter
        mSectionPagerAdapter = SectionPagerAdapter(this)
        // set adapter di viewpager
        vpNews.adapter = mSectionPagerAdapter

        // title di tab layout
        val tabList = arrayListOf("All News" ," Top", "Popular")

        // build title di tab layout
        TabLayoutMediator(tabs, vpNews){tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}