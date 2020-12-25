# spring-cloud-master

## 整体结构表

| 模块名  | 功能  | 描述|
| :------------ |:---------------:| -----:|
| spring-cloud-admin| 监控模块| 主要是监控各个服务的内存使用情况 |
| spring-cloud-commons| 公共工具类 |   工具类 |
| spring-cloud-db| 数据库模块        |    主要是相关实体类和数据库连接信息 |
| spring-cloud-eureka| 注册中心| 所有服务注册机 |
| spring-cloud-gateway| 网关 | 所有服务统一入口|
| spring-cloud-provide| 各个服务模块| 所有接口模块|
| spring-cloud-api|各个服务公共模块|支持远程调用，熔断机制|
| spring-cloud-sleuth|链路跟踪|所有服务链路跟踪器|
| spring-cloud-config|配置中心|存放所有配置文件，后续支持实时更新不需要重启项目|
