package com.example.toolbarmenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miAddContact -> Toast.makeText(this, "You clicked on Add Contact Menu",Toast.LENGTH_SHORT).show()
            R.id.miFavorite -> Toast.makeText(this, "You clicked on favorite",Toast.LENGTH_SHORT).show()
            R.id.miMenu -> Toast.makeText(this, "You clicked on Settings",Toast.LENGTH_SHORT).show()
            R.id.miFeedBack -> Toast.makeText(this, "You clicked on Feedback",Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish()
        }
        return true
    }
}