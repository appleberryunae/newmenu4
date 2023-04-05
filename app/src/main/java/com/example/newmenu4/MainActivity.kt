package com.example.newmenu4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuList= arrayOf(
            menu(R.drawable.doncas,"세종대왕돈까스","5,500","세종대의 자랑 세종대왕돈까스!"),
            menu(R.drawable.doncas,"치킨까스","4,500","돼지아니쥬 닭이쥬"),
            menu(R.drawable.doncas,"고구마돈까스","5,000","고구마를 품은 돼지"),
            menu(R.drawable.albab,"새우튀김 알밥","4,500","개발자 최애 학식 메뉴!"),
            menu(R.drawable.gathdong,"가츠동","4,000","돈까스 덮밥"),
            menu(R.drawable.doncas,"에비동","5,000","새우 왕큰거 올라간 덮밥"),
            menu(R.drawable.doncas,"치킨 가라아게동","5,000","치킨 올라간 덮밥"),
            menu(R.drawable.doncas,"우삼겹 된장찌개","5,000","해장 쌉가능 존맛탱"),
            menu(R.drawable.doncas,"김치우동","2,800","Not Bad"),
            menu(R.drawable.doncas,"어묵꼬치우동","3,500","우동먹고 싶은데 어묵도 땡길때"),
            menu(R.drawable.doncas,"왕새우튀김우동","5,200","왕큰새우 올라간 시원한 우동"),
            menu(R.drawable.doncas,"돈까스 우동정식","5,000","많이 먹고싶을 때")


        )









        val rv_menu: RecyclerView =findViewById(R.id.rv_menu)

        rv_menu.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_menu.setHasFixedSize(true)

        rv_menu.adapter=MenuAdapter(menuList)
    }
}