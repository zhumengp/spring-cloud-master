package org.com.zhump.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
*流水号创建
 */
public class SerialNumBuilderUtil {
    /**
     * 初始化 62 进制数据，索引位置代表字符的数值，比如 A代表10，z代表61等
     */
    private static String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static int scale = 62;
    private static Random random=new Random();
    private static Object lock = new Object();
    private static long snum=0;
    private static volatile long LAST_TIME = -1;
    private static final AtomicInteger COUNT = new AtomicInteger();

    /**
     * 广告流水id
     * @return
     */
    public static String buildAdverSerial(String serialPrefix) {
        StringBuilder sb = new StringBuilder();
        int remainder = 0;
        long curTime = System.currentTimeMillis()/1000;
        int curCount = 0;
        synchronized (SerialNumBuilderUtil.class) {
            if (curTime < LAST_TIME) {
                curTime = LAST_TIME;
            } else if (curTime > LAST_TIME) {
                LAST_TIME = curTime;
                COUNT.set(0);
            }
            if (COUNT.get()>=999){
                return null;
            }
            curCount = COUNT.incrementAndGet();
        }
        long num = curTime * 1000 + curCount;
        while (num > scale - 1) {
            /**
             * 对 scale 进行求余，然后将余数追加至 sb 中，由于是从末位开始追加的，因此最后需要反转（reverse）字符串
             */
            remainder = Long.valueOf(num % scale).intValue();
            sb.append(chars.charAt(remainder));

            num = num / scale;
        }

        sb.append(chars.charAt(Long.valueOf(num).intValue()));
        return serialPrefix+sb.reverse().toString();
    }

    /**
     * 生成普通流水号
     * @param serialPrefix 平台编号
     * @return
     */
    public static String makeSerialId(String serialPrefix){
        StringBuffer sb=new StringBuffer(serialPrefix);
        synchronized (lock) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            sb.append(dateFormat.format(new Date()));
            if(snum>=99){
                snum=0;
            }
            snum++;
            sb.append(random.nextInt(999));
            sb.append(String.format("%02d", snum));
            try{
                Thread.sleep(1l);
            }catch(Exception ex){
                try{
                    Thread.sleep(1l);
                }catch(Exception exx){
                }
            }
        }
        return sb.toString();
    }
}
