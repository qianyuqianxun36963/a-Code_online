#coding=gbk

#模块管理

'''
一般来说，一个Python程序包含了多个含有Python语句的文本文件。程序是作为一个主体的，顶层的文件来构造的，配合有零个或多个支持的文件，在Python中这些文件称作模块。
顶层文件就是你需要运行来启动应用的文件。模块文件就是工具库。顶层文件使用了在模块中定义的工具。

'''

'''
一.模块的引入
　　在Python中用关键字import来引入某个模块，比如要引用模块math，就可以在文件最开始的地方用import math来引入。在调用math模块中的函数时，必须这样引用：
　　模块名.函数名
'''

#方式一，全模块引入
import math
print (math.sqrt(2))


'''
有时候我们只需要用到模块中的某个函数，只需要引入该函数或常量即可，此时可以通过语句
　　from 模块名 import 函数名1,函数名2....
'''
#方式二，仅引用一些方法等
from math import sqrt
#from math import * 这样相当于方式一
#print (math.sqrt(2)) 此时，不能用math.sqrt的方式调用了。
print (sqrt(2))

'''
在Python中，每个Python文件都可以作为一个模块，模块的名字就是文件的名字。
在用import引入模块时，会将引入的模块文件中的代码执行一次。但是注意，只在第一次引入时才会执行模块文件中的代码，因为只在第一次引入时进行加载.
'''
import module
'''
这里没有做任何事情，仅引入，但是会有代码被执行。
'''


