# taktin

A light weight and high performance traffic management platform based on OpenResty.

## Features

```md
核心是提供自定义、精细化的流量控制能力。
独立的流量管理服务。
基于 OpenResty 框架带来的 高并发、高性能。
```

## Application Scenarios

```md
A/B Test
灰度发布
动态配置
```

## Technology stack

* taktin-engine

> * [OVP](https://github.com/SunnnyChan/OVP)

* taktin-server

> * [restful-web](https://github.com/SunnnyChan/restful-web)

* taktin-web （UI）

* zookeeper

```text
Service register and discovery.
```

## Usage - 快速构建 Web 项目
* 获取源码
```sh
git clone https://github.com/apache/zeppelin.git
```
* 编译源码
```sh
mvn clean install
```
* 创建基于 restful-web 框架的 web 项目
```md
执行 restful-web/_dev/sh/rw-server/create_rw-server_project.sh 脚本

如 要在 /Users/sunny/WorkPlace 目录下 创建 名为 sunny-server 的web项目，执行：
cd /Users/sunny/WorkPlace  && sh create_rw-server_project.sh
```
```md
在 sunny-server/src/main/java/com/sunny/rw/server/modules 目录下 创建 mainClass：
SunnyServer.java
```
```java
public class SunnyServer extends AbstractRwServer {

  public static void main(String[] args) throws Exception {
    parserConf(args);
    SunnyServer rwServer = new SunnyServer();
    rwServer.startServer();
    rwServer.startModules();
  }

  private static void parserConf(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: <config file path>");
      System.exit(1);
    }
    ConfInit.init(args[0]);
  }
}
```
```md
实际上 restful-web 中的 rw-server 模块是一个创建Web应用的脚手架。
```
## Deploy

***Deploy taktin-engine***

***Deploy taktin-server***

***Execute SQL***

## [Doc.](_doc/README.md)