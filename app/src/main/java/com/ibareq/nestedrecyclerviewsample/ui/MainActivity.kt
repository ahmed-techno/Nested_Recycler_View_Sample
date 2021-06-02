package com.ibareq.nestedrecyclerviewsample.ui

import android.util.Log
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.ibareq.nestedrecyclerviewsample.R
import com.ibareq.nestedrecyclerviewsample.databinding.ActivityMainBinding
import com.ibareq.nestedrecyclerviewsample.ui.base.BaseActivity
import com.ibareq.nestedrecyclerviewsample.ui.favourite.FavouriteFragment
import com.ibareq.nestedrecyclerviewsample.ui.home.HomeFragment
import com.ibareq.nestedrecyclerviewsample.ui.profile.ProfileFragment
import com.ibareq.nestedrecyclerviewsample.ui.search.SearchFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val homeFragment = HomeFragment()
    private val favouriteFragment = FavouriteFragment()
    private val searchFragment = SearchFragment()
    private val profileFragment = ProfileFragment()

    override val LOG_TAG = MainActivity::class.simpleName

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setup() {
        initNavigationBar()
    }

    private fun initNavigationBar() {
        binding.bottomNavBar.setOnNavigationItemSelectedListener { item ->
            replaceFragment(
                when(item.itemId){
                    R.id.nav_home -> homeFragment
                    R.id.nav_favourites -> favouriteFragment
                    R.id.nav_search -> searchFragment
                    R.id.nav_profile -> profileFragment
                    else -> throw Exception("Fragment not found")
                }
            )
            true //cause we handle the navigation action
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.sub_view_container, fragment)
        transaction.commit()
    }
}