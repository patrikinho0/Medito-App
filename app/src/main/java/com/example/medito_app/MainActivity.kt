package com.example.medito_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val headerMore: ImageView = findViewById(R.id.header_imageview)

        headerMore.setOnClickListener {
            val intent = Intent(this, MoreActivity::class.java)
            startActivity(intent)
        }

        val meditationLayout: LinearLayout = findViewById(R.id.meditation_layout)

        meditationLayout.setOnClickListener{
            val intent = Intent(this, MeditationActivity::class.java)
            startActivity(intent)
        }

        val timerLayout: LinearLayout = findViewById(R.id.timer_layout)

        timerLayout.setOnClickListener{
            val intent = Intent(this, TimerActivity::class.java)
            startActivity(intent)
        }

        val downloadLayout: LinearLayout = findViewById(R.id.download_layout)

        downloadLayout.setOnClickListener{
            val intent = Intent(this, DownloadActivity::class.java)
            startActivity(intent)
        }

        val sleepLayout: LinearLayout = findViewById(R.id.sleep_layout)

        sleepLayout.setOnClickListener{
            val intent = Intent(this, SleepActivity::class.java)
            startActivity(intent)
        }

        val courseLayout1: LinearLayout = findViewById(R.id.course_layout1)

        courseLayout1.setOnClickListener{
            val intent = Intent(this, Course1Activity::class.java)
            startActivity(intent)
        }

        val courseLayout2: LinearLayout = findViewById(R.id.course_layout2)

        courseLayout2.setOnClickListener{
            val intent = Intent(this, Course2Activity::class.java)
            startActivity(intent)
        }

        val courseLayout3: LinearLayout = findViewById(R.id.course_layout3)

        courseLayout3.setOnClickListener{
            val intent = Intent(this, Course3Activity::class.java)
            startActivity(intent)
        }

        val statsLayout: LinearLayout = findViewById(R.id.stats_layout)
        val toast: Toast = Toast.makeText(this, "Nice stats!", Toast.LENGTH_SHORT)

        statsLayout.setOnClickListener {
            toast.show()
        }

        val homeLayout: LinearLayout = findViewById(R.id.footer_home_layout)

        homeLayout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val packsLayout: LinearLayout = findViewById(R.id.footer_packs_layout)

        packsLayout.setOnClickListener {
            val intent = Intent(this, PacksActivity::class.java)
            startActivity(intent)
        }
    }
}