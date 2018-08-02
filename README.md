# UDC（唯一可译码判决准则）
 - 实验目的
 
 熟悉唯一可译码判决准则，掌握字符串处理程序的设计和调试技术。
 - 实验要求
 
 已知：信源符号个数r、码字集合C。
 输入：任意的一个码。码字个数和每个具体的码字在运行时从键盘输入。
 输出：判决（是唯一可译码/不是唯一可译码）。
 - 实验原理
 
 1、考查<img src="https://latex.codecogs.com/gif.latex?$C$" title="$C$" />中所有的码字，若
 <img src="https://latex.codecogs.com/gif.latex?${W_i}$" title="${W_i}$" />是
 <img src="https://latex.codecogs.com/gif.latex?${W_j}$" title="${W_j}$" />的前缀，则将相应的后缀作为一个尾随后缀码放入集合
 <img src="https://latex.codecogs.com/gif.latex?${F_0}$" title="${F_0}$" />中；
 
 2、考察<img src="https://latex.codecogs.com/gif.latex?$C$" title="$C$" />和
 <img src="https://latex.codecogs.com/gif.latex?${F_i}$" title="${F_i}$" />两个集合，若
 <img src="https://latex.codecogs.com/gif.latex?${W_i}&space;\in&space;C$" title="${W_i} \in C$" />是
 <img src="https://latex.codecogs.com/gif.latex?${W_i}&space;\in&space;{F_i}$" title="${W_i} \in {F_i}$" />的前缀或
 <img src="https://latex.codecogs.com/gif.latex?${W_i}&space;\in&space;{F_i}$" title="${W_i} \in {F_i}$" />是
 <img src="https://latex.codecogs.com/gif.latex?${W_j}&space;\in&space;C$" title="${W_j} \in C$" />的前缀，则将相应的
 后缀作为尾随后缀码放入集合
 <img src="https://latex.codecogs.com/gif.latex?${F_{i&space;&plus;&space;1}}$" title="${F_{i + 1}}$" />中；
 
 3、<img src="https://latex.codecogs.com/gif.latex?$F&space;=&space;\bigcup\limits_i&space;{{F_i}}&space;$" title="$F = \bigcup\limits_i {{F_i}} $" />
 即为码<img src="https://latex.codecogs.com/gif.latex?$C$" title="$C$" />的尾随后缀集合；
 
 4、若<img src="https://latex.codecogs.com/gif.latex?$F$" title="$F$" />中出现了
 <img src="https://latex.codecogs.com/gif.latex?$C$" title="$C$" />中的元素，算法终止，返回假（
 <img src="https://latex.codecogs.com/gif.latex?$C$" title="$C$" />不是唯一可译码）；否则若
 <img src="https://latex.codecogs.com/gif.latex?$F$" title="$F$" />中没有出现新的元素，则返回真。
