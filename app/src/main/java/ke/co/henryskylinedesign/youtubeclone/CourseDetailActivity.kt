package ke.co.henryskylinedesign.youtubeclone

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class CourseDetailActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        recylerView_main.layoutManager = LinearLayoutManager(this)
        recylerView_main.adapter = CourseDetailAdapter()
    }
}