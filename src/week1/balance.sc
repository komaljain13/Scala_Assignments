def balance(chars: List[Char]): Boolean = {
  var count : Integer = 0

  def checkBracket(chars:List[Char]): Boolean = {
    if(count<0) return false;
    if(chars.isEmpty) return count == 0
    count = if(chars.head == '(')  count + 1 else count
    count = if(chars.head == ')')  count - 1 else count
    checkBracket(chars.tail)
  }
  checkBracket(chars)
}

balance("(if (zero? x) max (/ 1 x))".toList)
balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
balance("())(".toList)
balance(")(".toList)
balance(":-)".toList)