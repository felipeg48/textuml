/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import java.util.*;
import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AVarDeclSection extends PVarDeclSection
{
    private TVar _var_;
    private PVarDecl _varDecl_;
    private final LinkedList<PVarListTail> _varListTail_ = new LinkedList<PVarListTail>();
    private TSemicolon _semicolon_;

    public AVarDeclSection()
    {
        // Constructor
    }

    public AVarDeclSection(
        @SuppressWarnings("hiding") TVar _var_,
        @SuppressWarnings("hiding") PVarDecl _varDecl_,
        @SuppressWarnings("hiding") List<PVarListTail> _varListTail_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setVar(_var_);

        setVarDecl(_varDecl_);

        setVarListTail(_varListTail_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AVarDeclSection(
            cloneNode(this._var_),
            cloneNode(this._varDecl_),
            cloneList(this._varListTail_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarDeclSection(this);
    }

    public TVar getVar()
    {
        return this._var_;
    }

    public void setVar(TVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public PVarDecl getVarDecl()
    {
        return this._varDecl_;
    }

    public void setVarDecl(PVarDecl node)
    {
        if(this._varDecl_ != null)
        {
            this._varDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varDecl_ = node;
    }

    public LinkedList<PVarListTail> getVarListTail()
    {
        return this._varListTail_;
    }

    public void setVarListTail(List<PVarListTail> list)
    {
        this._varListTail_.clear();
        this._varListTail_.addAll(list);
        for(PVarListTail e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._var_)
            + toString(this._varDecl_)
            + toString(this._varListTail_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._varDecl_ == child)
        {
            this._varDecl_ = null;
            return;
        }

        if(this._varListTail_.remove(child))
        {
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._var_ == oldChild)
        {
            setVar((TVar) newChild);
            return;
        }

        if(this._varDecl_ == oldChild)
        {
            setVarDecl((PVarDecl) newChild);
            return;
        }

        for(ListIterator<PVarListTail> i = this._varListTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PVarListTail) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
