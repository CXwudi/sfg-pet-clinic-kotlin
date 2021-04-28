package cx.poc.sfgpetclinickotlin.service

import cx.poc.sfgpetclinickotlin.model.Owner
import cx.poc.sfgpetclinickotlin.model.Pet
import cx.poc.sfgpetclinickotlin.model.Vet

/**
 * @date 2021-04-28
 * @author CX无敌
 */

class OwnerServiceMap : AbstractMapService<Owner, Long>(), CrudService<Owner, Long> {
  override fun save(`object`: Owner) {
    super.save(`object`.id!!, `object`)
  }
}

class PetServiceMap : AbstractMapService<Pet, Long>(), CrudService<Pet, Long> {
  override fun save(`object`: Pet) {
    super.save(`object`.id!!, `object`)
  }
}

class VetServiceMap : AbstractMapService<Vet, Long>(), CrudService<Vet, Long> {
  override fun save(`object`: Vet) {
    super.save(`object`.id!!, `object`)
  }
}