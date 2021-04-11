package cx.poc.sfgpetclinickotlin

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

private val log = KotlinLogging.logger {}
@SpringBootApplication
class SfgPetClinicKotlinApplication

fun main(args: Array<String>) {
  runApplication<SfgPetClinicKotlinApplication>(*args)
  log.info("started")
}
