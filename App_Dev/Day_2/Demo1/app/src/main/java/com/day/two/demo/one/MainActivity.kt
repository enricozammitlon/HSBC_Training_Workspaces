package com.day.two.demo.one

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.day.two.demo.one.data.Data
import com.day.two.demo.one.errors.NameDoesNotExistException
import com.day.two.demo.one.errors.NameExistsException

class MainActivity : AppCompatActivity() {
    var dataClass = Data()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var randomizedText = findViewById<TextView>(R.id.textView2);

        var firstBtn = findViewById<Button>(R.id.button1);
        firstBtn.setOnClickListener {
            Log.d(this.localClassName,"New random name generated")
            randomizedText.text = dataClass.listBase() };
        //Toast.makeText(this,"Yay! You've clicked me!",Toast.LENGTH_SHORT).show()
    }
    fun startService(view: View?) {
        startService(Intent(baseContext, MyService::class.java))
    }
    fun stopService(view: View?) {
        stopService(Intent(baseContext, MyService::class.java))
    }

    /** Called when the activity is about to become visible.  */
    override fun onStart() {
        super.onStart()
        Log.d("My Application", "The onStart() event has executed")
    }
    /** Called when the activity has become visible.  */
    override fun onResume() {
        super.onResume()
        Log.d("My Application", "The onResume() event has executed")
    }
    /** Called when another activity is taking focus.  */
    override fun onPause() {
        super.onPause()
        Log.d("My Application", "The onPause() event has executed")
    }
    /** Called when the activity is no longer visible.  */
    override fun onStop() {
        super.onStop()
        Log.d("My Application", "The onStop() event has executed")
    }
    /** Called just before the activity is destroyed.  */
    override fun onDestroy() {
        super.onDestroy()
        Log.d("My Application", "The onDestroy() event has executed")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu?.getItem(1)?.isEnabled = true
        menu?.getItem(1)?.isVisible = true
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.menu_add -> {
                var taskEditText = EditText(this)
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Enter new name:")
                builder.setView(taskEditText)
                builder.setPositiveButton("Add"){_,_->
                    var name = taskEditText.text.toString().trim()
                    try{
                        dataClass.addName(name)
                        Toast.makeText(applicationContext,"Name added!",Toast.LENGTH_SHORT).show()
                    }catch (e : NameExistsException){
                        Toast.makeText(applicationContext,e.message,Toast.LENGTH_SHORT).show()
                    }
                    Log.d(this.localClassName,dataClass.getList().toString())
                }
                builder.show()
                true
            }
            R.id.menu_remove -> {
                var taskEditText = EditText(this)
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Enter name to remove:")
                builder.setView(taskEditText)
                builder.setNegativeButton("Remove"){_,_->
                    var name = taskEditText.text.toString().trim()
                    try{
                        dataClass.removeName(name)
                        Toast.makeText(applicationContext,"Name removed!",Toast.LENGTH_SHORT).show()
                    }catch (e : NameDoesNotExistException){
                        Toast.makeText(applicationContext,e.message,Toast.LENGTH_SHORT).show()
                    }
                    Log.d(this.localClassName,dataClass.getList().toString())
                }
                builder.show()
                true
            }
            R.id.website_button -> {
                val i = Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.qa.com")
                )
                startActivity(i)
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}