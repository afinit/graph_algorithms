package graph_algorithms

import java.nio.file.Path

import scala.io.Source

object Graph {

  type Graph = Map[String, Vector[String]]

  def fromEdges(file: Path): Graph = {
    val lines = Source.fromFile(file.toString)
      .getLines.toVector
    val splitLines = lines
      .map(_.split("\t").toVector)
    lines
        .foreach(g => println(g.split("\t")))
    println(splitLines.groupBy(_.head))
    val startMap = splitLines
      .groupBy(_.head)
      .map { case (fromNode, toNodes) => fromNode -> toNodes.tail.head}
    splitLines.flatten.map {
      case node => node -> startMap.getOrElse(node, Vector.empty[String])
    }.toMap
  }

}
