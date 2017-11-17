package ess

import org.scalatest.{Matchers, FunSuite}

class ExampleSpec extends FunSuite with Matchers {
  test("Example.addTwo 5 + 2 = 7 ") {
    Example.addTwo(5) should equal(7)
  }
}
