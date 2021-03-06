# 什么是Markdown
- Markdown 是一种轻量级标记语言，它允许人们使用易读易写的纯文本格式编写文档。

- Markdown 语言在 2004 由约翰·格鲁伯（英语：John Gruber）创建。

- Markdown 编写的文档可以导出 HTML 、Word、图像、PDF、Epub 等多种格式的文档。

- Markdown 编写的文档后缀为 .md, .markdown。
-------
******
_______

# Markdown基本操作

## 标题 

- 几个井号代表几级标题 最多有六级标题，比如：
# 我是一级标题
## 我是二级标题
----
---


## 段落
1. 段落
   - 段落没有特殊格式 在一段中换行  
  在行尾加两个空格回车 即可
   - 新起段落 回车空一行即可
  
    你看新起了一段
------

2. 字体
    - 强调字体用星号或者下划线
    - 一对代表斜体 两对代表加粗 三队代表加粗且斜体
    - 还有相应的快捷键

    *斜体*  
    **加粗**  
    ***加粗且斜体*** 
----

3. 分割线 
   - 你可以在一行中用三个以上的星号、减号、底线来建立一个分隔线，行内不能有其他东西。你也可以在星号或是减号中间插入空格。
-----
4. 删除线
   - 在文字两端加两个波浪号
    - 比如 ~~删除~~
  -----
5. 下划线
   - 下划线可以通过 HTML 的 u标签来实现：
   - 比如<u>你好吗</u>



-------
6. 数学公式
   - 需要第三方库 MathJax和KaTeX 
   - 行内一对$\theta=x^2$
   - 块级两对$$
\sum_{n=1}^\infty k
$$

- 数学公式需要专门的表示形式
- [数学符号公式](https://www.cnblogs.com/peaceWang/p/Markdown-tian-jia-Latex-shu-xue-gong-shi.html)
 




  -----
  ------

## 列表
- Markdown 支持有序列表和无序列表。
1. 无序列表使用星号(*)、加号(+)或是减号(-)作为列表标记，***这些标记后面要添加一个空格***，然后再填写内容。
  
    - 谁家今夜扁舟子，青枫浦上不胜愁
    - 落红不是无情物
      
    + 大江东去，浪淘尽，千古风流人物
    + 故垒西边，人道是，三国周郎赤壁。

    * 乱石穿空，惊涛拍岸，卷起千堆雪
      
    * 江山如画，一时多少豪杰
    * 遥想公瑾当年
  ------
  
2. ***有序列表使用数字并加上 . 号来表示***，如：
   1. 青青子衿，悠悠我心
   2. 纵我不往，子宁不嗣音？
   3. 青青子佩，悠悠我思
   4. 纵我不往，子宁不来？
-----
      
3. 列表嵌套
   1. 春雨诗词
        1. 好雨知时节，当春乃发生
        2. 清明时节雨纷纷，路上行人欲断魂
   2. 美景诗句
      1. 不知细叶谁裁出，二月春风似剪刀
      2. 人间四月芳菲尽，山寺桃花始盛开
----
----



## 区块
- ***Markdown 区块引用是在段落开头使用 > 符号 ，然后后面紧跟一个空格符号：***
- 区块引用可以三层嵌套使用
>清风徐来，水波不兴，举酒属客，诵明月之诗，歌窈窕之章。
>>少焉，月出于东山之上，徘回于斗牛之间
>>>后面不记得了
----
1. 区块中使用列表
>1. 春雨诗词
    >>1. 好雨知时节，当春乃发生
    >>2. 清明时节雨纷纷，路上行人欲断魂
>2. 美景诗句
    >>1. 不知细叶谁裁出，二月春风似剪刀
    >>2. 人间四月芳菲尽，山寺桃花始盛开 

-----
2. 列表中使用区块
    1. 春雨诗词
       > 1. 好雨知时节，当春乃发生
        >2. 清明时节雨纷纷，路上行人欲断魂
   2. 美景诗句
      >1. 不知细叶谁裁出，二月春风似剪刀
      >2. 人间四月芳菲尽，山寺桃花始盛开
 ----
 ----
 ## 代码  
 1.  如果是段落上的一个函数或片段的代码可以用反引号把它包起来上单引号，例如：
   `printf("hello.world");`函数
-----
 2. 你也可以用 ``` 包裹一段代码，并指定一种语言（也可以不指定,指定会 highlight）。

 ```javascript
    for(var i = 0;i < arr.length-1; i++){
        for(var j = i + 1;j < arr.length; j++;){
            if(arr[i] < arr[j]){
                var t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

    }
```
------
------
##  链接
1. [链接名称]（链接地址）
   比如：这是一个链接[百度](https://www.baidu.com)
-----
2. <链接地址>
   比如<https://www.bilibili.com/video/BV1si4y1472o?spm_id_from=333.337.search-card.all.click>
----
3. 高级链接，我们可以通过变量来设置一个链接，变量赋值在文档末尾进行，适用文中多次出现同一链接：
 比如：这是一个链接[百度][1]


 [ 1 ]: https://www.bilibili.com/?spm_id_from=333.788.0.0

 ----
----

## 图片 
-  形如 !+[图片说明]+()，括号后面可以是图片链接，也可以是图片位置，复制的时候是ctrl + alt + v
![B站](b站封面.jpg)
![歌神](zxy.jpg)
![小猫咪](2022-03-14-21-08-00.png)
![庐山瀑布](2022-03-14-21-13-42.png)
 [百度](https://www.baidu.com)
----
----
## 表格
- Markdown 制作表格使用 | 来分隔不同的单元格，使用 - 来分隔表头和其他行。
语法格式如下：
- 我们可以设置表格的对齐方式：

-: 设置内容和标题栏居右对齐。
:- 设置内容和标题栏居左对齐。
:-: 设置内容和标题栏居中对齐。
实例如下：

| 姓名   | 学号 | 性别 | 年龄  |
| :------ | --- | ---: | :---: |
| 张永诚 | 88   |   男 |  18   |
| 黄飞鸿 | 87   |   女 |  18   |


----
----









