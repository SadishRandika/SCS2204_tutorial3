package package1.scala

object question04{

  def bookPrice(a: Int): Double = a * 24.95

  def discount(amount: Double): Double = amount * .4

  def shippingCost(a: Int): Double = a > 50 match {
    case true => 50 * 3 + (a - 50) * .75
    case _ => a * 3
  }

  def totalPrice(a: Int): Double = {
    var cost: Double = bookPrice(a) - discount(bookPrice(a)) + shippingCost(a)
    return cost
  }

  def main(args: Array[String]): Unit = {
    println("Total wholesale cost for 60 books =" + totalPrice(60))
  }

}
