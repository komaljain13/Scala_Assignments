def pascal( c:Int, r:Int):Int = {
  if(c == r || c == 0)  1
  else pascal(c-1,r-1) + pascal(c,r-1)
}

pascal(2,5)

