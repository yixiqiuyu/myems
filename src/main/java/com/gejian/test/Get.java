package com.gejian.test;
import java.io.BufferedReader;//导入java.io包下的BufferedReader类
import java.io.IOException;//导入java.io包下的IOException类
import java.io.InputStream;//导入java.io包下的InputStream类
import java.io.InputStreamReader;//导入java.io包下的InputStreamReader类
import java.net.MalformedURLException;//导入java.net包下的MalformedURLException类
import java.net.URL;//导入java.net包下的URL类
import java.net.URLConnection;//导入java.net包下的URLConnection类
public class Get{//类名
    public static void main(String[] args){//程序主函数
        new ReadByGet().start();//调用新建的ReadByGet类
    }
    static class ReadByGet extends Thread{//定义一个静态的ReadByGet类继承于Thread类
        public void run(){//run方法，里面包含需要执行的任务
            try{//try代码块，当发生异常时会转到catch代码块中
                URL url=new URL("https://www.youku.com");//创建一个URL类的实例，并指定网址
                URLConnection connection=url.openConnection();//创建实例连接指定URL上的内容
                InputStream is=connection.getInputStream();//获取内容的字节流
                InputStreamReader isr=new InputStreamReader(is,"utf-8");//将字节流包装为字符串流，并制定编码格式为utf-8
                BufferedReader br=new BufferedReader(isr);//创建一个实例用来存放转换后的字符
                String line;//定义一个字符串类型变量
                StringBuilder builder=new StringBuilder();//创建实例
                while ((line=br.readLine()) !=null){//读取信息，并且当信息不为空时
                    builder.append(line+"\n");//append方法使builder包含line中的所有信息
                }
                br.close();//关闭流
                isr.close();//关闭流
                is.close();//关闭流
                System.out.println(builder);//输出读取的信息
            }
            catch (MalformedURLException e){//当try代码块有异常时转到catch代码块
                e.printStackTrace();//打印异常所在位置及原因
            }
            catch (IOException e){//当try代码块有异常时转到catch代码块
                e.printStackTrace();//打印异常所在位置及原因
            }
        }
    }
}