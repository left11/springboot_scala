package com.example.controller

import java.util.Random

import org.springframework.web.bind.annotation.{RequestParam, RequestMethod, RequestMapping, RestController}

/**
  * Created by jinyong on 11/6/15.
  * email: jinyong1112@126.com
  */
@RestController
class ScalaController {

  /**
    * give me a seed i will return you a random long with this seed
    * @param seed   the seed
    * @return       the random Long
    */
  @RequestMapping(value = Array("/random"), method = Array(RequestMethod.GET))
  def randomLong(@RequestParam(required = false, defaultValue = "1") seed:Long):Long = {
    val random = new Random(seed)
    Math.abs(random.nextLong())
  }
}
