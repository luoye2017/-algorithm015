学习笔记

### 字典树（Trie）

#### 基本结构

字典树，即Trie树，又称单词查找树或键树，是一种树形结构。典型的应用是用于统计和排序大量的字符串（但不仅限于字符串），所以经常被搜索引擎系统用于文本词频统计。

它的优点是：最大限度地减少无谓的字符串比较，查询效率比哈希表高。

#### 基本性质

1. 结点本身不存完整单词
2. 从根结点到某一结点，路径上经过的字符连接起来，为该结点对应的字符串
3. 每个结点的所有子结点路径代表的字符都不相同

#### 核心思想

Trie树的核心思想是空间换时间

利用字符串的公共前缀来降低查询时间的开销以达到提高效率的目的



### 并查集

#### 基本操作

* makeSet(s)：建立一个新的并查集，其中包含s个单位素集合
* unionSet(x,y)：把元素x和元素y所在的集合合并，要求x和y所在的集合不相交，如果相交则不合并
* find(x)：找到元素x所在的集合的代表，该操作也可以用于判断两个元素是否位于同一个集合，只要将它们各自的代表比较一下就可以了



### 初级搜索

1. 朴素搜索

2. 优化方式：不重复，剪枝

3. 搜索方向：

   DFS：depth first search 

   BFS:   breadth first search 

   双向搜索，启发式搜索



### 二叉搜索树

二叉搜索树，也称二叉搜索树，有序二叉树（Ordered Binary Tree），排序二叉树（Sorted Binary Tree）,是指一颗空树或者具有下列性质的二叉树：

1. 左子树上所有结点的值均小于它的根结点的值

2. 右子树上所有结点的值均大于它的根结点的值

3. 依次类推，左，右子树也分别为二叉搜索树

   中序遍历：升序遍历



### AVL树

Balance Factor(平衡因子)

是它的左子树的高度减去它的右子树的高度（有时相反）

Balance factor = {-1, 0 , 1}

#### 特点

* 平衡二叉树
* 每个结点存balance factor = {-1, 0 , 1}
* 四种旋转操作

#### 缺点

结点需要存储额外信息，且调整次数频繁



### 红黑树（Red-Black Tree）

红黑树是一个近似平衡的二叉搜索树（Binary Search Tree），它能够确保任何一个结点的左右子树的高度差小于两倍，具体来说，红黑树是满足以下条件的二叉搜索树

* 每个结点要么是红色，要么是黑色
* 根结点是黑色
* 每个叶结点（NIL结点，空结点）是黑色
* 不能有相邻接的两个红色结点
* 从任一结点到其每个叶子的所有路径都包含相同数据的黑色结点

#### 对比

* AVL trees provide faster lookups than red-black tree because they are more strictly balanced
* Red-black tree provide faster insertion and removal operations than avl trees as fewer rotations are done due to relatively relaxed balancing
* AVL trees store balance factors or heights with each node,thus requires storage for an integer per node whereas red-black tree requires only 1 bit of information per node.
* red black trees are used in most of the language libraries like map,multimap,multisetin C++ whereas AVL trees are used in database where faster retrievals are required.





 