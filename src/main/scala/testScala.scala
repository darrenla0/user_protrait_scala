import org.apache.log4j.Logger;

object testScala {

  private val logger = Logger.getLogger(testScala.getClass);
  //private val testjava = new testjava();

  def main(args: Array[String]): Unit = {
    println("scala test is successful!")
    // 记录debug级别的信息
    logger.debug("This is debug message.")
    // 记录info级别的信息
    logger.info("This is info message.")
    // 记录error级别的信息
    logger.error("This is error message.")
    println(addScala(1,6))
    //scala对象调用java方法
    println(testjava.addJava(2,8))
  }

  /**
   * @Author: liuminghui
   * @Description: //TODO
   * @Date: 22:33 2021/9/4
   * @Param [a, b]
   * @Return int
   **/
  def addScala(a:Int,b:Int):Int={
    return a+b;
  }

  
}
