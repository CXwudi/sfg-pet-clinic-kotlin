package cx.poc.sfgpetclinickotlin.model

import java.time.LocalDate

/**
 * @date 2021-04-10
 * @author CX无敌
 */
open class Pet(
  var petType: PetType? = null,
  var owner: Owner? = null,
  var birthDate: LocalDate? = null
) : BaseEntity()

class PetType(
  var name: String = ""
) : BaseEntity()
