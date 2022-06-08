package com.demo;

import java.util.Scanner;

public class HuffmanEncoding {

    Scanner s=new Scanner(System.in);
    Int_Tree_LinkedList list =new Int_Tree_LinkedList();
    public HuffmanEncoding()
    {
        System.out.print("请输入要编码的单个字符的总数：");
        int flag=s.nextInt();
        System.out.println("请输入对应的字符及其出现次数，使用,分割（a,10,）");
        String notdo =s.next();
        String[] str =notdo.split(",");

        for (int i = 0; i < flag*2; i+=2)
        {
            list.sortInsert(new Int_Tree_LinkedList(new Int_Tree(str[i].toCharArray()[0],Integer.parseInt(str[i+1]))));
        }
        Encoding();
    }

    public void Encoding()
    {
        while(list.next.next!=null)
        {
            Int_Tree_LinkedList n =new Int_Tree_LinkedList(new Int_Tree());
            n.tree.insert(list.next.tree);
            n.tree.insert(list.next.next.tree);
            list.del_next();
            list.del_next();
            list.sortInsert(n);
        }
        list.next.tree.find();
    }
}
