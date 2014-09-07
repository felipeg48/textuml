/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AInvariantDecl extends PInvariantDecl
{
    private PInvariantKernel _invariantKernel_;
    private TSemicolon _semicolon_;

    public AInvariantDecl()
    {
        // Constructor
    }

    public AInvariantDecl(
        @SuppressWarnings("hiding") PInvariantKernel _invariantKernel_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setInvariantKernel(_invariantKernel_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AInvariantDecl(
            cloneNode(this._invariantKernel_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInvariantDecl(this);
    }

    public PInvariantKernel getInvariantKernel()
    {
        return this._invariantKernel_;
    }

    public void setInvariantKernel(PInvariantKernel node)
    {
        if(this._invariantKernel_ != null)
        {
            this._invariantKernel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._invariantKernel_ = node;
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
            + toString(this._invariantKernel_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._invariantKernel_ == child)
        {
            this._invariantKernel_ = null;
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
        if(this._invariantKernel_ == oldChild)
        {
            setInvariantKernel((PInvariantKernel) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
