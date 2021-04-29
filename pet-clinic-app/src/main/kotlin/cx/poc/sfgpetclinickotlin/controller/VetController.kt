package cx.poc.sfgpetclinickotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("vets")
class VetController {
  @RequestMapping("", "/", "index", "index.html")
  fun listVets() = "vets/index"
}