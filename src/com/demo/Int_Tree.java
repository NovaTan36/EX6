package com.demo;

import java.util.Arrays;

public class Int_Tree {
    Int_Tree left,right;
    int total;
    char c;

    public Int_Tree ()
    {
        left=null;
        right=null;
        total=0;
        c='#';
    }
    public Int_Tree(char c,int total)
    {
        left=null;
        right=null;
        this.total=total;
        this.c=c;
    }

    public void insert(Int_Tree tree)
    {
        if (this.left==null)
        {
            this.left=tree;
        }
        else if(this.right==null)
        {
            this.right=tree;
        }
        if (this.left!=null&&this.right!=null)
        {
            total=left.total+ right.total;
        }
    }
    public void find()
    {
        String s="";
        if(left!=null)
        {
            find(s+"0",this.left);
        }
        if (right!=null)
        {
            find(s+"1",this.right);
        }
    }
    public void find(String s,Int_Tree tree)
    {
        if (tree.c=='#')
        {
            if(tree.left!=null)
            {
                find(s+"0",tree.left);
            }
            if (tree.right!=null)
            {
                find(s+"1",tree.right);
            }
        }
        else
        {
            System.out.println(Arrays.toString(Character.toChars(tree.c)) +"\t"+s);
            //System.out.printf("%c%s", tree.c ,'\t'+s);
            s=s.substring(0,s.length()-1);
        }
    }
}
