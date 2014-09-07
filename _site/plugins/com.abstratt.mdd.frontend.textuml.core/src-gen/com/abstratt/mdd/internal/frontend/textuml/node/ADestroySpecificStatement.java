/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ADestroySpecificStatement extends PSpecificStatement
{
    private TDestroy _destroy_;
    private PRootExpression _rootExpression_;

    public ADestroySpecificStatement()
    {
        // Constructor
    }

    public ADestroySpecificStatement(
        @SuppressWarnings("hiding") TDestroy _destroy_,
        @SuppressWarnings("hiding") PRootExpression _rootExpression_)
    {
        // Constructor
        setDestroy(_destroy_);

        setRootExpression(_rootExpression_);

    }

    @Override
    public Object clone()
    {
        return new ADestroySpecificStatement(
            cloneNode(this._destroy_),
            cloneNode(this._rootExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADestroySpecificStatement(this);
    }

    public TDestroy getDestroy()
    {
        return this._destroy_;
    }

    public void setDestroy(TDestroy node)
    {
        if(this._destroy_ != null)
        {
            this._destroy_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._destroy_ = node;
    }

    public PRootExpression getRootExpression()
    {
        return this._rootExpression_;
    }

    public void setRootExpression(PRootExpression node)
    {
        if(this._rootExpression_ != null)
        {
            this._rootExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rootExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._destroy_)
            + toString(this._rootExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._destroy_ == child)
        {
            this._destroy_ = null;
            return;
        }

        if(this._rootExpression_ == child)
        {
            this._rootExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._destroy_ == oldChild)
        {
            setDestroy((TDestroy) newChild);
            return;
        }

        if(this._rootExpression_ == oldChild)
        {
            setRootExpression((PRootExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
