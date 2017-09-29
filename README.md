# Chisel3教程

## 目录
doc中是chisel相关的资料，包括本次的PPT(chisel-tutorial.pdf)。
src中是实验的示例代码。

## 配置环境

### (Ubuntu-like) Linux

1. 安装Java
   ```
   sudo apt-get install default-jdk
   ```
1. [安装sbt](http://www.scala-sbt.org/release/docs/Installing-sbt-on-Linux.html),
    ```
    echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
    sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 642AC823
    sudo apt-get update
    sudo apt-get install sbt
    ```

## 运行
src/Test.scala中是示例代码，运行`bash gen.sh`即可生成verilog，我们需要的Lamp Module的verilog在src/Lamp.v中。
由于每次运行sbt，他都需要检查更新以来，使得运行速度偏慢，建议使用interactive模式。即运行`sbt`，进入sbt的shell之后，输入`runMain Driver`即可生成verilog。
