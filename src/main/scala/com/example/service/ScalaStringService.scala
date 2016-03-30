package com.example.service

import org.springframework.stereotype.Service

/**
  * Created by jinyong on 11/6/15.
  * email: jinyong1112@126.com
  */
@Service
class ScalaStringService {
  def reverse(s:String) = s.reverse

  def test():Unit = {
    println("Hello world!")
  }
}

object ScalaStringService {
  def main(args: Array[String]): Unit = {
    println("Hello world")
  }
  def add(a:Int, b:Int) = a + b + 1
}
