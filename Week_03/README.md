学习笔记

### 知识回顾

树的面试题解法一般都是递归，原因：

* 结点的定义
* 重复性（自相似性）



### 递归 Recursion

递归 - 循环

通过函数体来进行的循环

#### 三个特性

* 向下进入到不同的层；向上又回到原来一层。
* 每次跳层时，都会把某些东西带到下一层去（函数参数）
* 每层都是独立存在的，出了重要东西（函数参数），其他东西不会发生任何变化



#### 代码模版

```java
// Java
public void recursion(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```



#### 递归的思维点

1. 不要进行人肉递归（最大的误区）---- 前期可以，如果要真正掌握，请放弃
2. 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）
3. 数学归纳法思想

### 分治 （Divide-and-Conquer）

##### 代码模版

```java
//Java
private static int divide_conquer(Problem problem, ) {
  // recursion terminator
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  
  // process current problem
  subProblems = split_problem(problem)
  // process current problem
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
    
  // process and generate the final result 
  result = process_result(res0, res1);
  
  return result;
}
```



### 回溯（Backtracking）

回溯法采用试错的思想，它尝试分步的去解决一个问题。在分布解决问题的过程中，当它通过尝试发现现有的分布答案不能得到有效的正确的解答的时候，它将取消上一步甚至是上几步的计算，再通过其他的可能分布解答再次尝试寻找问题的答案。

回溯法通常用最简单的递归方法来实现，在反复重复上述的步骤后可能出现两种情况：

* 找到一个肯能存在的正确的答案；
* 在尝试了所有可能的分布方法后宣告该问题没有答案

在最坏的情况下，回溯法会导致一次复杂度为指数时间的计算