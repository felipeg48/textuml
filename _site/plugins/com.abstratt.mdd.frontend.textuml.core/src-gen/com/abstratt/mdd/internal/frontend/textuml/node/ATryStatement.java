/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ATryStatement extends PTryStatement
{
    private TTry _try_;
    private PBlockKernel _protectedBlock_;
    private PCatchSection _catchSection_;
    private PFinallySection _finallySection_;
    private TEnd _end_;

    public ATryStatement()
    {
        // Constructor
    }

    public ATryStatement(
        @SuppressWarnings("hiding") TTry _try_,
        @SuppressWarnings("hiding") PBlockKernel _protectedBlock_,
        @SuppressWarnings("hiding") PCatchSection _catchSection_,
        @SuppressWarnings("hiding") PFinallySection _finallySection_,
        @SuppressWarnings("hiding") TEnd _end_)
    {
        // Constructor
        setTry(_try_);

        setProtectedBlock(_protectedBlock_);

        setCatchSection(_catchSection_);

        setFinallySection(_finallySection_);

        setEnd(_end_);

    }

    @Override
    public Object clone()
    {
        return new ATryStatement(
            cloneNode(this._try_),
            cloneNode(this._protectedBlock_),
            cloneNode(this._catchSection_),
            cloneNode(this._finallySection_),
            cloneNode(this._end_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATryStatement(this);
    }

    public TTry getTry()
    {
        return this._try_;
    }

    public void setTry(TTry node)
    {
        if(this._try_ != null)
        {
            this._try_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._try_ = node;
    }

    public PBlockKernel getProtectedBlock()
    {
        return this._protectedBlock_;
    }

    public void setProtectedBlock(PBlockKernel node)
    {
        if(this._protectedBlock_ != null)
        {
            this._protectedBlock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._protectedBlock_ = node;
    }

    public PCatchSection getCatchSection()
    {
        return this._catchSection_;
    }

    public void setCatchSection(PCatchSection node)
    {
        if(this._catchSection_ != null)
        {
            this._catchSection_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._catchSection_ = node;
    }

    public PFinallySection getFinallySection()
    {
        return this._finallySection_;
    }

    public void setFinallySection(PFinallySection node)
    {
        if(this._finallySection_ != null)
        {
            this._finallySection_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._finallySection_ = node;
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
            + toString(this._try_)
            + toString(this._protectedBlock_)
            + toString(this._catchSection_)
            + toString(this._finallySection_)
            + toString(this._end_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._try_ == child)
        {
            this._try_ = null;
            return;
        }

        if(this._protectedBlock_ == child)
        {
            this._protectedBlock_ = null;
            return;
        }

        if(this._catchSection_ == child)
        {
            this._catchSection_ = null;
            return;
        }

        if(this._finallySection_ == child)
        {
            this._finallySection_ = null;
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
        if(this._try_ == oldChild)
        {
            setTry((TTry) newChild);
            return;
        }

        if(this._protectedBlock_ == oldChild)
        {
            setProtectedBlock((PBlockKernel) newChild);
            return;
        }

        if(this._catchSection_ == oldChild)
        {
            setCatchSection((PCatchSection) newChild);
            return;
        }

        if(this._finallySection_ == oldChild)
        {
            setFinallySection((PFinallySection) newChild);
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
