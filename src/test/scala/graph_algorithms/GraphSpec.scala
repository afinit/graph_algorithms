package graph_algorithms

import org.scalatest.{FunSpec, Matchers}
import java.nio.file.Paths

class GraphSpec extends FunSpec with Matchers {
  describe("graph") {
    it("test reading of testGraph1.txt") {
      val testGraphPath = Paths.get(getClass.getClassLoader.getResource("testGraph1.txt").toURI)
      val actual = Graph.fromEdges(testGraphPath)
      val expected = Map(
        "A" -> Vector("B","C"),
        "B" -> Vector("A"),
        "C" -> Vector.empty[String]
      )

      actual shouldBe expected
    }
  }
}
