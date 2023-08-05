package uz.mobile.recycleradapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mobile.recycleradapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),RecyclerAdapter.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var list: ArrayList<Course>
    private lateinit var myAdapter: RecyclerAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initList()
        myAdapter = RecyclerAdapter(list,this)
        myAdapter.setOnClickListener(this)
        binding.rv.adapter = myAdapter
    }

    private fun initList() {
        list = ArrayList()
        list.add(Course("UI", 5.0f,"User Interface - bu biz qilgan ilovaning foydalanuvchiga ko`rinadigan qismi hisoblanadi","Yahyo Suvonqulov"))
        list.add(Course("SharedPreference", 3.0f,"Bu xotira turlaridan biri bo`lib faqat boshqa ma`lumot saqlashlardan farqi bu vaqtinchalik doimiy emas","Mushtariy Shorasulova"))
        list.add(Course("Login", 2.0f,"Bu - tizimga kirish uchun user avvaldan ro`yxatda bormi yo`qmi tekshirish qismi","Zarina Xasanova"))
        list.add(Course("Quiz", 0.0f,"Bu savol javob o`yini","Asadbek Naimov"))
        list.add(Course("Adapter", 2.5f,"Listdagi ma`lumotlarni ekranga chiqarish uchun ishlatiladi","No one"))
        list.add(Course("UI", 5.0f,"User Interface - bu biz qilgan ilovaning foydalanuvchiga ko`rinadigan qismi hisoblanadi","Yahyo Suvonqulov"))
        list.add(Course("SharedPreference", 3.0f,"Bu xotira turlaridan biri bo`lib faqat boshqa ma`lumot saqlashlardan farqi bu vaqtinchalik doimiy emas","Mushtariy Shorasulova"))
        list.add(Course("Login", 2.0f,"Bu - tizimga kirish uchun user avvaldan ro`yxatda bormi yo`qmi tekshirish qismi","Zarina Xasanova"))
        list.add(Course("Quiz", 0.0f,"Bu savol javob o`yini","Asadbek Naimov"))
        list.add(Course("Adapter", 2.5f,"Listdagi ma`lumotlarni ekranga chiqarish uchun ","Nurbek Shorasulov"))
    }

    override fun onClick(position: Int, course: Course) {
        var intent  = Intent(this,SecondActivity::class.java)
        intent.putExtra("key",course)
        startActivity(intent)
    }

}