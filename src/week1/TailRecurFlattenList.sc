import scala.collection.mutable

def flatten(input:List[Object])={
  def simplify(output:List[Any],input:List[Any]):List[Any]={
    if(input.isEmpty) output
    else{
      def elem=input.head
      if (elem.isInstanceOf[List[Any]]) simplify(output,input.head.asInstanceOf[List[Any]])
      else {
        println(elem)
        simplify(output:+elem,input.tail)
      }
      simplify(output,input.tail)
    }
  }
  simplify(List(),input)
}

val input = List(List(5,4),List(5,List(8,9),5))
input :+1
flatten(input)


/*
def flatten(input:List[Any])={

    def simplify(output:List[Any],input:List[Any],balance:List[Any] ):List[Any]={
      if(input.isEmpty) output
      else{
        def elem=input.head
        if (elem.isInstanceOf[List[Any]]) simplify(output,elem.asInstanceOf[List[Any]], input.tail)
        else simplify(output:+elem,input.tail, input.tail)
        simplify(output, balance, balance)
        //simplify(output,in
        // put.tail)
      }

    }
    simplify(List(),input, input)
  }

val input = List(1,List(5,4),List(5,List(8,9),5))
flatten(input)



 */