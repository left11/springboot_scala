package com.example.controller

import java.util.Random

import com.example.service.ScalaStringService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam, _}

/**
  * Created by jinyong on 11/6/15.
  * email: jinyong1112@126.com
  */
@RestController
class ScalaController {

  @Autowired
  var scalaStringService: ScalaStringService = _

  /**
    * give me a seed i will return you a random long with this seed
    *
    * @param seed the seed
    * @return the random Long
    */
  @RequestMapping(value = Array("/random"), method = Array(RequestMethod.GET))
  def randomLong(@RequestParam(required = false, defaultValue = "1") seed: Long): Long = {
    val random = new Random(seed)
    print("hello world")
    random.nextLong()
  }

  @RequestMapping(value = Array("/reverse"))
  def reverse(@RequestParam(value = "name", required = false, defaultValue = "gonynij") name: String) = {
    scalaStringService.reverse(name)
  }

  @RequestMapping(value = Array("/coll"))
  def coll() = {
    Map[String, String]("Hello" -> "world")
  }
}
