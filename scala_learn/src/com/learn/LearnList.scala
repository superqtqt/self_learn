package com.learn

/**
  * Created by lzadmin on 2016/10/7.
  */
object LearnList {

  def main(args: Array[String]) {
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    for (x<-site){
      println(x)
    }
    for(y<-nums){
      println(y)
    }
  }

}
