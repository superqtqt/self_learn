package com.learn

/**
  * Created by lzadmin on 2016/10/7.
  */
object LearnFunction {
  def main(args: Array[String]) {
      println("this is the main function")
//    println(add(10))
//    println(time())
//    delayed(time())

//    println( apply( layout, 10) )
//
//    val name="liuzheng";
//    val prinCom=printv(name,_:String);
//
//    prinCom("is great")

    println(addX(10)(20))
  }

  def add(a:Int): Int ={
    return a+10
  }

  def time()={
    println("获取时间")
    System.nanoTime()
  }

  /**
    * =>表示Scala中的传名调用，将未计算的表达式直接传入，在内部进计算
    * @param t
    * @return
    */
  def delayed( t: => Long ) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }

  def apply(f:Int=>String,v:Int)=f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"

  def printv(v1:String,v2:String)={
    println("v1:"+v1+"\tv2:"+v2)
  }

  def addX(a:Int)(b:Int)={
    a+b
  }
}
