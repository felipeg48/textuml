/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ADetachedOperationDef extends PDetachedOperationDef
{
    private PDetachedOperationHeader _detachedOperationHeader_;
    private PBehavioralFeatureBody _behavioralFeatureBody_;

    public ADetachedOperationDef()
    {
        // Constructor
    }

    public ADetachedOperationDef(
        @SuppressWarnings("hiding") PDetachedOperationHeader _detachedOperationHeader_,
        @SuppressWarnings("hiding") PBehavioralFeatureBody _behavioralFeatureBody_)
    {
        // Constructor
        setDetachedOperationHeader(_detachedOperationHeader_);

        setBehavioralFeatureBody(_behavioralFeatureBody_);

    }

    @Override
    public Object clone()
    {
        return new ADetachedOperationDef(
            cloneNode(this._detachedOperationHeader_),
            cloneNode(this._behavioralFeatureBody_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADetachedOperationDef(this);
    }

    public PDetachedOperationHeader getDetachedOperationHeader()
    {
        return this._detachedOperationHeader_;
    }

    public void setDetachedOperationHeader(PDetachedOperationHeader node)
    {
        if(this._detachedOperationHeader_ != null)
        {
            this._detachedOperationHeader_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._detachedOperationHeader_ = node;
    }

    public PBehavioralFeatureBody getBehavioralFeatureBody()
    {
        return this._behavioralFeatureBody_;
    }

    public void setBehavioralFeatureBody(PBehavioralFeatureBody node)
    {
        if(this._behavioralFeatureBody_ != null)
        {
            this._behavioralFeatureBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._behavioralFeatureBody_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._detachedOperationHeader_)
            + toString(this._behavioralFeatureBody_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._detachedOperationHeader_ == child)
        {
            this._detachedOperationHeader_ = null;
            return;
        }

        if(this._behavioralFeatureBody_ == child)
        {
            this._behavioralFeatureBody_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._detachedOperationHeader_ == oldChild)
        {
            setDetachedOperationHeader((PDetachedOperationHeader) newChild);
            return;
        }

        if(this._behavioralFeatureBody_ == oldChild)
        {
            setBehavioralFeatureBody((PBehavioralFeatureBody) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
