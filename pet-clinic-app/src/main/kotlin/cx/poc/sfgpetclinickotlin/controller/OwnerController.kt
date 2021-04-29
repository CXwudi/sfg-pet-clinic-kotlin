package cx.poc.sfgpetclinickotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("owners")
class OwnerController {
  @RequestMapping("", "/", "index", "index.html")
  fun listOwners() = "owners/index"
}