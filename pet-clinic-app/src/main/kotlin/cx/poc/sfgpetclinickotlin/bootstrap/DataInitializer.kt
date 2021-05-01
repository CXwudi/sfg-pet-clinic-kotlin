package cx.poc.sfgpetclinickotlin.bootstrap

import cx.poc.sfgpetclinickotlin.model.Owner
import cx.poc.sfgpetclinickotlin.model.Vet
import cx.poc.sfgpetclinickotlin.service.OwnerService
import cx.poc.sfgpetclinickotlin.service.OwnerServiceMap
import cx.poc.sfgpetclinickotlin.service.VetService
import cx.poc.sfgpetclinickotlin.service.VetServiceMap
import mu.KotlinLogging
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * @date 2021-04-30
 * @author CX无敌
 */
private val log = KotlinLogging.logger {}
@Component
class DataInitializer(
  val ownerService: OwnerService = OwnerServiceMap(),
  val vetService: VetService = VetServiceMap()
) : CommandLineRunner{

  override fun run(vararg args: String?) {
    for (i in 1L..2L){
      val owner = Owner("fname$i", "lname$i")
      owner.id = i
      ownerService.save(owner)
    }
    log.info { "Loaded Owners..." }

    for (i in 1L..2L){
      val vet = Vet("fname$i", "lname$i")
      vet.id = i
      vetService.save(vet)
    }
    log.info { "Loaded Vets..." }
  }
}