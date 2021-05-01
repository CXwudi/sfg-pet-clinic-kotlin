package cx.poc.sfgpetclinickotlin.service

import cx.poc.sfgpetclinickotlin.model.BaseEntity
import mu.KotlinLogging
import kotlin.properties.ReadOnlyProperty

private val log = KotlinLogging.logger {}
/**
 * @date 2021-04-28
 * @author CX无敌
 */
abstract class AbstractMapService<T: BaseEntity, ID : Long> {
  protected val map: MutableMap<Long, T> = HashMap()
  private val nextId: Long by getNextId()

  private fun getNextId(): ReadOnlyProperty<AbstractMapService<T, ID>, Long> {
    return ReadOnlyProperty { _, _ -> map.size.toLong() }
  }

  fun findAll(): Set<T> = map.values.toSet()
  fun findById(id: ID): T? = map[id]
  fun save(`object`: T): T {
    `object`.id = nextId
    log.debug { "object new id = ${`object`.id}" }
    map[`object`.id!!] = `object`
    return `object`
  }
  fun deleteById(id: ID) { map.remove(id) }
  fun delete(`object`: T) { map.entries.removeIf { it.value == `object` }}
}
