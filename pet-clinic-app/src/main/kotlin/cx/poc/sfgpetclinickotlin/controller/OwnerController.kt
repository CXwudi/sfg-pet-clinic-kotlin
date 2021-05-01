package cx.poc.sfgpetclinickotlin.controller

import cx.poc.sfgpetclinickotlin.service.OwnerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("owners")
class OwnerController(val ownerService: OwnerService) {
  @RequestMapping("", "/", "index", "index.html")
  fun listOwners(model: Model): String {
    model["owners"] = ownerService.findAll()
    return "owners/index"
  }
}