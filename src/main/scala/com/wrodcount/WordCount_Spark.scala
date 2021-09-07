package com.wrodcount

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName WordCount_Spark
 * @Description spark计算wordcount
 * @Author lau
 * @Date 2021/9/7 20:27
 * @Version 1.0
 **/
object WordCount_Spark {
  /**
   * @Author: liuminghui
   * @Description: //计算单词统计
   * @Date: 20:45 2021/9/7
   * @Param [args]
   * @Return void
   **/
  def main(args: Array[String]): Unit = {
    /*
    if (args.length != 1){
      System.err.println("please input data args")
      System.exit(1)
    }
     */

    val sparkConf = new SparkConf().setMaster("local[2]").setAppName("wordCount_Spark")
    val sc = new SparkContext(sparkConf)
    val arr = Array("scala","java","scala","spark","haddop","spark","spark")
    val arr_rdd = sc.makeRDD(arr)
    val words = arr_rdd.flatMap(_.split(" ")).filter(stop_words(_)).map((_,1))
    val result = words.reduceByKey(_+_).sortBy(_._2,false).collect().foreach(println(_))

    sc.stop()
  }

  /**
   * @Author: liuminghui
   * @Description: //过滤掉停用词
   * @Date: 21:11 2021/9/7
   * @Param [str]
   * @Return boolean
   **/
  def stop_words(str:String):Boolean={
    if(str.equals("java") || str.equals("spark")) return false
    return true
  }

}
