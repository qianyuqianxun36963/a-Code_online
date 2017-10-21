package 难.树;

import java.util.Stack;    
    
public class 树的遍历 {    
    private char date;    
    private 树的遍历 lchild;    
    private 树的遍历 rchild;    
    
    public 树的遍历(char c) {    
        date = c;    
    }    
    
    // 先序遍历递归     
    public static void preOrder(树的遍历 t) {    
        if (t == null) {    
            return;    
        }    
        System.out.print(t.date);    
        preOrder(t.lchild);    
        preOrder(t.rchild);    
    }    
    
    // 中序遍历递归     
    public static void InOrder(树的遍历 t) {    
        if (t == null) {    
            return;    
        }    
        InOrder(t.lchild);    
        System.out.print(t.date);    
        InOrder(t.rchild);    
    }    
    
    // 后序遍历递归     
    public static void PostOrder(树的遍历 t) {    
        if (t == null) {    
            return;    
        }    
        PostOrder(t.lchild);    
        PostOrder(t.rchild);    
        System.out.print(t.date);    
    }    
    
    // 先序遍历非递归     
    public static void preOrder2(树的遍历 t) {    
        Stack<树的遍历> s = new Stack<树的遍历>();    
        while (t != null || !s.empty()) {    
            while (t != null) {    
                System.out.print(t.date);    
                s.push(t);    
                t = t.lchild;    
            }    
            if (!s.empty()) {    
                t = s.pop();    
                t = t.rchild;    
            }    
        }    
    }    
    
    // 中序遍历非递归     
    public static void InOrder2(树的遍历 t) {    
        Stack<树的遍历> s = new Stack<树的遍历>();    
        while (t != null || !s.empty()) {    
            while (t != null) {    
                s.push(t);    
                t = t.lchild;    
            }    
            if (!s.empty()) {    
                t = s.pop();    
                System.out.print(t.date);    
                t = t.rchild;    
            }    
        }    
    }    
    
    // 后序遍历非递归     
    public static void PostOrder2(树的遍历 t) {    
        Stack<树的遍历> s = new Stack<树的遍历>();    
        Stack<Integer> s2 = new Stack<Integer>();    
        Integer i = new Integer(1);    
        while (t != null || !s.empty()) {    
            while (t != null) {    
                s.push(t);    
                s2.push(new Integer(0));    
                t = t.lchild;    
            }    
            while (!s.empty() && s2.peek().equals(i)) {    
                s2.pop();    
                System.out.print(s.pop().date);    
            }    
    
            if (!s.empty()) {    
                s2.pop();    
                s2.push(new Integer(1));    
                t = s.peek();    
                t = t.rchild;    
            }    
        }    
    }    
    
    public static void main(String[] args) {    
		        树的遍历 b1 = new 树的遍历('a');    
		        树的遍历 b2 = new 树的遍历('b');    
		        树的遍历 b3 = new 树的遍历('c');    
		        树的遍历 b4 = new 树的遍历('d');    
		        树的遍历 b5 = new 树的遍历('e');    
    
	        /**  
	         *      a   
	         *     / \
	         *    b   c  
	         *   / \  
	         *  d   e  
	         */    
	        b1.lchild = b2;    
	        b1.rchild = b3;    
	        b2.lchild = b4;    
	        b2.rchild = b5;    
    
		        树的遍历.preOrder(b1);    
		        System.out.println();    
		        树的遍历.preOrder2(b1);    
		        System.out.println();    
		        树的遍历.InOrder(b1);    
		        System.out.println();    
		        树的遍历.InOrder2(b1);    
		        System.out.println();    
		        树的遍历.PostOrder(b1);    
		        System.out.println();    
		        树的遍历.PostOrder2(b1);    
    }    
}    