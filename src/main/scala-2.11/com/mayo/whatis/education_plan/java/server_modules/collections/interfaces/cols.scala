
import java.util._
import java.awt.Color
import java.util.function.Predicate

object sheet extends App {
  val colors = new ArrayList[Color]
  colors.add(Color.RED)
  colors.add(Color.RED)
  colors.add(Color.BLUE)
  colors.add(Color.BLACK)
  colors.add(Color.GRAY)
  colors.add(Color.YELLOW)
  val stream = colors.stream().toArray.toList.filter(e => e == Color.RED)
}