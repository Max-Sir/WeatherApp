package com.by.sir.max.weatherapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.by.sir.max.weatherapp.ui.camera.CameraFragment
import com.by.sir.max.weatherapp.ui.custom.dialpad.CustomDialPadFragment
import com.by.sir.max.weatherapp.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.choose_fragment_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @Throws(NotImplementedError::class)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_chooser_main_item -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
            }
            R.id.menu_chooser_custom_item -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, CustomDialPadFragment.newInstance())
            }
            R.id.menu_chooser_camera_item -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, CameraFragment.newInstance())

            }
            else -> throw NotImplementedError(
                message = getString(R.string.not_impl_error_text_chooser_menu)
            )
        }
        return super.onOptionsItemSelected(item)
    }
}