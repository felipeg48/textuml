/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AWordyBlock extends PWordyBlock
{
    private TBegin _begin_;
    private PBlockKernel _blockKernel_;
    private TEnd _end_;

    public AWordyBlock()
    {
        // Constructor
    }

    public AWordyBlock(
        @SuppressWarnings("hiding") TBegin _begin_,
        @SuppressWarnings("hiding") PBlockKernel _blockKernel_,
        @SuppressWarnings("hiding") TEnd _end_)
    {
        // Constructor
        setBegin(_begin_);

        setBlockKernel(_blockKernel_);

        setEnd(_end_);

    }

    @Override
    public Object clone()
    {
        return new AWordyBlock(
            cloneNode(this._begin_),
            cloneNode(this._blockKernel_),
            cloneNode(this._end_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWordyBlock(this);
    }

    public TBegin getBegin()
    {
        return this._begin_;
    }

    public void setBegin(TBegin node)
    {
        if(this._begin_ != null)
        {
            this._begin_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._begin_ = node;
    }

    public PBlockKernel getBlockKernel()
    {
        return this._blockKernel_;
    }

    public void setBlockKernel(PBlockKernel node)
    {
        if(this._blockKernel_ != null)
        {
            this._blockKernel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blockKernel_ = node;
    }

    public TEnd getEnd()
    {
        return this._end_;
    }

    public void setEnd(TEnd node)
    {
        if(this._end_ != null)
        {
            this._end_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._end_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._begin_)
            + toString(this._blockKernel_)
            + toString(this._end_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._begin_ == child)
        {
            this._begin_ = null;
            return;
        }

        if(this._blockKernel_ == child)
        {
            this._blockKernel_ = null;
            return;
        }

        if(this._end_ == child)
        {
            this._end_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._begin_ == oldChild)
        {
            setBegin((TBegin) newChild);
            return;
        }

        if(this._blockKernel_ == oldChild)
        {
            setBlockKernel((PBlockKernel) newChild);
            return;
        }

        if(this._end_ == oldChild)
        {
            setEnd((TEnd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
