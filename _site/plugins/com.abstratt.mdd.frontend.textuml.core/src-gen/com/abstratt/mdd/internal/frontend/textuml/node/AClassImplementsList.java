/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import java.util.*;
import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AClassImplementsList extends PClassImplementsList
{
    private PClassImplementsItem _classImplementsItem_;
    private final LinkedList<PClassImplementsListTail> _classImplementsListTail_ = new LinkedList<PClassImplementsListTail>();

    public AClassImplementsList()
    {
        // Constructor
    }

    public AClassImplementsList(
        @SuppressWarnings("hiding") PClassImplementsItem _classImplementsItem_,
        @SuppressWarnings("hiding") List<PClassImplementsListTail> _classImplementsListTail_)
    {
        // Constructor
        setClassImplementsItem(_classImplementsItem_);

        setClassImplementsListTail(_classImplementsListTail_);

    }

    @Override
    public Object clone()
    {
        return new AClassImplementsList(
            cloneNode(this._classImplementsItem_),
            cloneList(this._classImplementsListTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassImplementsList(this);
    }

    public PClassImplementsItem getClassImplementsItem()
    {
        return this._classImplementsItem_;
    }

    public void setClassImplementsItem(PClassImplementsItem node)
    {
        if(this._classImplementsItem_ != null)
        {
            this._classImplementsItem_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classImplementsItem_ = node;
    }

    public LinkedList<PClassImplementsListTail> getClassImplementsListTail()
    {
        return this._classImplementsListTail_;
    }

    public void setClassImplementsListTail(List<PClassImplementsListTail> list)
    {
        this._classImplementsListTail_.clear();
        this._classImplementsListTail_.addAll(list);
        for(PClassImplementsListTail e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classImplementsItem_)
            + toString(this._classImplementsListTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classImplementsItem_ == child)
        {
            this._classImplementsItem_ = null;
            return;
        }

        if(this._classImplementsListTail_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._classImplementsItem_ == oldChild)
        {
            setClassImplementsItem((PClassImplementsItem) newChild);
            return;
        }

        for(ListIterator<PClassImplementsListTail> i = this._classImplementsListTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PClassImplementsListTail) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
