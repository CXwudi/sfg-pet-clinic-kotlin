package cx.poc.sfgpetclinickotlin.service

import cx.poc.sfgpetclinickotlin.model.Vet


/**
 * @date 2021-04-25
 * @author CX无敌
 */
interface VetService {
  fun findById(find: Long): Vet
  fun save(vet: Vet): Vet
  fun findAll(): Set<Vet>
}