package com.learn

/**
  * Created by lzadmin on 2016/10/7.
  */
object LearnClosure {

  def main(args: Array[String]) {
    println(multiplier(10))
//    var testV=java.lang.String.format("this is the test word %d and string is:%s",10,"test")
//    println(testV)
  }

  var factor = 10;
  val multiplier = (i: Int) => i * factor;
}
