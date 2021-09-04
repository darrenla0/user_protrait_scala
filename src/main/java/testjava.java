import org.apache.log4j.Logger;

public class testjava {

    private static Logger logger = Logger.getLogger(testjava.class);

    public static void main(String[] args) {
        System.out.println("java test is successful !");
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
        System.out.println(add(1,6));
    }
    
    /**
     * @Author: liuminghui
     * @Description: //TODO
     * @Date: 22:34 2021/9/4
     * @Param [a, b]
     * @Return int
     **/
    public static int add(int a,int b){
        return a+b;
    }

}

