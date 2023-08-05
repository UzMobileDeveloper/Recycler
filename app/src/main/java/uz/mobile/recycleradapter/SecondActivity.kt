package uz.mobile.recycleradapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mobile.recycleradapter.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            var data = intent.getSerializableExtra("key") as Course
            course.text = data.course_name.toString()
            author.text = data.author.toString()
            desc.text = data.description.toString()
        }
    }
}