package org.com.zhump.dsp.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * dmp 自定分析 实体
 */
@Getter
@Setter
public class AdvertCustomPackage implements Serializable {

    /**包名称*/
    private String  name;
    /**需要包含的标签,同组内并集、不同组之间交集*/
    private Map<String,Object> tag_contain;
    /**需要过滤的标签,同组内并集、不同组之间交集*/
    private Map<String,Object> tag_filter;
    /** 1.包含的消费者样本文件,同组内并集、不同组之间
     交集；
     模版：
     {"key1":"path|idType,path|idType","key2":"pat
     h|idType"} ;
     2.idType 枚举值: "imei_md5", "idfa",
     "phone_number_md5", "mac_md5";
     3.path 是通过上传接口返回的路径*/
    private Map<String,Object> private_contain;
    /** 否 1.过滤的消费者样本文件,同组内并集、不同组之间
     交集；
     格式 与字段 private_contain 类似；
     app_contain*/
    private Map<String,Object> private_filter;
    /** 包含哪些 app；pkg 表示包名，至少选择 4 个；
     type 表示 app 类型*/
    private Map<String,Object> app_contain;
    /** 过滤哪些 app；pkg 表示包名，至少选择 4 个;格
     式 与字段 app_contain 类似*/
    private Map<String,Object> app_filter;
    /** 表示包含制定区域的人群
     1.data_origin 表示数据来源，数据来源，多选则
     用逗号分隔；枚举值：recentArrive(出现在此区
     域) , “homeAddress”(居住此区域) ,
     workAddress(工作此区域)
     2.start_time 表示经过开始时间；日期格式
     YYYYMMDDHH；当 data_origin 选择
     "recentArrive"时必填
     3.end_time 表示经过结束时间；日期格式
     YYYYMMDDHH；当 data_origin 选择
     "recentArrive"时必填
     4.points 表示每个闭合区域的经纬度点的集合；
     lng 表经度,lat 表纬度(必须是百度坐标系)*/
    private LbsContain lbs_contain;
    /** 需要包含的 分析完成的洞察任务 id,同组内并集、
     不同组之间交集*/
    private Map<String,Object> audience_contain;
    /** 需要过滤的 分析完成的洞察任务 id,同组内并集、
     不同组之间交集*/
    private Map<String,Object> audience_filter;
    /** 过滤区域人群;格式与字段 lbs_contian 类似*/
    private Lbsfilter lbs_filter;


    @Getter
    @Setter
    public static class LbsContain{
        private String start_time;

        private String data_origin;

        private String end_time;

        private List<Points> points = new ArrayList<Points>();

        @Getter
        @Setter
        public static class Points{

            private String address;

            private List<LngToLat> lngToLat = new ArrayList<LngToLat>() ;

            @Getter
            @Setter
            public static class  LngToLat{

                private String lng;

                private String lat;

            }
        }
    }

    @Getter
    @Setter
    public static class Lbsfilter{
        private String start_time;

        private String data_origin;

        private String end_time;

        private List<Points> points = new ArrayList<Points>() ;

        @Getter
        @Setter
        public static class Points{

            private String address;

            private List<LngToLat> lngToLat  = new ArrayList<LngToLat>() ;

            @Setter
            @Getter
            public static class  LngToLat{

                private String lng;

                private String lat;

            }
        }
    }

}
