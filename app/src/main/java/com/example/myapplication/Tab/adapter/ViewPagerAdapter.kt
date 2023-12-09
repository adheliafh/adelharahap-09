package com.example.myapplication.Tab.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.Tab.PythFragment
import com.example.myapplication.Tab.JavFragment
import com.example.myapplication.Tab.KotFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> {
                KotFragment()
            }

            1 -> {
                PythFragment()
            }

            2 -> {
                JavFragment()
            }

            else -> {
                Fragment()
            }
        }
    }
}