import org.apache.log4j.Logger;

object testScala {

  private val logger = Logger.getLogger(testScala.getClass);

  def main(args: Array[String]): Unit = {
    println("scala test is successful!")
    // 记录debug级别的信息
    logger.debug("This is debug message.")
    // 记录info级别的信息
    logger.info("This is info message.")
    // 记录error级别的信息
    logger.error("This is error message.")
    println(add(1,6))
  }

  /**
   * @Author: liuminghui
   * @Description: //TODO
   * @Date: 22:33 2021/9/4
   * @Param [a, b]
   * @Return int
   **/
  def add(a:Int,b:Int):Int={
    return a+b;
  }

}
