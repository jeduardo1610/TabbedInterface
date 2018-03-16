package com.example.m14x.tabbedinterface

/**
 * Created by m14x on 03/15/2018.
 */

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.m14x.tabbedinterface.Fragments.Tab1Fragment
import com.example.m14x.tabbedinterface.Fragments.Tab2Fragment
import com.example.m14x.tabbedinterface.Fragments.Tab3Fragment
import com.example.m14x.tabbedinterface.Fragments.Tab4Fragment

class TabPagerAdapter(fm: FragmentManager, private var tabCount: Int) :
        FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> return Tab1Fragment()
            1 -> return Tab2Fragment()
            2 -> return Tab3Fragment()
            3 -> return Tab4Fragment()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}