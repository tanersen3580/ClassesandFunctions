package com.tanersen.classesandfunctions

class lessons(var name:String,var number:Int,var point:Double) {
// Bu primary constructor
    fun test(){
        println("Test func çalıştı")
    }
    //Access levels (Erişebilirlik seviyeleri)
    //private-protected-internal-public
    //private - sadece yazdığım sınıf içinden kullanılabilir.
    //protected - yazdığım sınıfın içinden ve
    //aynı dosya içinde diğer sınıflardan da erişilebilir.
    //internal sadece kendi modullerimden ulaşılır
    //public heryerden ulaşılır.

    /*
    var name=""
    var numberofquestion=0
    var point=0.1
//Constructor tek satırda tüm verileri almanı sağlar
  constructor(name:String, numberofquestion:Int,point:Double) {
    //this ibaresi içinde cons.' ın içinde bulunduğu yapıyı
    //ifade eder.Burada this lessons sınıfını ifade eder.
    this.name=name
    this.numberofquestion=numberofquestion
    this.point=point
        println("Constructor çağrıldı.")
  }
     */

    // Bu yaptıklarımızı tek satırda yapan yapı
    // Kotline has primary constructor
    // Tek satır

}