package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  * Created by jinyong on 3/31/16.
  * email: jinyong1112@126.com
  */
@SpringBootApplication
class App

object App {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[App], args: _*)
  }
}
