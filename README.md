## RecyclerView的基本使用
>RecyclerView 相较于之前的ListView/GridView，
 它使用的原理也是适配器模式，只是多了一个布局管理器LayoutManager，它内部是依赖于LayoutManager来实现布局样式

##### LayoutManger是个抽象类，共有三个实现类：

	1. LinearLayoutManger
	2. GridLayoutManger
	3. StaggeredGridLayoutManger

![](http://i.imgur.com/NDusQz1.png)

##### 基本的使用步骤如下:
	1. 创建LayoutManger对象,mXxxLayoutManager = new XxxLayoutManager(this);
	2. 对LayoutManager进行配置,mXxxLayoutManager.setXxx(...);
	3. mRecyclerView.setLayoutManger(mLayoutManger);
	4. mRecyclerView.setAdapter(mAdapter);

**当然RecyclerView还有更加灵活的使用方式：**

- 可以随意设置内部Item的显示方向，并修改条目的显示顺序，是正项还是逆向显示。

##### 三种LayoutManger可用来便捷的实现瀑布流的效果图如下：

* LinearLayoutManger

![](http://i.imgur.com/ReSvdEQ.png)

* GridLayoutManager

![](http://i.imgur.com/4aQkRiw.png) 

* StaggeredGridLayoutManager

![](http://i.imgur.com/Q24QD3L.png)
