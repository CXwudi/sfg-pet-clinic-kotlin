package cx.poc.sfgpetclinickotlin.service

import cx.poc.sfgpetclinickotlin.model.Owner
import cx.poc.sfgpetclinickotlin.model.Pet
import cx.poc.sfgpetclinickotlin.model.Vet
import org.springframework.stereotype.Service

/**
 * @date 2021-04-28
 * @author CX无敌
 */
@Service class OwnerServiceMap : AbstractMapService<Owner, Long>(), OwnerService {
  override fun findByLastName(lastName: String): Owner {
    TODO("Not yet implemented")
  }

  override fun save(`object`: Owner) {
    super.save(`object`.id!!, `object`)
  }
}

@Service class PetServiceMap : AbstractMapService<Pet, Long>(), PetService {
  override fun save(`object`: Pet) {
    super.save(`object`.id!!, `object`)
  }
}

@Service class VetServiceMap : AbstractMapService<Vet, Long>(), VetService {
  override fun save(`object`: Vet) {
    super.save(`object`.id!!, `object`)
  }
}