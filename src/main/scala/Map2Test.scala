object Map2Test extends App{
  def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = {
    for {
      aval <- a;
      bval <- b
    } yield f(aval, bval)
  }

  val opt1 = Some(1)
  val opt2 = Some(2)
  println(map2(opt1, opt2)(_ + _))

}

