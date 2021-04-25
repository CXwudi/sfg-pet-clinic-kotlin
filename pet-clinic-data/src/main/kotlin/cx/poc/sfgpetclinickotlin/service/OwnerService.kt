package cx.poc.sfgpetclinickotlin.service

import cx.poc.sfgpetclinickotlin.model.Owner

/**
 * @date 2021-04-25
 * @author CX无敌
 */
interface OwnerService {
  fun findByLastName(lastName: String): Owner
  fun findById(find: Long): Owner
  fun save(owner: Owner): Owner
  fun findAll(): Set<Owner>
}