package com.njang.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.njang.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private  lateinit var  binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setSupportActionBar(binding.toolbar)
        drawerLayout = binding.drawerLayout

        val navigationView = binding.navView
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, binding.toolbar, R.string.open_nav, R.string.close_nav
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, HomeFragment())
                .commit()
            navigationView.setCheckedItem(R.id.nav_home)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
       when (item.itemId) {
           R.id.nav_home -> supportFragmentManager.beginTransaction()
               .replace(R.id.fragmentContainer, HomeFragment())
               .commit()



           R.id.nav_setting -> supportFragmentManager.beginTransaction()
               .replace(R.id.fragmentContainer, SettingFragment())
               .commit()

           R.id.nav_about -> supportFragmentManager.beginTransaction()
               .replace(R.id.fragmentContainer, AboutUSFragment())
               .commit()

           R.id.nav_share -> supportFragmentManager.beginTransaction()
               .replace(R.id.fragmentContainer, ShareFragment())
               .commit()

           R.id.nav_logout -> Toast.makeText(this, "Bye bye winner", Toast.LENGTH_SHORT).show()

           R.id.nav_share -> Toast.makeText(this, "see you", Toast.LENGTH_SHORT).show()

           R.id.nav_about -> Toast.makeText(this, "Bye bye Mr.mason", Toast.LENGTH_SHORT).show()
       }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            (drawerLayout.closeDrawer(GravityCompat.START))
            } else {

                super.onBackPressed()

            }

        }
    }