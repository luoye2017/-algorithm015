学习笔记

### 动态规划

* simplifying a complicated problem by breaking it down into simpler sub-problem
* Divide & Conquer + Optimal substructure （分治 + 最优子结构）

#### 关键点

**动态规划**和**递归**或者**分治**没有根本上的区别（关键是看有没有最优解）

共性：找到重复子问题

差异性：最优子结构，中途可以淘汰次优解

1. 最优子结构opt[n] = best_of(opt[n-1],opt[n-2])

2. 存储中间状态：opt[i]

3. 递推公式（美其名曰：状态转移方程或者DP方程）

   Fib：opt[i] = opt[i-1] + opt[i-2]

   二维路径：opt[i,j] = opt[ i + 1, j] + opt[i, j + 1]

#### 动态规划小结：

1. 打破自己的思维惯性，形成机器思维
2. 理解复杂逻辑的关键
3. 也是职业进阶的要点要领