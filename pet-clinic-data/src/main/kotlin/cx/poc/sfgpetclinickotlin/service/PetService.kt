package cx.poc.sfgpetclinickotlin.service

import cx.poc.sfgpetclinickotlin.model.Pet


/**
 * @date 2021-04-25
 * @author CX无敌
 */
interface PetService {
  fun findById(find: Long): Pet
  fun save(pet: Pet): Pet
  fun findAll(): Set<Pet>
}