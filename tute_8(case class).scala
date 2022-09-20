case class Point(var x: Int, var y: Int) {

    def +(that:Point) =  Point(this.x + that.x, this.y + that.y)
    def  move(dx:Int , dy:Int) = Point(this.x+ dx , this.y+dy)

    def distance(dis:Point) : Double = {
       var x_distance :Int = this.x - dis.x
          var y_distance :Int = this.y - dis.y
          var Distance:Int = scala.math.pow(x_distance,2).toInt +  scala.math.pow(y_distance,2).toInt
          scala.math.sqrt(Distance)
    }

    def invert() :Unit = {
        var temp = this.x
        this.x = this.y
        this.y = temp
    }

}

object Point extends App {


   import scala.io.StdIn.{readLine, readInt}   

      var p1  = Point(1,3)
      var p2  = Point(2,4)

      println("\n+ of two points : ")
      //print the sum of two points
       println(p1+p2)

  // move the point one  by  given number
       println("\nEnter a point x: ")
      var pnum_1 = readInt()
       println("Enter a point y: ")
      var pnum_2  = readInt()

       var answer =  p1.move(pnum_1,pnum_2)
       println(answer)

// distance between the two points 
        var answer_2 = p1.distance(p2)
        println("\nDistance between two points: ")
        println(answer_2)

//invert of  a point
        println("\nPoint after invert")
        p1.invert()
        println(p1)
         println("\n")

}