package com.example.m14x.tabbedinterface

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
//TODO Take a deeper view on this :/
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), OnFragmentInteractionListener {

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(toolbar)
        configureTabLayout()
    }

    private fun configureTabLayout() {

        //Setting up tabs with text as title
        /*tab_layout.addTab(tab_layout.newTab().setText("Tab 1 Item"))
        tab_layout.addTab(tab_layout.newTab().setText("Tab 2 Item"))
        tab_layout.addTab(tab_layout.newTab().setText("Tab 3 Item"))
        tab_layout.addTab(tab_layout.newTab().setText("Tab 4 Item"))*/

        //Setting up tabs with icons header
        tab_layout.addTab(tab_layout.newTab().setIcon(android.R.drawable.ic_dialog_email))
        tab_layout.addTab(tab_layout.newTab().setIcon(android.R.drawable.ic_dialog_dialer))
        tab_layout.addTab(tab_layout.newTab().setIcon(android.R.drawable.ic_dialog_map))
        tab_layout.addTab(tab_layout.newTab().setIcon(android.R.drawable.ic_dialog_info))

        val adapter = TabPagerAdapter(supportFragmentManager,
                tab_layout.tabCount)
        pager.adapter = adapter

        pager.addOnPageChangeListener(
                TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        tab_layout.addOnTabSelectedListener(object :
                TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                pager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }

        })
    }

}
