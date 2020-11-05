package com.day.two.demo.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
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
            else -> return super.onOptionsItemSelected(item)
        }
    }
}