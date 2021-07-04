package cx.poc.sfgpetclinickotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * @date 2021-04-28
 * @author CX无敌
 */
@Controller
class IndexController {
  @RequestMapping("", "/", "index", "index.html")
  suspend fun index() = "index"
}

