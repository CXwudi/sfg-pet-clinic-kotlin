package cx.poc.sfgpetclinickotlin.controller

import cx.poc.sfgpetclinickotlin.service.VetService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("vets")
class VetController(val vetService: VetService) {
  @RequestMapping("", "/", "index", "index.html")
  suspend fun listVets(model: Model): String {
    model["vets"] = vetService.findAll()
    return "vets/index"
  }
}