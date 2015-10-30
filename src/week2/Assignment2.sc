object Assignment2 {

  val  filter = ( predicate :Int => Boolean, xs :List[Int] )  =>  {
    for(  x <- xs;  if predicate( x )  )  yield x
  }

  val candidates = List( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 )

  val odd : Int => Boolean  =  ( x :Int )  =>  x % 2 == 1

  candidates.filter(odd)


  filter(odd, candidates)
  filter(x => x %2 ==0, candidates)


  //  val even: Int => Boolean  =  ( x :Int )  =>  !odd(x)
  //  list.filter(even)
  //  filter(even, candidates)

  //  val isFactorOf  =  ( num :Int, factor:Int ) => { num % factor == 0}
  //  isFactorOf(4,3)
  //  isFactorOf(4,2)

  //  val isFactorOf  =  ( num :Int ) =>  (factor :Int ) => { num % factor == 0}
  //  isFactorOf(4)(2)
  // filter(isFactorOf(4), candidates)

  //  val prime = ( num :Int )  =>  num > 1  &&  filter( isFactorOf( num ), (2 to num/2).toList ).isEmpty
  //  prime(5)
  //  println ( "Prime Numbers " + candidates.filter(prime))

}
