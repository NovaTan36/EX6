package com.demo;

public class Int_Tree_LinkedList {
    Int_Tree tree=null;
    Int_Tree_LinkedList next=null,top=null;
    public Int_Tree_LinkedList(Int_Tree tree)
    {
        this.tree=tree;
    }

    public Int_Tree_LinkedList() {}
    public void sortInsert(Int_Tree_LinkedList tlist)         //升序排序
    {
        if (this.next==null)insert(tlist);
        else
        {
            if (this.next.tree.total<= tlist.tree.total)this.next.sortInsert(tlist);
            else insert(tlist);
        }
    }

    public void insert(Int_Tree_LinkedList tlist)
    {
        if(this.next==null)
        {
            this.next=tlist;
            tlist.top=this;
        }
        else
        {
            tlist.sortInsert(this.next);
            this.next=tlist;
            tlist.top=this;
        }
    }

    public void del_next()
    {
        Int_Tree_LinkedList i=this.next;
        if(i.next!=null)
        {
            i.next.top=this;
        }
        this.next=i.next;
        i.top=null;
        i.next=null;

    }
}
