import scala.collection.mutable.ArrayBuffer

object PUSH_ZEROS_TO_END {
  def main(args: Array[String]): Unit = {
    var arr = ArrayBuffer[Int](0,1,2,0,2,0,0,0,0,1,1,1,1,0)
    var i, j  = 0
    var a = arr(i)
    var b = arr(j)
    while( i <= arr.length-1)
    {
      if(arr(i) == 0 && arr(j)!= 0)
      {
        i = i+1
        j = j+1
      }
      else if(arr(i) != 0 && arr(j) == 0)
      {
        var temp = arr(i)
        arr(i) = arr(j)
        arr(j) = temp
        j = j+1
      }
      else if(arr(i) ==0 && arr(j) ==0)
      {
        i = i+1
      }
    }
    for ( k <- 0 to arr.length-1)
    {
      print(arr(k)+" ")
    }

  }

}
}
