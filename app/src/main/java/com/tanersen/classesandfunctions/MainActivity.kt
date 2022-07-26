package com.tanersen.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello")
        println("Firstfunc")
        firstFunc()
        //Func çağrıldığında içine
        //parametreleri yazman yeterli
        //tipleri otomatik gelir.
        println("Extraction func")
        extraction(100,10)
        println("Collection func")
        textView.text="Sonuç: ${collection(12,24)}"

        //button.setOnClickListener özelliği
        //button tıklandığında yapılacak işlemleri
        //belirtmemizi sağlar

        button.setOnClickListener(){
           textView.text="Sonuç : ${collection(24,66)}"
        }
        myclass()
        nullsecurity()

    }
        // Func' da () içine parametre yazabilirsin.
        // Func en önemli fayası her yerden çağırabilirsin.
        fun firstFunc(){
        println("firstFunc worked")
        }
        //Girdi almak
        //extraction - çıkarma
        fun extraction(x:Int,y:Int){
        textView.text="Sonuç : ${x-y}"
        }
        // Çıktı vermek - Döndürmek(Return)
        //collection toplama
        //Çıktıyı iki nokta sonunda
        //yaptığımız tanımlama ile alır
        //çıktı için return komutu

        fun collection(a:Int, b:Int):Int{
            return a+b
        }
        //Bir görünüm tarafından çağrılacak
        //func' larda view kullanılır.
        // /* ile */ arasındaki satırlar açıklama
        // satırı olur.
/*
        fun change(view:View){
            textView.text="Result : ${collection(60,70)}"
        }
*/
        //button.setOnClickListener özelliği
        //button tıklandığında yapılacak işlemleri
        //belirtmemizi sağlar


        //Class nedir. Aslında büyük bir plandır.
        //Oluşturacağımız objelerin fonksiyonlarını tanımlarız.
        //textview bir sınıftır. .text bir fonksiyonudur
        //İşe uygun sınıf yazarak başla.
/*
        fun myclass(){
            var turkce=lessons()
            turkce.name="Türkçe"
            turkce.numberofquestion=20
            turkce.point=2.0
            textView.text="Ders:${turkce.name} Soru Sayısı: ${turkce.numberofquestion} Puan: ${turkce.point}"
        }
        //Şimdi bunu çalıştırmak için create içine
        // en son satıra yaz.
*/
        fun myclass(){
            var lesson=lessons("Türkçe",20,2.0)

            textView.text="${lesson.name}' in puanı ${lesson.point}"
            lesson.test()
        }

        fun nullsecurity(){
        /* Null, Nullability, Null safety
        Tanımlama(Defining)
        Tanımlama - Defining
        Bir yerden veri çekerken vb.null olma ihtimalini
        göz önüne almak gerekir. Bunun için veritipinin
        sonuna ? koymak verinin Nullability yani null olma
        ihtimalini belirtir.
    */
        var myString:String?


        //3 adet null safety durumu var.
        //1
        var myAge:Int?=null
        if (myAge!=null) {
            println(myAge)
        } else {
            println("Null geldi")
        }
            //2
        //!!nullolmayacak ?null olabilir anlamına gelir.
        //minus çıkarma işlemi yapar.
        myAge?.minus(2)
        //myAge null olabilir.

            //3
            //elvis oparetörü
            myAge=43
            val result=myAge?.minus(2)?:10
            //myAge null gelirse result=10 olsun
            //myAge null gelmez ise myAge den 2 çıkar.
            //Yani işlemi yap.
            //Sonuç 10 çıkar. Çünkü yukarıda myAge NULL atadık.
            //Eğer belli sayı atadıysan ki atamışsın 43 olmuş
            //Sonuç 41 çıkar.
            println(result)

            //4 Let
            myAge?.let() {
                println(myAge-20)
            }
            //myAge null değilse 20 çıkar.

        }
        //Yazdığın fun oncreate de çağır.
}


