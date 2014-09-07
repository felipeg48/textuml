/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleStatementBlock extends PSimpleStatementBlock
{
    private TLCurlyBracket _lCurlyBracket_;
    private PBlockKernel _blockKernel_;
    private TRCurlyBracket _rCurlyBracket_;

    public ASimpleStatementBlock()
    {
        // Constructor
    }

    public ASimpleStatementBlock(
        @SuppressWarnings("hiding") TLCurlyBracket _lCurlyBracket_,
        @SuppressWarnings("hiding") PBlockKernel _blockKernel_,
        @SuppressWarnings("hiding") TRCurlyBracket _rCurlyBracket_)
    {
        // Constructor
        setLCurlyBracket(_lCurlyBracket_);

        setBlockKernel(_blockKernel_);

        setRCurlyBracket(_rCurlyBracket_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleStatementBlock(
            cloneNode(this._lCurlyBracket_),
            cloneNode(this._blockKernel_),
            cloneNode(this._rCurlyBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleStatementBlock(this);
    }

    public TLCurlyBracket getLCurlyBracket()
    {
        return this._lCurlyBracket_;
    }

    public void setLCurlyBracket(TLCurlyBracket node)
    {
        if(this._lCurlyBracket_ != null)
        {
            this._lCurlyBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lCurlyBracket_ = node;
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

    public TRCurlyBracket getRCurlyBracket()
    {
        return this._rCurlyBracket_;
    }

    public void setRCurlyBracket(TRCurlyBracket node)
    {
        if(this._rCurlyBracket_ != null)
        {
            this._rCurlyBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rCurlyBracket_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lCurlyBracket_)
            + toString(this._blockKernel_)
            + toString(this._rCurlyBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lCurlyBracket_ == child)
        {
            this._lCurlyBracket_ = null;
            return;
        }

        if(this._blockKernel_ == child)
        {
            this._blockKernel_ = null;
            return;
        }

        if(this._rCurlyBracket_ == child)
        {
            this._rCurlyBracket_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lCurlyBracket_ == oldChild)
        {
            setLCurlyBracket((TLCurlyBracket) newChild);
            return;
        }

        if(this._blockKernel_ == oldChild)
        {
            setBlockKernel((PBlockKernel) newChild);
            return;
        }

        if(this._rCurlyBracket_ == oldChild)
        {
            setRCurlyBracket((TRCurlyBracket) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
