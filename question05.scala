package package1.scala

object question05 extends App{
  def easyPace(d: Double): Double = d * 8

  def tempo(d: Double): Double = d * 7

  def runTimeTotal(d1: Double, d2: Double, d3: Double): Double = easyPace(d1) + tempo(d2) + easyPace(d3)

  printf("\nTotal run Time is =%.2f\n ", runTimeTotal(2, 3, 2))
}
