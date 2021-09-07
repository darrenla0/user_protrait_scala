package util

/**
 * @ObjectName ParamsUtil
 * @Description 配置文件类
 * @Author lau
 * @Date 2021/9/7 20:24
 * @Version 1.0
 **/
object ParamsUtil {

  /**
   * @Author: liuminghui
   * @Description: //spark配置参数
   * @Date: 21:41 2021/9/7
   * @Param
   * @Return
   **/
  object spark{
    val SPARK_MASTER="local[2]"
    val SPARK_APPNAME="wordcount_spark"
  }

  /**
   * @Author: liuminghui
   * @Description: //kafka配置参数
   * @Date: 20:26 2021/9/7
   * @Param
   * @Return
   **/
  object kafka{

  }

  /**
   * @Author: liuminghui
   * @Description: //mysql配置参数
   * @Date: 20:25 2021/9/7
   * @Param
   * @Return
   **/
  object mysql{

  }

  /**
   * @Author: liuminghui
   * @Description: //hbase配置参数
   * @Date: 20:53 2021/9/7
   * @Param
   * @Return
   **/
  object hbase{

  }

}
