package cx.poc.sfgpetclinickotlin.service

import cx.poc.sfgpetclinickotlin.model.Owner
import cx.poc.sfgpetclinickotlin.model.Pet
import cx.poc.sfgpetclinickotlin.model.Vet

/**
 * @date 2021-04-28
 * @author CX无敌
 */
interface CrudService<T, ID> {
  fun findAll(): Set<T>
  fun findById(id: ID): T?
  fun save(`object`: T)
  fun delete(`object`: T)
  fun deleteById(id: ID)
}

interface OwnerService : CrudService<Owner, Long>{
  fun findByLastName(lastName: String): Owner
}

interface PetService : CrudService<Pet, Long>

interface VetService : CrudService<Vet, Long>