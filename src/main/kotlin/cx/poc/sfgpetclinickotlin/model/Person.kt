package cx.poc.sfgpetclinickotlin.model

/**
 * @date 2021-04-10
 * @author CX无敌
 */
open class Person(
  var firstName: String = "",
  var lastName: String = ""
)

/**
 * @date 2021-04-10
 * @author CX无敌
 */
class Vet(
  firstName: String = "",
  lastName: String = ""
) : Person(firstName, lastName)

/**
 * @date 2021-04-10
 * @author CX无敌
 */
class Owner(
  firstName: String = "",
  lastName: String = ""
) : Person(firstName, lastName)
