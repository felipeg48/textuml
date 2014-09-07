/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ATupleTypeSlotTail extends PTupleTypeSlotTail
{
    private TComma _comma_;
    private PTupleTypeSlot _tupleTypeSlot_;
    private PTupleTypeSlotTail _tupleTypeSlotTail_;

    public ATupleTypeSlotTail()
    {
        // Constructor
    }

    public ATupleTypeSlotTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PTupleTypeSlot _tupleTypeSlot_,
        @SuppressWarnings("hiding") PTupleTypeSlotTail _tupleTypeSlotTail_)
    {
        // Constructor
        setComma(_comma_);

        setTupleTypeSlot(_tupleTypeSlot_);

        setTupleTypeSlotTail(_tupleTypeSlotTail_);

    }

    @Override
    public Object clone()
    {
        return new ATupleTypeSlotTail(
            cloneNode(this._comma_),
            cloneNode(this._tupleTypeSlot_),
            cloneNode(this._tupleTypeSlotTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATupleTypeSlotTail(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PTupleTypeSlot getTupleTypeSlot()
    {
        return this._tupleTypeSlot_;
    }

    public void setTupleTypeSlot(PTupleTypeSlot node)
    {
        if(this._tupleTypeSlot_ != null)
        {
            this._tupleTypeSlot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tupleTypeSlot_ = node;
    }

    public PTupleTypeSlotTail getTupleTypeSlotTail()
    {
        return this._tupleTypeSlotTail_;
    }

    public void setTupleTypeSlotTail(PTupleTypeSlotTail node)
    {
        if(this._tupleTypeSlotTail_ != null)
        {
            this._tupleTypeSlotTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tupleTypeSlotTail_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._tupleTypeSlot_)
            + toString(this._tupleTypeSlotTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._tupleTypeSlot_ == child)
        {
            this._tupleTypeSlot_ = null;
            return;
        }

        if(this._tupleTypeSlotTail_ == child)
        {
            this._tupleTypeSlotTail_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._tupleTypeSlot_ == oldChild)
        {
            setTupleTypeSlot((PTupleTypeSlot) newChild);
            return;
        }

        if(this._tupleTypeSlotTail_ == oldChild)
        {
            setTupleTypeSlotTail((PTupleTypeSlotTail) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
