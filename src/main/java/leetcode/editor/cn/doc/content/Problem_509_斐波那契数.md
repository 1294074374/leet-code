<p><strong>斐波那契数</strong>，通常用 <code>F(n)</code> 表示，形成的序列称为 <strong>斐波那契数列</strong> 。该数列由 <code>0</code> 和 <code>1</code> 开始，后面的每一项数字都是前面两项数字的和。也就是：</p>

<pre>
F(0) = 0，F(1) = 1
F(n) = F(n - 1) + F(n - 2)，其中 n > 1
</pre>

<p>给你 <code>n</code> ，请计算 <code>F(n)</code> 。</p>

<p> </p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>2
<strong>输出：</strong>1
<strong>解释：</strong>F(2) = F(1) + F(0) = 1 + 0 = 1
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>3
<strong>输出：</strong>2
<strong>解释：</strong>F(3) = F(2) + F(1) = 1 + 1 = 2
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>4
<strong>输出：</strong>3
<strong>解释：</strong>F(4) = F(3) + F(2) = 2 + 1 = 3
</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>0 <= n <= 30</code></li>
</ul>
<div><div>Related Topics</div><div><li>递归</li><li>记忆化搜索</li><li>数学</li><li>动态规划</li></div></div><br><div><li>👍 335</li><li>👎 0</li></div>