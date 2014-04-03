/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ATarget extends PTarget
{
    private POperand _operand_;
    private TDot _dot_;

    public ATarget()
    {
        // Constructor
    }

    public ATarget(
        @SuppressWarnings("hiding") POperand _operand_,
        @SuppressWarnings("hiding") TDot _dot_)
    {
        // Constructor
        setOperand(_operand_);

        setDot(_dot_);

    }

    @Override
    public Object clone()
    {
        return new ATarget(
            cloneNode(this._operand_),
            cloneNode(this._dot_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATarget(this);
    }

    public POperand getOperand()
    {
        return this._operand_;
    }

    public void setOperand(POperand node)
    {
        if(this._operand_ != null)
        {
            this._operand_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operand_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operand_)
            + toString(this._dot_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operand_ == child)
        {
            this._operand_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operand_ == oldChild)
        {
            setOperand((POperand) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
