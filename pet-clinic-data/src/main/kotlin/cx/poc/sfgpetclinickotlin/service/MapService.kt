package cx.poc.sfgpetclinickotlin.service

/**
 * @date 2021-04-28
 * @author CX无敌
 */
abstract class AbstractMapService<T, ID> {
  protected val map: MutableMap<ID, T> = HashMap()
  fun findAll(): Set<T> = map.values.toSet()
  fun findById(id: ID): T? = map[id]
  fun save(id: ID, `object`: T): T? = map.put(id, `object`)
  fun deleteById(id: ID) { map.remove(id) }
  fun delete(`object`: T) { map.entries.removeIf { it.value == `object` }}
}
