package algorithms.medium.implementation

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class LRUCacheTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val cache = new LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    cache.get(1) shouldBe 1
    cache.put(3, 3)
    cache.get(2) shouldBe -1
    cache.put(4, 4)
    cache.get(1) shouldBe -1
    cache.get(3) shouldBe 3
    cache.get(4) shouldBe 4
  }
}
