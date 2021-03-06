# Huffman Encoding Algorithm

```
In computer science and information theory, a Huffman code is a particular type 
of optimal prefix code that is commonly used for lossless data compression.
```
\- The source of reference : [Wikipedia](https://en.wikipedia.org/wiki/Huffman_coding)

## 1. Huffman encoding source code
 We have implemented the Huffman coding algorithm in Python code. The reason for this is to compress it into a binary file, which was determined that C or C++ or Python equivalent is more suitable for this purpose. Detailed source code can be found in the "src" directory.
 
- **[main.py](https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/src/main.py)** : main source source code
- **[compress.py](https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/src/compress.py)** : compressing source code
- **[decompress.py](https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/src/decompress.py)** : decompressing source code
- **[util/HeapNode.py](https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/src/util/HeapNode.py)** : Heap's node

## 2. Huffman algorithm operation

<img src="https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/image/01.PNG" width="500">
<img src="https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/image/02.PNG" width="500">
<img src="https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/image/03.PNG" width="500">
<img src="https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/image/04.PNG" width="500">
<img src="https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/image/05.PNG" width="500">
<img src="https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/image/06.PNG" width="500">

- By result of step 6, Huffman code is completed.
- U = 101, V = 01, W = 100, X = 00, Y = 11
- Compression ratio : 100 - (163/576)*100 = 71.7% (compression result = 3*12+2*18+3*7+2*15+2*20 = 163-bits)

## 3. The result of Huffman encoding algorithm

<img src="https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/image/test.PNG">

- Huffman encoding algorithm have a poor compression ratio as the types of data vary.
- If you want to see test-cases, please click the right link or go '/test' directory. [link](https://github.com/KeonHeeLee/Algorithm/tree/master/InSchool/20180420/test)


## 4. Another compressing algorithms
- 7z, LZH, zip, xz, gz, tar(Actually, tar is not compressing algorithm.)
- I compared the data from the test cases with the algorithms presented above.

## 5. Compare Huffman & other algorithms

<img src="https://github.com/KeonHeeLee/Algorithm/blob/master/InSchool/20180420/image/compare.PNG">

- x : other algorithms
- y : test data
- (x,y) : Compression ratio
